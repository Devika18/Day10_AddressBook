package AddressBook;

import java.util.InputMismatchException;
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
    public static void userInput() {

        PersonDetails newPersonDetails = new PersonDetails();
        scan.nextLine();
        System.out.println("Enter First Name: ");
        newPersonDetails.setFirstName(scan.nextLine());
        System.out.println("Enter Last Name: ");
        newPersonDetails.setLastName(scan.nextLine());
        System.out.println("Enter City: ");
        newPersonDetails.setCity(scan.nextLine());
        System.out.println("Enter State: ");
        newPersonDetails.setState(scan.nextLine());
        zip:while (true) {
            try {
                System.out.println("Enter Zip: ");
                Scanner scan = new Scanner(System.in);
                newPersonDetails.setZip(scan.nextInt());
                break zip;
            } catch (InputMismatchException e) {
                System.out.println("invalid...! Enter again");
                continue ;
            }
        }
        ph:while (true){
            try {
                System.out.println("Enter Phone Number: ");
                Scanner scan = new Scanner(System.in);
                newPersonDetails.setPhoneNumber(scan.nextLong());
                break ph;
            } catch (InputMismatchException e) {
                System.out.println("invalid...! Enter again");
                continue ;
            }
        }
        AddressBookSystem newEntry = new AddressBookSystem();
        newEntry.addPersonDetails(newPersonDetails);
    }
    ublic static void openUserIn() {
        Scanner sc = new Scanner(System.in);
        loop: while (true) {
            System.out.println("Choose the option...!");
            System.out.println("1. Add Person ");
            System.out.println("2. Edit Person ");
            System.out.println("3. Delete Person ");
            System.out.println("4. Search Person ");
            System.out.println("5. Sort by Zip ");
            System.out.println("6. Sort by Name ");
            System.out.println("7. Display ");
            System.out.println("8. Exit ");
            int option = sc.nextInt();
            sc.nextLine();
            AddressBookSystem tempObj = new AddressBookSystem();
            switch (option) {
                case 1:
                    userInput();
                    break;
                case 2:
                    tempObj.editPersonDetails();
                    break;
                case 3:
                    System.out.println("Enter the first name of the person which need to be deleted");
                    String s = scan.next();
                    tempObj.deletePersonDetails(s);
                    break;
                case 4:
                    System.out.println("Enter the first name of the person which need to be search");
                    String s1 = scan.next();
                    tempObj.searchPersonDetails(s1);
                    System.out.println();
                    break;
                case 5:
                    tempObj.sortByZip();
                    System.out.println();
                    break;
                case 6:
                    tempObj.sortByFirstName();
                    System.out.println();
                    break;
                case 7:
                    tempObj.display();
                    System.out.println();
                    break;
                case 8:
                    tempObj.exitSystem();
                    System.out.println();
                    break;
                default:
                    System.out.println("Invalid Option");
                    break loop;
            }
        }
    }
}

