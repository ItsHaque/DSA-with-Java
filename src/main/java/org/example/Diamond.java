package org.example;

/*
   *
  ***
 *****
*******
 *****
  ***
   *
 */

public class Diamond {

    public void printPattern(){
        int n=4;
        String out="*";
        for(int i=1;i<=n;++i){
            for(int j=0;j<n-i;j++) System.out.print(" ");
            for(int j=0;j<2*i-1;++j) System.out.print(out);
            System.out.println();
        }
        for(int i=n-1; i>0; --i){
            for(int j=0;j<n-i;j++) System.out.print(" ");
            for(int j=0;j<2*i-1;++j) System.out.print(out);
            System.out.println();
        }
    }
}
