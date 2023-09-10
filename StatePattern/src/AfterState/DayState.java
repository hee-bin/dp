package AfterState;

/**
 * DayState 클래스는 State 인터페이스를 구현하여 Day 상태의 동작을 정의합니다.
 * @author heebin
 */
public class DayState implements State {

    @Override
    public void doUse(Context context) {
        context.recordLog("Use the Safe (Day)");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("Emergency Alarm(Day)");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("Call(Day)");
    }

    @Override
    public String toString() {
        return "[Day]";
    }
}
