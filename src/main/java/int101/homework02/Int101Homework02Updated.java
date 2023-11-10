package int101.homework02;

import static work01.Utilitor.*;
import work02.Person;
import work03.Account;

public class Int101Homework02Updated {

    public static void main(String[] args) {
        work01Utilitor();
        work02Person();
        work03Account();
    }



    static void work01Utilitor() {
        System.out.println(testString("Hello"));
        System.out.println(testString(null)); //Exception
        System.out.println(testString("    ")); //Exception
        System.out.println(testPositive(10));
        System.out.println(testPositive(0)); //Exception (0 is the only number that's not positive or negative.)
        System.out.println(testPositive(-10)); //Exception
        System.out.println(computeIsbn10(130640615));
    }



    static void work02Person() {
        Person Mook = new Person("Chananthorn","Srivorachai");
        Person Micky = new Person("Jirat","Srivorachai");
        Person M = new Person("Firstname","Lastname");

        System.out.println(Mook.getId());
        System.out.println(Mook.getFirstname());
        System.out.println(Mook.getLastname());

        M.setFirstname("New Firstname");
        M.setLastname("New Lastname");
        System.out.println("Firstname: " + M.getFirstname() + ", " + "New Lastname" + M.getLastname());

        System.out.println(Mook.equals(Micky));
        System.out.println(Mook);
        System.out.println(Micky);
        System.out.println(M);

        Person Test = new Person("   " , "   "); //Exception
        Person Test2 = new Person(null, null); //Exception
    }



    static void work03Account() {
        Person Mook = new Person("Chananthorn","Srivorachai");
        Person Micky = new Person("Jirat","Srivorachai");

        Account account1 = new Account(Mook);
        Account account2 = new Account(Micky);

        account1.deposit(4000);
        System.out.println(account1);
        account2.deposit(3000);
        System.out.println(account2);
        account2.withdraw(2000);
        System.out.println(account2 + " (withdraw 2000)");
        account1.transfer(3000, account2);
        System.out.println(account1 + " (tranfer 3000)");
        System.out.println(account2 + " (receive 3000)");

        account1.withdraw(5000); //Exception
        account1.transfer(5000, account2); //Exception
        account1.transfer(500, null); //Exception
    }
}
