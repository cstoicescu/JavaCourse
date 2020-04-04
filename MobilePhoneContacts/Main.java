package MobilePhoneContacts;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static Thread thread = new Thread();
    private static Scanner scanner = new Scanner ( System.in);
    private static MobilePhone mobilePhone = new MobilePhone("+40732416473");

    public static void main(String[] args)  throws InterruptedException {

        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {
            System.out.println("\nEnter action: ( Press 6 to show available actions )");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("\n Shutting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printConctacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

        private static void updateContact() {
            System.out.println("Enter existing contact name ");
            String name =  scanner.nextLine();
            Contacts existingContactRecord = mobilePhone.queryContact(name);
            if(existingContactRecord == null)
            {
                System.out.println("Contact not found");
                return ;
            }
            System.out.println("Enter new contact name: ");
            String newName = scanner.nextLine();
            System.out.println("Enter new contact number");
            String number = scanner.nextLine();

            Contacts newContact = Contacts.createContact(newName,number);
            if(mobilePhone.updateContact(existingContactRecord,newContact)) {
                System.out.println("Succesfully updated record");
            }   else
                System.out.println("Error updating record");

        }

    private static void removeContact() {
        System.out.println("Enter existing contact name ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        if (mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Succesfully deleted");
        } else
            System.out.println("Error deleting contact");
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name: " + existingContactRecord.getName() + " | Phone number:" + existingContactRecord.getPhoneNumber());

    }

        private static void addNewContact() {
            System.out.println("Enter your new contact name");
            String name = scanner.nextLine();
            System.out.println("Enter your new contact phone number");
            String phoneNumber = scanner.nextLine();
            Contacts newContact = Contacts.createContact(name,phoneNumber);
            if(mobilePhone.addNewContact(newContact))
                System.out.println("New Contact added: " + name + " , phone: " + phoneNumber);
            else
                System.out.println("Cannot add, " + name + " already exists");
        }

        private static void startPhone() throws InterruptedException {
            System.out.print("Android Booting Up.");

            for (int i = 6; i >= 0; i--) {
                thread.sleep(1000);
                System.out.print(".");
            }
        }

        private static void printActions() {
            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("      Contacts Menu  | PRESS:     ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println( "0 - Shutdown Phone  \n" +
                                "1 - Show All Contacts \n" +
                                "2 - Add new Contacts \n" +
                                "3 - Update existing contact \n" +
                                "4 - To remove an existing contact \n" +
                                "5 - Query contact  \n" +
                                "6 - Menu\n");
            System.out.print("Choose your action: ");
        }
    }

