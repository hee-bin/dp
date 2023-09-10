package IDCard;

import FrameWork.Product;

/**
 * ID 카드를 나타내는 클래스입니다.
 */
public class IDCard extends Product {
    private String owner;

    /**
     * 지정된 소유자로 ID 카드를 생성합니다.
     *
     * @param owner ID 카드의 소유자입니다.
     */
    public IDCard(String owner) {
        System.out.println(owner + "님의 카드가 생성되었습니다.");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(owner + "님의 카드를 사용합니다.");
    }

    @Override
    public String toString() {
        return owner;
    }

    /**
     * ID 카드의 소유자를 반환합니다.
     *
     * @return ID 카드의 소유자입니다.
     */
    public String getOwner() {
        return owner;
    }
}
