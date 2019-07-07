package com.imooc.sell.utils;

import java.util.Random;

/**
 * @author Li Yan
 * 2019/7/1 16:52
 */
public class KeyUtil {

    /**
     * 生产唯一主键
     * 生产规则： 当前时间+随机数
     *
     * @return
     */
    public static synchronized String genUniqueKey() {

        long currentTime = System.currentTimeMillis();
        Random random = new Random();
        int randomInteger = random.nextInt(900000) + 100000;
        return currentTime + String.valueOf(randomInteger);
    }
}
