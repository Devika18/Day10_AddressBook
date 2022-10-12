package AddressBook;

import java.util.Scanner;

public class AddressBookMain {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook UseCase Program");
        menu();
    }
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        loop1:while (true) {
            System.out.println("which one Would you like to open....");
            System.out.println("1.Create Address Book");
            System.out.println("2.Open Address Book");
            System.out.println("3.Delete All Address");
            System.out.println("4.Quit");

            int choice = sc.nextInt();
            sc.nextLine();
            AddressBookManager addMan = new AddressBookManager();
            switch (choice) {
                case 1:
                    addMan.createAddressBook();
                    break;
                case 2:
                    addMan.openAddressBook();
                    break;
                case 3:
                    addMan.deleteAllAddress();
                    break loop1;
                case 4:
                    addMan.quitAddressBook();
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}

