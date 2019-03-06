package com.alhusseiny;

public class TestAccount {
    public static void main(String[] args) {
        Account  acc1 = new Account("Mary","001",3000);
        Account  acc2 = new Account("Zuhura","002",30000);
        Account  acc3 = new Account("Zainab","003",2000);
        Account  acc4 = new Account("JUma","004",10050);
        Account  acc5 = new Account("Haron","005",35000);

        System.out.println(acc1.getBalance());

        acc2.deposit(1000);
        acc2.printDetails();
        acc2.withdraw(300);
        acc2.printDetails();

        String name = "John";
        name.toLowerCase();
        //primitive
        int x =10;
        double z=88;
        boolean finished=true;

        Account [] accounts ={ acc1, acc2, acc3, acc4, acc5};

        for(Account k : accounts)
        {
           k.deposit(100);
           k.printDetails();
        }

    }
}
