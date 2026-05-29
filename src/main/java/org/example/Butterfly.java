package org.example;
/*
*      *
**    **
***  ***
********
********
***  ***
**    **
*      *
 */

public class Butterfly {
    int n=5;
    char out='*';
    public void printPattern(){
        for(int i=0;i<n;++i){
            for(int j=0;j<n;++j) {
                if(j<=i) System.out.print(out);
                else System.out.print(" ");
            }
            for(int j=0;j<n;++j) {
                if(j>=n-i-1) System.out.print(out);
                else System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=0;i<n;++i){
            for(int j=0;j<n;++j) {
                if(j<n-i) System.out.print(out);
                else System.out.print(" ");
            }
            for(int j=0;j<n;++j) {
                if(j>=i) System.out.print(out);
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
