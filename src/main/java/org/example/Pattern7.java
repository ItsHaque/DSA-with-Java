package org.example;

/*
12345
1234
123
12
1
 */

public class Pattern7 {
    int n=5;
    public void printPattern(){
        for(int i=0;i<n;++i){
            for(int j=0;j<n-i;++j) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }
}
