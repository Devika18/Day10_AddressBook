package AddressBook;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookSystem {
    public static List<PersonDetails> dataBase = new ArrayList<>();

    private static void storingData(PersonDetails a) {
        dataBase.add(a);
        writingData();
    }
    public static void readingData() {
        String path = "D:\\IdeaProjects\\AddressBook_Assignment\\data1.csv";
        List<String> arrayList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            while (reader.ready()) {
                arrayList.add(reader.readLine());
            }
        }
        catch (ClassCastException | IOException e) {
            // Handle a potential exception
        }
        System.out.println(arrayList);
    }
    public static void writingData() {
        String path = "D:\\IdeaProjects\\AddressBook_Assignment\\data1.csv";
        File file = null;
        FileOutputStream fileOutStream = null;
        try {
            file = new File(path);
            fileOutStream = new FileOutputStream(file);
            byte[] b;
            b = dataBase.toString().getBytes();
            fileOutStream.write(b);
            fileOutStream.flush();
            fileOutStream.close();
            System.out.println("File writing done.");

        }
        catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileOutStream != null) {
                    fileOutStream.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public void addPersonDetails(PersonDetails a) {
        storingData(a);
        System.out.println("\nEntry added Successfully...!\n");
        writingData();
    }

    public void editPersonDetails() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name of the person that you want to edit: ");
        String firstName = sc.next();

        List<PersonDetails> tempDataBase = new ArrayList<>();

        PersonDetails n3 = new PersonDetails();
        PersonDetails x = findPerson(firstName);
        loop1: while (true) {
            System.out.println("Which field would you like to edit: \n1. First Name\n2. Last Name\n3. City\n4. State\n5. Zip\n6. Phone Number\n7. Exit Edit Mode");
            int opt = sc.nextInt();
            sc.nextLine();
            if (opt == 1) {
                System.out.println("Enter the new First Name: ");
                String newName = sc.nextLine();
                n3.setFirstName(newName);

                loop4 : while (true) {
                    System.out.println("Should \""+n3.getFirstName()+"\" be overwritten with \""+x.getFirstName()+"\" choose options below:");
                    menuSave();
                    System.out.println("Enter Option: ");
                    String ans = sc.nextLine();

                    switch (ans) {
                        case "1":
                            x.setFirstName(n3.getFirstName());
                            System.out.println("Updated Successfully!");

                            break loop4;
                        case "2":
                            String choice = sc.nextLine();
                            System.out.println("Would you like to save this as a new entry (Yes/No)?"+ choice );
                            System.out.println("Please fill all the required details for the new entry: ");
                            AddressBookMain.userInput();
                            break loop4;
                        case "3":
                            System.out.println("Edit Mode Exited");
                            break loop4;
                        default:
                            System.out.println("Error: Invalid Option!\nTry Again!");
                            break;
                    }
                }
            } else if (opt == 2) {
                System.out.println("Enter the new Last Name: ");
                String newLastName = sc.nextLine();
                n3.setLastName(newLastName);
                loop4 : while (true) {
                    System.out.println("Should \""+n3.getLastName()+"\" be overwritten with \""+x.getLastName()+"\" choose options below:");
                    menuSave();
                    System.out.println("Enter Option: ");
                    String ans = sc.nextLine();

                    switch (ans) {
                        case "1":
                            x.setLastName(n3.getLastName());
                            System.out.println("Updated Successfully!");
                            break loop4;
                        case "2":
                            System.out.println("Would you like to save this as a new entry?");
                            System.out.println("Please fill all the required details for the new entry: ");
                            AddressBookMain.userInput();
                            break loop4;
                        case "3":
                            System.out.println("Edit Mode Exited");
                            break loop4;
                        default:
                            System.out.println("Error: Invalid Option!\nTry Again!");
                            break;
                    }
                }
            } else if (opt == 3) {
                System.out.println("Enter the new City Name: ");
                String newCity = sc.nextLine();
                n3.setCity(newCity);
                loop4 : while (true) {
                    System.out.println("Should \""+n3.getCity()+"\" be overwritten with \""+x.getCity()+"\" choose options below:");
                    menuSave();
                    System.out.println("Enter Option: ");
                    String ans = sc.nextLine();

                    switch (ans) {
                        case "1":
                            x.setCity(n3.getCity());
                            System.out.println("Updated Successfully!");
                            break loop4;
                        case "2":
                            System.out.println("Would you like to save this as a new entry?");
                            System.out.println("Please fill all the required details for the new entry: ");
                            AddressBookMain.userInput();
                            break loop4;
                        case "3":
                            System.out.println("Edit Mode Exited");
                            break loop4;
                        default:
                            System.out.println("Error: Invalid Option!\nTry Again!");
                            break;
                    }
                }

            } else if (opt == 4) {
                System.out.println("Enter the new State Name: ");
                String newState = sc.nextLine();
                n3.setState(newState);
                loop4 : while (true) {
                    System.out.println("Should \""+n3.getState()+"\" be overwritten with \""+x.getState()+"\" choose options below:");
                    menuSave();
                    System.out.println("Enter Option: ");
                    String ans = sc.nextLine();

                    switch (ans) {
                        case "1":
                            x.setState(n3.getState());
                            System.out.println("Updated Successfully!");
                            break loop4;
                        case "2":
                            System.out.println("Would you like to save this as a new entry?");
                            System.out.println("Please fill all the required details for the new entry: ");
                            AddressBookMain.userInput();
                            break loop4;
                        case "3":
                            System.out.println("Edit Mode Exited");
                            break loop4;
                        default:
                            System.out.println("Error: Invalid Option!\nTry Again!");
                            break;
                    }
                }
            } else if (opt == 5) {
                System.out.println("Enter the new Zip: ");
                int newZip = sc.nextInt();
                n3.setZip(newZip);
                loop4 : while (true) {
                    System.out.println("Should \""+n3.getZip()+"\" be overwritten with \""+x.getZip()+"\" choose options below:");
                    menuSave();
                    System.out.println("Enter Option: ");
                    String ans = sc.nextLine();

                    switch (ans) {
                        case "1":
                            x.setZip(n3.getZip());
                            System.out.println("Updated Successfully!");
                            break loop4;
                        case "2":
                            System.out.println("Would you like to save this as a new entry?");
                            System.out.println("Please fill all the required details for the new entry: ");
                            AddressBookMain.userInput();
                            break loop4;
                        case "3":
                            System.out.println("Edit Mode Exited");
                            break loop4;
                        default:
                            System.out.println("Error: Invalid Option!\nTry Again!");
                            break;
                    }
                }
            } else if (opt==6) {
                System.out.println("Enter the new Phone Number: ");
                Long newPh = sc.nextLong();
                n3.setPhoneNumber(newPh);
                loop4 : while (true) {
                    System.out.println("Should \""+n3.getPhoneNumber()+"\" be overwritten with \""+x.getPhoneNumber()+"\" choose options below:");
                    menuSave();
                    System.out.println("Enter Option: ");
                    String ans = sc.nextLine();

                    switch (ans) {
                        case "1":
                            x.setPhoneNumber(n3.getPhoneNumber());
                            System.out.println("Updated Successfully!");
                            break loop4;
                        case "2":
                            System.out.println("Would you like to save this as a new entry?");
                            System.out.println("Please fill all the required details for the new entry: ");
                            AddressBookMain.userInput();
                            break loop4;
                        case "3":
                            System.out.println("Edit Mode Exited");
                            break loop4;
                        default:
                            System.out.println("Error: Invalid Option!\nTry Again!");
                            break;
                    }
                }
            } else if (opt==7) {
                System.out.println("Edit Mode Closed");
                break loop1;
            } else {
                System.out.println("Error: Invalid Option\nTry Again!");
            }
        }
        writingData();
    }
    public void deletePersonDetails(String firstName) {
        for(PersonDetails n2 : dataBase) {
            if (n2.getFirstName().equals(firstName)) {
                dataBase.remove(n2);
                System.out.print("Person details with given name \""+ firstName + "\" is deleted");
                System.out.println(n2);
            }
        }
        writingData();
    }
    public void display() {
        System.out.println(dataBase);
    }
    private PersonDetails findPerson(String firstName) {
        PersonDetails n4 = new PersonDetails();
        for (PersonDetails tempPerson : dataBase) {
            if (tempPerson.getFirstName() == firstName) {
                n4 = tempPerson;
            }
        }
        return n4;
    }
    public static void exitSystem() {

        AddressBookMain.menu();
    }
    private void menuSave () {
        System.out.println("1. Overwrite the data\n2. Create as new user\n3. Close Edit Menu\n");
        writingData();
    }

}
