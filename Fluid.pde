final int N = 256;
final int iter = 10;


int IX (int x, int y) {
    // 2D location of the array
    return x + y * N;
} 

// fluid cube
class Fluid {
    int size;   // size of computational domain
    float dt;   // timestep
    float diff; // diffusion 
    float visc; // viscosity of the fluid
    
    float[] s; 
    float[] density;
    
    float[] Vx; //current velocity in x-direction
    float[] Vy; //current velocity in y-direction
    
    float[] Vx0; //prev velocity in x-direction
    float[] Vy0; //prev velocity in y-direction
    
    // constructor
    Fuild(float dt, float diffusion, float viscosity) {
        this.size = N;
        this.dt = dt;
        this.diff = diffusion;
        this.visc = viscosity;
        
        this.s = new float[N*N];
        this.density = new float[N*N];
    
        this.Vx = new float[N*N];
        this.Vy = new float[N*N];
        
        this.Vx0 = new float[N*N];
        this.Vy0 = new float[N*N];
        
    }

    // methods

    // add density(dye) to the spot
    // 更新一个网格内的密度；
    void addDensity(int x, int y, float amount) {
        int index = IX(x,y);
        this.density[index] += amount;
    }

    // add velocity at certain index
    // 更新一个网格内的x和y方向上的速度;
    void addVelocity(int x, int y, float amountX, float amountY) {
        int index = IX(x,y);
        this.Vx[index] += amountX;
        this.Vy[index] += amountY;
    }
}

// diffuse static function
static void diffuse (int b, float[] x, float[] x0, float diff, float dt)
{
    float a = dt * diff * (N - 2) * (N - 2);
    lin_solve(b, x, x0, a, 1 + 6 * a, iter, N);  // linear solver - gaussian-seidel
}


// linear solver
static void lin_solve(int b, float[] x, float[] x0, float a, float c)
{
    float cRecip = 1.0 / c;
    for (int k = 0; k < iter; k++) {
            for (int j = 1; j < N - 1; j++) {
                for (int i = 1; i < N - 1; i++) {
                    x[IX(i, j)] =
                        (x0[IX(i, j)]
                            + a*(    x[IX(i+1, j)]
                                    +x[IX(i-1, j)]
                                    +x[IX(i  , j+1)]
                                    +x[IX(i  , j-1)]
                                    +x[IX(i  , j)]
                                    +x[IX(i  , j)]
                           )) * cRecip;
                }
            }
        }
        set_bnd(b, x, N);
}



// 
static void project(float[] velocX, float[] velocY, float[] p, float[] div)
{
    for (int j = 1; j < N - 1; j++) {
        for (int i = 1; i < N - 1; i++) {
            div[IX(i, j, k)] = -0.5f*(
                        velocX[IX(i+1, j  , k  )]
                    -velocX[IX(i-1, j  , k  )]
                    +velocY[IX(i  , j+1, k  )]
                    -velocY[IX(i  , j-1, k  )]
                )/N;
            p[IX(i, j, k)] = 0;
        }
    }

    // set up boundary condition    
    set_bnd(0, div); 
    set_bnd(0, p);
    lin_solve(0, p, div, 1, 6); // call the linear solver
    
    for (int j = 1; j < N - 1; j++) {
        for (int i = 1; i < N - 1; i++) {
            velocX[IX(i, j)] -= 0.5f * (  p[IX(i+1, j)]
                                            -p[IX(i-1, j)]) * N;
            velocY[IX(i, j)] -= 0.5f * (  p[IX(i, j+1)]
                                            -p[IX(i, j-1)]) * N;
        }
    }

    set_bnd(1, velocX, N);
    set_bnd(2, velocY, N);
}



// advection: move bulk 

