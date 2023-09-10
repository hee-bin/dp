package Key;

import FrameWork.Product;

/**
 * 열쇠를 나타내는 클래스입니다.
 */
public class Key extends Product {
    private String owner;

    /**
     * 지정된 소유자로 열쇠를 생성합니다.
     *
     * @param owner 열쇠의 소유자입니다.
     */
    public Key(String owner) {
        System.out.println(owner + "님의 열쇠가 생성되었습니다.");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(owner + "님의 열쇠를 사용합니다.");
    }

    @Override
    public String toString() {
        return owner;
    }
}
