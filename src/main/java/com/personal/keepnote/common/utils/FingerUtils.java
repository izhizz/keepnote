package com.personal.keepnote.common.utils;

import java.math.BigDecimal;

public class FingerUtils {
    public static Double keepTheDecimalPoint(Double number, Integer num) {
        if (num == null) {
            num = 2;
        }
        BigDecimal bg = new BigDecimal(number);
        double f1 = bg.setScale(num, BigDecimal.ROUND_HALF_UP).doubleValue();
        return f1;
    }

}
