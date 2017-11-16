package pattern.zengke.com.factory;

import android.util.Log;

/**
 * author: ZK.
 * date:   On 2017/11/16
 * description： 具体产品A
 */

public class ConcreateProductB extends Product {

    @Override
    public void method() {
        Log.d("==Product","我是产品B");
    }
}
