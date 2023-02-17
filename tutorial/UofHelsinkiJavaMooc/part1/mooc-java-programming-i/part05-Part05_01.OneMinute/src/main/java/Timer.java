/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yixiangzhang
 */
public class Timer {
    // attributes
    private ClockHand seconds;
    private ClockHand hundredthOfSeconds;
    
    
    // constructor, set the limit for both clock hands
    public Timer() {
        this.seconds = new ClockHand(60);
        this.hundredthOfSeconds = new ClockHand(100);   
    }
    
    // methods
    public void advance() {
        
        this.hundredthOfSeconds.advance();
        
        // 判断是否走过一圈, 走过则下一个clockhand往前走一步
        if (this.hundredthOfSeconds.value() == 0) {
            this.seconds.advance();
        }
        
    }

    @Override
    public String toString() {
        return seconds + ":"+  hundredthOfSeconds;
    }
    
}
