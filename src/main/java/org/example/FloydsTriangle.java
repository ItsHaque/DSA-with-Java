package org.example;

public class FloydsTriangle {
    int n=5, out=1;
    public void printPattern(){
        for(int i=0;i<n;++i){
            for(int j=0;j<=i;++j) {
                System.out.print(out++ + " ");
            }
            System.out.println();
        }
    }
}
