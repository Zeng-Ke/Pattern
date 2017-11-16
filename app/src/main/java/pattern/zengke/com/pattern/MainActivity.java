package pattern.zengke.com.pattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import pattern.zengke.com.strategy.normal.NormalCalculator;
import pattern.zengke.com.strategy.stragety.BusCalculator;
import pattern.zengke.com.strategy.stragety.StrategyCalculator;
import pattern.zengke.com.strategy.stragety.TaxiCalculator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //-------------------------------NormalCalculator-------------------------------------------
        NormalCalculator calculator = new NormalCalculator();
        calculator.calcutePrice(NormalCalculator.TrafficType.TAXI,10);
        //------------------------------StrategyCalculator------------------------------------------
        //注意，实例化的是你需要的计算器（BusCalculator），但调用者仍然是接口计算器（StrategyCalculator）。由父接口去
        //调用方法，但具体实现还是由BusCalculator去处理。这样BusCalculator里面的实现就没必要暴露给外面知道，使用者只需
        //调用我这接口的方法就可以了，具体内部自己会处理。点击calculate方法查看内部实现时，看到的只是接口的方法而已。，
        StrategyCalculator strategyCalculator = new BusCalculator();
        strategyCalculator.calculate(10);




    }
}
