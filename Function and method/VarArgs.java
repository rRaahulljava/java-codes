package com.rahul;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,87,7,9,334,45,5,6,67,78);
        multiple(5,7,"rhul", "kunl");
    }

    static void multiple(int a ,int b , String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
