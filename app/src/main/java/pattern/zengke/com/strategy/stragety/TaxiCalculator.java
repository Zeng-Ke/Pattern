package pattern.zengke.com.strategy.stragety;

/**
 * author: ZK.
 * date:   On 2016/12/18
 */

public class TaxiCalculator implements StrategyCalculator {
    @Override
    public int calculate(int km) {
        return km * 2;
    }
}
