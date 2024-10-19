package UnitP5.ClockAlarmClock;

public class AlarmClock extends Clock {
    private int aHours, aMin;

    public AlarmClock(int h, int m, int ah, int am){
        super(h,m);
        this.aHours = ah;
        this.aMin = am;
    }

    public void setDefault(){
        this.aMin = 0;
        this.aHours = 5;
    }

    @Override
    public void advance(){
        super.advance();
        if(this.getHours() == aHours && this.getMins() == aMin){
            System.out.println("Alert!!!!");
            setDefault();
        }
    }

}
