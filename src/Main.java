import java.util.Scanner;


static Scanner Sc;
static Database database;


public static void main(String[] args) {

    database = new Database();

    System.out.println("Welcome to the Videogame Managment System!\n");

    int num = 0;
    do {
        System.out.println("0. Exit\n" + "1. Login \n2. New User");
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

    } while (num != 0);


}

private static void login() {
    System.out.println("Enter phone number:");
    String phonenumber = Sc.next();
    System.out.println("Enter email:");
    String email = Sc.next();
    int n = database.login(phonenumber, email);
    if (n != -1) {
        User user = database.getUser(n);
        System.out.println(STR."Welcome\{user.getName()}");
    } else {
        return;
    }
}

private static void newuser() {
    System.out.println("Enter name:");
    String name = Sc.next();
    System.out.println("Enter phone number:");
    String phonenumber = Sc.next();
    System.out.println("Enter email:");
    String email = Sc.next();
    System.out.println("1. Admin\n2. Normal User");
    int nuchoice = Sc.nextInt();
    if (nuchoice == 2) {
        User Admin = new Admin(name, email, phonenumber);
        database.AddUser(Admin);
    } else {
        User User = new User(name, email, phonenumber);
        database.AddUser(User);
    }
    System.out.println("User created successfully");

}
