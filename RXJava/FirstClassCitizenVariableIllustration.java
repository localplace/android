package com.rxjava;



//For java 1.8 update gradle file

import java.util.function.BiFunction;

public class FirstClassCitizenVariableIllustration {


    public static void main(String [] args) {

        //Lambda Expression
        BiFunction<String,String,String> concatFunction = (s,t) -> {
            return s+t;
        };

        System.out.println(concatFunction.apply("Hello","World 1"));

        //Concat Strings static
        concatFunction = FirstClassCitizenVariableIllustration::concatStrings;
        System.out.println(concatFunction.apply("Hello", "World 2"));

        //Concat Strings instance
        FirstClassCitizenVariableIllustration instance = new FirstClassCitizenVariableIllustration();
        concatFunction = instance::concatStrings2;
        System.out.println(concatFunction.apply("Hello", "World 3"));

    }

    private static String concatStrings(String a ,String b) {
        return a+b;
    }

    String concatStrings2(String a , String b) {
        return a+b;
    }


}
