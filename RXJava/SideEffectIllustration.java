package com.rxjava;


public class SideEffectIllustration {

    private int state = 0;


    //pure functions
    // no matter how many threads are going to be there , it will behave the exact same way.
    //no syncronization required.
    public int f1(int x) {
        return x*2;
    }

    //impure function, threads then the result is unpredictable , if we pass
    public  int f2(int x) {
        state = (++state % 3);
        return x*2 + state;
    }

    public static void main(String [] args) {
        final SideEffectIllustration v  =  new SideEffectIllustration();
        for(int i=0;i<100;i++) {
            if(v.f1(5) != 10) {
                throw new IllegalStateException();
            }
        }

        System.out.print("f1(5) = 10 for all calls");

        for(int i=0;i<100;i++) {
            System.out.println("f2(5) ="+v.f2(5));
        }

    }


}
