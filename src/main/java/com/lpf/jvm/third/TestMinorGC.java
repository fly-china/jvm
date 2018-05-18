package com.lpf.jvm.third;

/**
 * 代码清单3-5：测试新生代的MinorGc
 *
 * @author lipengfei
 * @create 2018-05-15 15:51
 **/
public class TestMinorGC {

    private static final int _1MB = 1024 * 1024;

    /**
     * VM参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M  -XX:SurvivorRatio=8 -XX:+PrintGCDetails
     * -XX:+PrintGC 与 -verbose:gc 是一样的，可以认为-verbose:gc 是 -XX:+PrintGC的别名.
     *
     * 注：不同版本JDK的Gc方式可能不太相同，run和debug同样会导致Gc方式不尽相同
     * 可能一：在为allocation4分配内存时，eden区已占用6MB空间，只好进行一次minorGc，由于survivor只有1M,3个eden对象直接进入老年代；
     *        并为allocation4在eden分配4M的空间
     * 可能二：老年代使用了4M,新生代使用了6M
     */
    public static void testAllocation() {
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[2 * _1MB];
        allocation3 = new byte[2 * _1MB];
        allocation4 = new byte[4 * _1MB];
    }

    public static void main(String[] args) {
        testAllocation();
    }
}
