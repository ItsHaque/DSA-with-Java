package org.example;

public class BitManipulation {
    public void func(){
        // Get bit
        int n= 8, pos =2;
        int mask = 1<<pos;
        if((n&mask)==0) System.out.println("Bit was zero");
        else System.out.println("Bit was one");

        //Set bit
        int newNum= n | mask;
        System.out.println(newNum);

        // Clear bit
        int newNum2 = n & (~mask);
        System.out.println(newNum2);

        // Update bit to 1
        int newNum3 = n | mask;
        System.out.println(newNum3);

        // Update bit to 0
        int newNum4 = n & (~mask);
        System.out.println(newNum4);

        // Flip bit
        if((n & mask)>0) System.out.println(n & (~mask));
        else System.out.println(n | mask);
    }
}
