package com.alhusseiny;

import java.util.ArrayList;

public class JavaArraysList {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList();
        names.add("John");
        names.add("Mary");
        names.add("Miry");
        names.add("Musa");
        names.add("Mwangi");

        System.out.println(names.get(1) );

        names.remove(2);

        System.out.println(names.size() );

        names.clear();

        System.out.println(names.size() );
    }
}
