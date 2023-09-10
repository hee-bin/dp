package AfterState;

/**
 * LunchState 클래스는 State 인터페이스를 구현하여 Lunch 상태의 동작을 정의합니다.
 * @author heebin
 */
public class LunchState implements State {

    @Override
    public void doUse(Context context) {
        context.recordLog("Use the Safe (Lunch)");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("Emergency Alarm(Lunch)");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("Call(Lunch)");
    }

    @Override
    public String toString() {
        return "[Lunch]";
    }
}
