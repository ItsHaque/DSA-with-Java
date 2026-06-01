package org.example;

import javax.swing.*;
import java.util.Scanner;

public class Strings {
    public void func(){
//        String first = "Tony";
//        String second = "stark";
//        String fullName = first + " " + second;
//        System.out.println(fullName);
//        System.out.println(fullName.length());
//        for(int i=0; i<fullName.length(); ++i){
//            System.out.println(fullName.charAt(i));
//        }
//        String name1 = "tony";
//        String name2 = "tony0";
//        System.out.println(name1.compareTo(name2));
//        System.out.println(name1.compareToIgnoreCase(name2));
//        System.out.println(name1.equals(name2));

        String name = "Nishat Tasnim Juthy";
        String middleName = name.substring(7, 13); // syntax: substring(beginning index, ending index) // ending index is not included in the substring
        System.out.println(middleName);
        System.out.println(name.substring(14));// syntax: substring(beginning index) // if not given the function takes the length of the string as ending index
    }

    public void StringBuilderTutorial(){
        StringBuilder sb = new StringBuilder("Nishat");
        System.out.println(sb);

        System.out.println(sb.charAt(4));

        sb.setCharAt(5,'l');// set character at specific index
        System.out.println(sb);

        sb.insert(0,'T');// insert char at an index, this pushes the later characters 1 index forward.
        System.out.println(sb);

        sb.delete(0,1);//deletes everything between start and end index. end index is exclusive here.
        System.out.println(sb);

        sb.setCharAt(sb.length()-1,'t');
        System.out.println(sb);

        sb.append(' ');
        sb.append('J');
        sb.append('u');
        sb.append('t');
        sb.append('h');
        sb.append('y');// adds a char at the end of the current string (StringBuilder onject).

        System.out.println(sb);
    }

    public void reverseString(){
        StringBuilder name = new StringBuilder("Nishat Tasnim Juthy");

        System.out.println(name);

        int n=name.length(), m=n/2;

        for(int i=0; i<m; ++i){
            swap(name, i, n-i-1);
        }
        System.out.println(name);
    }

    public void swap(StringBuilder sb, int pos1, int pos2){
        char t= sb.charAt(pos1);
        sb.setCharAt(pos1,sb.charAt(pos2));
        sb.setCharAt(pos2,t);
    }

}
