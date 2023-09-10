package FrameWork;

/**
 * 제품을 생성하는 추상 팩토리 클래스입니다.
 */
public abstract class Factory {

    /**
     * 지정된 소유자로 제품을 생성합니다.
     *
     * @param owner 제품의 소유자입니다.
     * @return 생성된 제품입니다.
     */
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    /**
     * 지정된 소유자로 제품을 생성합니다.
     *
     * @param owner 제품의 소유자입니다.
     * @return 생성된 제품입니다.
     */
    protected abstract Product createProduct(String owner);

    /**
     * 제품을 등록합니다.
     *
     * @param product 등록할 제품입니다.
     */
    protected abstract void registerProduct(Product product);
}
