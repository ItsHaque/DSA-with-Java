package org.example;

public class ReverseString {
    public void rev(String str, int n){
        if(n>str.length()-1) return;
        rev(str,n+1);
        System.out.print(str.charAt(n));
    }
}
