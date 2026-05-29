package org.example;

/*
1
12
123
1234
12345
 */

public class Pattern6 {
    int n=5;
    public void printPattern(){
        for(int i=0;i<n;++i){
            for(int j=0;j<=i;++j) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }
}