static void advect(int b, float[] d, float[] d0,  float[] velocX, float[] velocY)
{
    float i0, i1, j0, j1;
    
    float dtx = dt * (N - 2);
    float dty = dt * (N - 2);
    
    float s0, s1, t0, t1;
    float tmp1, tmp2, x, y;
    
    float Nfloat = N;
    float ifloat, jfloat;
    int i, j;
    
        for(j = 1, jfloat = 1; j < N - 1; j++, jfloat++) { 
            for(i = 1, ifloat = 1; i < N - 1; i++, ifloat++) {
                tmp1 = dtx * velocX[IX(i, j, k)];
                tmp2 = dty * velocY[IX(i, j, k)];
                x    = ifloat - tmp1; 
                y    = jfloat - tmp2;
                
                if(x < 0.5f) x = 0.5f; 
                if(x > Nfloat + 0.5f) x = Nfloat + 0.5f; 
                i0 = floor(x); 
                i1 = i0 + 1.0f;
                if(y < 0.5f) y = 0.5f; 
                if(y > Nfloat + 0.5f) y = Nfloat + 0.5f; 
                j0 = floor(y);
                j1 = j0 + 1.0f; 

                
                s1 = x - i0; 
                s0 = 1.0f - s1; 
                t1 = y - j0; 
                t0 = 1.0f - t1;

                
                int i0i = itn(i0);
                int i1i = int(i1);
                int j0i = int(j0);
                int j1i = int(j1);

                // double checjk this
                d[IX(i, j)] = 
                    s0 * ( t0 * d0[IX(i01,j01)])
                       + ( t1 * d0[IX(i0i,j1i)])
                   +s1 * ( t0 * d0[IX(i01,j01)])
                        +( t1 * d0[IX(i1i,j1j)])
        }
    set_bnd(b, d, N);
}


// set up the boundary conditions
static void set_bnd(int b, float[] x)
{
    for(int k = 1; k < N - 1; k++) {
        for(int i = 1; i < N - 1; i++) {
            x[IX(i, 0  )] = b == 2 ? -x[IX(i, 1  )] : x[IX(i, 1  )];
            x[IX(i, N-1)] = b == 2 ? -x[IX(i, N-2)] : x[IX(i, N-2)];
        }
    }
    for(int k = 1; k < N - 1; k++) {
        for(int j = 1; j < N - 1; j++) {
            x[IX(0  , j)] = b == 1 ? -x[IX(1  , j)] : x[IX(1  , j)];
            x[IX(N-1, j)] = b == 1 ? -x[IX(N-2, j)] : x[IX(N-2, j)];
        }
    }
    
    x[IX(0, 0, 0)]       = 0.33f * (x[IX(1, 0, 0)]
                                  + x[IX(0, 1, 0)]
                                  + x[IX(0, 0, 1)]);
    x[IX(0, N-1, 0)]     = 0.33f * (x[IX(1, N-1, 0)]
                                  + x[IX(0, N-2, 0)]
                                  + x[IX(0, N-1, 1)]);
    x[IX(0, 0, N-1)]     = 0.33f * (x[IX(1, 0, N-1)]
                                  + x[IX(0, 1, N-1)]
                                  + x[IX(0, 0, N)]);
    x[IX(0, N-1, N-1)]   = 0.33f * (x[IX(1, N-1, N-1)]
                                  + x[IX(0, N-2, N-1)]
                                  + x[IX(0, N-1, N-2)]);
    x[IX(N-1, 0, 0)]     = 0.33f * (x[IX(N-2, 0, 0)]
                                  + x[IX(N-1, 1, 0)]
                                  + x[IX(N-1, 0, 1)]);
    x[IX(N-1, N-1, 0)]   = 0.33f * (x[IX(N-2, N-1, 0)]
                                  + x[IX(N-1, N-2, 0)]
                                  + x[IX(N-1, N-1, 1)]);
    x[IX(N-1, 0, N-1)]   = 0.33f * (x[IX(N-2, 0, N-1)]
                                  + x[IX(N-1, 1, N-1)]
                                  + x[IX(N-1, 0, N-2)]);
    x[IX(N-1, N-1, N-1)] = 0.33f * (x[IX(N-2, N-1, N-1)]
                                  + x[IX(N-1, N-2, N-1)]
                                  + x[IX(N-1, N-1, N-2)]);
}