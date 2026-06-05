package org.example;

public class TowerofHanoi {
    public void tower(int n, String src, String help, String dest){
        if(n==1){
            System.out.println("Disc - " + n + ": " + src + " -> " + dest);
            return;
        }
        tower(n-1, src, dest, help);
        System.out.println("Disc - " + n + ": " + src + " -> " + dest);
        tower(n-1, help, src, dest);
    }
}
