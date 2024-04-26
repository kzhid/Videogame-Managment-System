import java.util.Scanner;


public class Main {
    static Scanner Sc;
    public static void main(String[] args) {
        System.out.println("Welcome to the Videogame Managment System!" +
                "\n" + "1. Login\n2. New User");
        Sc = new Scanner(System.in);
        int choice = Sc.nextInt();

        switch (choice) {
            case 1:
                login(); //performs the login function in user.java
            case 2:
                newuser();
            default:
                System.out.println("Error");
        }



    }

    private static void login() {
        System.out.println("Enter phone number:");
        String phonenumber = Sc.next();
        System.out.println("Enter email:");
        String email = Sc.next();
    }

    private static void newuser() {
    }
}
