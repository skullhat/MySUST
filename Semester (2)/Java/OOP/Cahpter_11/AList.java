package Cahpter_11;

import java.util.ArrayList;

public class AList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Omer");
        list.add("Khalid");
        list.add("Ahmed");
        list.add("Ali");
        System.out.println("Lsit Length is: " + list.size());
        System.out.println("is it contains \"Ali\" :" + list.contains("Ali"));
        System.out.println("Index of \"Ahmed\" :" + list.indexOf("Ali"));
        System.out.println("Is it empety:" + list.isEmpty());
        list.add("Khalid");
        list.add("Joe");
        System.out.println("Lsit Length is: " + list.size());
        System.out.println("Last index of Khalid: " + list.lastIndexOf("Khalid"));
        list.remove("Joe");
        System.out.println("Lsit Length is: " + list.size());
        list.clear();
        System.out.println("Is it empty: " + list.isEmpty());
        

    }
}
