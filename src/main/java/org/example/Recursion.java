package org.example;

public class Recursion {
    public int calcSum(int n){
        if(n==0) return 0;
        return n + calcSum(n-1);
    }

    public int factorial(int n){
        if(n==0 || n==1) return 1;
        return n*factorial(n-1);
    }

    public void fibonacci(int a, int b,int n){
        if(n==0) return;
        int c = a+b;
        System.out.println(c);
        fibonacci(b,c,n-1);
    }

    public int calcPower(int x, int n){//stack height = n
        if(n==0) return 1;
        if(x==0) return 0;
        return x * calcPower(x, n-1);
    }

    public int calcPower2(int x, int n){//stack height = log(n)
        if(n==1) return x;
        if(x==0) return 0;
        if((n&1)==1) return x * calcPower(x, n/2) * calcPower(x, n/2);
        else return calcPower(x, n/2) * calcPower(x, n/2);
    }
}
