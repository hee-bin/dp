package AfterState;


/**
 * Context 인터페이스는 시스템의 상태와 시간을 설정하고, 경비 센터를 호출하며, 기록하는 역할을 정의합니다.
 * @author heebin
 */
public interface Context {
    /**
     * 시간을 설정합니다.
     *
     * @param hour 시간 (0-23)
     */
    public abstract void setClock(int hour);

    /**
     * 상태를 전환합니다.
     *
     * @param stateEnum 전환할 상태를 나타내는 StateEnum 값
     */
    public abstract void changeState(StateEnum stateEnum);

    /**
     * 경비 센터에 경비원을 호출합니다.
     *
     * @param msg 호출 메시지
     */
    public abstract void callSecurityCenter(String msg);

    /**
     * 경비 센터에 기록을 남깁니다.
     *
     * @param msg 기록 메시지
     */
    public abstract void recordLog(String msg);
}
