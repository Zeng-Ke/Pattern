package pattern.zengke.com.strategy.stragety;

/**
 * author: ZK.
 * date:   On 2016/12/18
 */

public class BusCalculator implements StrategyCalculator {
    @Override
    public int calculate(int km) {
        if (km < 5) {
            return 3;
        } else if (km > 5 && km < 10) {
            return 5;
        } else {
            return 8;
        }
    }
}
