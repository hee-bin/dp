package AfterState;

/**
 * NightState 클래스는 State 인터페이스를 구현하여 Night 상태의 동작을 정의합니다.
 * @author heebin
 */
public class NightState implements State {

    @Override
    public void doUse(Context context) {
        context.recordLog("Use the Safe (Night)");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("Emergency Alarm(Night)");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("Call(Night)");
    }

    @Override
    public String toString() {
        return "[Night]";
    }
}