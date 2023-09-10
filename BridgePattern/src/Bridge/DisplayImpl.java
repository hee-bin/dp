package Bridge;



/**
 * DisplayImpl 클래스는 Display의 구현을 제공합니다.
 */
public abstract class DisplayImpl {

    /**
     * 표시를 엽니다.
     */
    public abstract void rawOpen();

    /**
     * 표시를 출력합니다.
     */
    public abstract void rawPrint();

    /**
     * 표시를 닫습니다.
     */
    public abstract void rawClose();
}
