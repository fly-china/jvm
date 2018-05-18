package com.lpf.jvm.Second;

import org.hibernate.validator.constraints.EAN;

import java.util.ArrayList;
import java.util.List;

/**
 * 代码清单2-3 Java堆内存溢出异常测试
 *
 * @author lipengfei
 * @create 2018-05-15 15:56
 **/
public class HeapOOM {

    static class OOMObject{}


    /**
     * VM args:-Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError -XX:+PrintGCDetails
     * @param args
     */
    public static void main(String[] args) {
        List<OOMObject> objects = new ArrayList<>();
        while (true){
            objects.add(new OOMObject());
        }
    }
}
