package Bridge;


/**
 * StringDisplayImpl 클래스는 DisplayImpl을 확장하여 문자열을 이용한 표시 기능을 제공합니다.
 */
public class StringDisplayImpl extends DisplayImpl {
    private String string;
    private int width;

    /**
     * 주어진 문자열을 이용하여 StringDisplayImpl 객체를 생성합니다.
     * @param string 출력할 문자열
     */
    public StringDisplayImpl(String string) {
        this.string = string;
        this.width = string.length();
    }

    /**
     * 표시를 엽니다.
     */
    @Override
    public void rawOpen() {
        printLine();
    }

    /**
     * 문자열을 화면에 출력합니다.
     */
    @Override
    public void rawPrint() {
        System.out.println("|" + string + "|");
    }

    /**
     * 표시를 닫습니다.
     */
    @Override
    public void rawClose() {
        printLine();
    }

    /**
     * 화면을 그리는 구분선을 출력합니다.
     */
    private void printLine() {
        System.out.print("+");
        for(int i=0; i<width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}