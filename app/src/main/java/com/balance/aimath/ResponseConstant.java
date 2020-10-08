package com.balance.aimath;

import java.util.HashMap;
import java.util.Map;

public class ResponseConstant {
    public static final String[] error = {
            "对不起，没有听清楚，能麻烦再说一遍吗？",
            "抱歉，我没有太理解您的意思，请重复一下可以吗？",
            "这个问题超出了我的理解能力，要不换个方法说或者换一个问题？"
    };

    // hard coded responses
    public static final Map<String, String>  mapRes = new HashMap<>();

    static {
        mapRes.put("10", "10乘以3等于30");
        mapRes.put("25", "25加35等于60");
        mapRes.put("70", "70减27等于43");
        mapRes.put("20", "3加20等于23");
        mapRes.put("30", "30除以6等于5");
        mapRes.put("50", "50减23等于27");
    }
}
