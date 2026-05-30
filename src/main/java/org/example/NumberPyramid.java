package org.example;

/*
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
 */

public class NumberPyramid {
    public void printPattern(){
        int n=5;
        String out="*";
        for(int i=0;i<n;++i){
            for(int j=0;j<n-i;j++) System.out.print(" ");
            for(int j=0;j<=i;++j) System.out.print(i+1 + " ");
            System.out.println();
        }
    }
    public void printPattern2(){
        int n=5;
        String out="*";
        for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){
                if(j>=n-i-1) System.out.print(i+1 + " ");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
