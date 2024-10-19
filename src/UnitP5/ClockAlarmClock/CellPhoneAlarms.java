package UnitP5.ClockAlarmClock;

import java.time.LocalDateTime;

public class CellPhoneAlarms {
    private Clock[] allClocks = new Clock[10];
    private int nextIndex = 0;
    public void addAlarm(int h, int m){
        allClocks[nextIndex] = new AlarmClock(LocalDateTime.now().getHour(),
                LocalDateTime.now().getMinute(), h, m);
        nextIndex++;
    }

    public void addClock(int timezone){
        allClocks[nextIndex] = new Clock(LocalDateTime.now().getHour()+timezone,
                LocalDateTime.now().getMinute());
    }
}
