package AddressBook;

import java.io.File;

public class AddressBookManager {
    public void createAddressBook() {

        AddressBookMain.userInput();
    }

    public void openAddressBook() {
        AddressBookMain.openUserIn();
    }

    public void deleteAllAddress() {
        AddressBookSystem.dataBase.clear();
        String path = "D:\\IdeaProjects\\AddressBook_Assignment\\data1.csv";
        File file = null;
        //FileOutputStream fileOutStream = null;
        System.out.println("Address book data cleared...!");
    }

    public void quitAddressBook() {
        System.out.println("Quitting address book...!");
        System.exit(0);

    }
}

