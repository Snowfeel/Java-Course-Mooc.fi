public class Timer {
    private ClockHand second;
    private ClockHand millisecond;

    public Timer() {
        this.second = new ClockHand(60);
        this.millisecond = new ClockHand(100);
    }

    public void advance(){
        this.millisecond.advance();

        if (millisecond.value() == 0){
            this.second.advance();
        }
    }

    public String toString(){
        return second + ":"+ millisecond;
    }
}
