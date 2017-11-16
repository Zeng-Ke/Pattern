package pattern.zengke.com.factory;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * author: ZK.
 * date:   On 2017/11/16
 */

public class FactoryActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Factory factory = new ConcreateFactory();
        Product product = factory.createProduct();
        product.method();
    }
}
