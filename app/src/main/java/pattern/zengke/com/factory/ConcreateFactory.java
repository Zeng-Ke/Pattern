package pattern.zengke.com.factory;

import static android.os.Build.PRODUCT;

/**
 * author: ZK.
 * date:   On 2017/11/16
 * description:具体工厂
 */

public class ConcreateFactory extends Factory {


    @Override
    public Product createProduct() {
        return new ConcreateProductA();
        //return new ConcreateProductB();
    }
}
