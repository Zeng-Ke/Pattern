package pattern.zengke.com.strategy.normal;

import android.util.Log;

/**
 * author: ZK.
 * date:   On 2016/12/18
 * 用switch-case实现的计算器
 */

public class NormalCalculator {

    public enum TrafficType {
        BUS, SUBWAY, TAXI
    }

    private  final String NORMAL_TAG = "----normal_tag";


    public  void calcutePrice(TrafficType trafficType, int km) {
        switch (trafficType) {
            case BUS:
                Log.d(NORMAL_TAG, km + "公里，公交车价格为:" + busPrice(km) + "元");
                break;
            case SUBWAY:
                Log.d(NORMAL_TAG, km + "公里，地铁价格为:" + subwayBus(km) + "元");
                break;
            case TAXI:
                Log.d(NORMAL_TAG, km + "公里，的士价格为:" + taxiPrice(km) + "元");
        }
    }

    private  int busPrice(int km) {
        if (km < 5) {
            return 3;
        } else if (km > 5 && km < 10) {
            return 5;
        } else {
            return 8;
        }
    }

    private  int subwayBus(int km) {
        if (km < 6) {
            return 3;
        } else if (km > 6 && km < 12) {
            return 5;
        } else {
            return 7;
        }
    }


    private  int taxiPrice(int km) {
        return km * 2;
    }
}
