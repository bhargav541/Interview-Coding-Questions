package com.practice.GarbageCollection;
public class TestGC {

    @Override
    public void finalize()
    {
        System.out.println("Object is Garbage collected");
    }

    public static void main(String[] args) {

        TestGC tgc = new TestGC();
        TestGC tgc2 = new TestGC();
        tgc=null;
        tgc2=null;
        System.gc();
    }
}