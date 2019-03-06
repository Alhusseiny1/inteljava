package com.alhusseiny;

public class JavaArrays {
    public static void main(String[] args) {
        int marks[] = {78,45,21,25,36,25,14,25,36,58,47,45};
        String names [] ={"Kim","Tom","Jane","Mary","Jerry"};
        System.out.println(marks[0]);

        try {
            System.out.println(names[10]);
        }
        catch (Exception e)
        {
            System.out.println("Error whole fetching the name");
        }
        System.out.println(12345);
        Functions.areaCircle(21);
        Math.sqrt(7);

    }
}
