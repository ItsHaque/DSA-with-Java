package org.example;

/*
 *****
 ****
 ***
 **
 *
 */

public class Pattern4 {
    public void printPattern(){
        for(int i=0;i<5;++i){
            for(int j=0;j<5-i;++j) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
