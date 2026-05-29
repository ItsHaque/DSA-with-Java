package org.example;

/*
 *
 **
 ***
 ****
 *****
 */

public class Pattern3 {
    public void printPattern(){
        for(int i=0;i<5;++i){
            for(int j=0;j<=i;++j) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
