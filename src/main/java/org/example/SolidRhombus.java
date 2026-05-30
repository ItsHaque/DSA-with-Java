package org.example;

/*
    *****
   *****
  *****
 *****
*****
 */

public class SolidRhombus {

    public void printPattern(){
        int n=5;
        String out="*";
        for(int i=0;i<n;++i){
            int k=0;
            for(int j=0;j<=2*n;++j) {
                if(k>=n) break;
                if(j>=n-i-1){
                    System.out.print(out);
                    k++;
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    public void printPattern2(){
        int n=5;
        String out="*";
        for(int i=0;i<n;++i){
            for(int j=0;j<n-i;j++) System.out.print(" ");
            for(int j=0;j<n;++j) System.out.print(out);
            System.out.println();
        }
    }
}
