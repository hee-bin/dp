package Bridge;



/**
 * Display 클래스는 DisplayImpl을 가지고 표시 기능을 제공합니다.
 */
public class Display {
    private DisplayImpl impl;

    /**
     * 주어진 DisplayImpl 구현체를 사용하여 Display 객체를 생성합니다.
     * @param impl DisplayImpl 구현체
     */
    public Display(DisplayImpl impl) {
        this.impl = impl;
    }

    /**
     * DisplayImpl을 사용하여 표시를 엽니다.
     */
    public void open() {
        impl.rawOpen();
    }

    /**
     * DisplayImpl을 사용하여 표시합니다.
     */
    public void print() {
        impl.rawPrint();
    }

    /**
     * DisplayImpl을 사용하여 표시를 닫습니다.
     */
    public void close() {
        impl.rawClose();
    }

    /**
     * 표시를 열고, 출력하고, 닫는 과정을 순서대로 수행합니다.
     */
    public final void display() {
        open();
        print();
        close();
    }
}
