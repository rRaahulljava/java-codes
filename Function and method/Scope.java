package com.rahul;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Rahul";
        {
         // int a = 78 already initialised outside the block in the same method,hence you can not initialised again
         a = 100; // reassign the original ref variable to some other value
            System.out.println(a);
            int c = 99;
            name = "kunal";
            System.out.println(name);
            // value initialised in this block, will remain in block
        }
        System.out.println(a);
        System.out.println(name );
    }
    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);

    }
}
