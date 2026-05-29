package org.example;

/*
 *****
 *   *
 *   *
 *   *
 *****
 */

public class Pattern2 {
    public void printPattern(){
        for(int i=0;i<5;++i){
            for(int j=0;j<5;++j) {
                if (i == 0 || i == 4 || j == 0 || j == 4) {
                    System.out.print('*');
                } else System.out.print(' ');
            }
            System.out.println();
        }
    }
}
