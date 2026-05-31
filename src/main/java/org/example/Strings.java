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


}
