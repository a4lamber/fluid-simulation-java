
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    
    public boolean equals(Object compared){
        /*
        比较顺序如下:
        1. 比较variable中存的reference指向的memory location中存的东西是否一样
        2. 判断data type是否相同, 若不相同 false
        3. 判断这俩data type相同的object中的每一项attributes是否相同
        */
        // 1
        if (this == compared) {
            return true;
        }
        
        // 2
        if (!(compared instanceof Song)) {
            return false;
        }
        
        // 3 
        Song comparedSong = (Song) compared;
        
        if (this.artist == comparedSong.artist &&
            this.durationInSeconds == comparedSong.durationInSeconds &&
            this.name == comparedSong.name) {
            
            return true;
        }
        
        // otherwise the objects are not equal
        return false;
    }
    
    
    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
