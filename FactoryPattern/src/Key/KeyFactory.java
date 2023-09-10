package Key;

import FrameWork.Factory;
import FrameWork.Product;

/**
 * 열쇠를 생성하는 팩토리 클래스입니다.
 */
public class KeyFactory extends Factory {

    @Override
    protected Product createProduct(String owner) {
        return new Key(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "의 열쇠가 사용 가능합니다.");
    }
}
