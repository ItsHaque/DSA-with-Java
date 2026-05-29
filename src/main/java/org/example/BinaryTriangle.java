package org.example;

public class BinaryTriangle {
    int n=5, out=1;
    public void printPattern(){
        for(int i=0;i<n;++i){
            if((i&1)==0) out=1;
            else out=0;
            for(int j=0;j<=i;++j) {
                System.out.print(out + " ");
                out = 1- out;
            }
            System.out.println();
        }
    }
}
