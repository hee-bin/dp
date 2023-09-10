package IDCard;

import FrameWork.Factory;
import FrameWork.Product;

/**
 * ID 카드를 생성하는 팩토리 클래스입니다.
 */
public class IDCardFactory extends Factory {

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "의 카드가 등록되었습니다.");
    }
}
