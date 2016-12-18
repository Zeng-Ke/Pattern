package pattern.zengke.com.strategy.stragety;

/**
 * author: ZK.
 * date:   On 2016/12/18
 */

public class SubwayCalculator implements StrategyCalculator {
    @Override
    public int calculate(int km) {
        if (km < 6) {
            return 3;
        } else if (km > 6 && km < 12) {
            return 5;
        } else {
            return 7;
        }
    }
}
