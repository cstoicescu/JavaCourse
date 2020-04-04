package MobilePhoneContacts;

import lombok.Getter;

import java.util.ArrayList;

@Getter
public class MobilePhone {

    private String myNumber;
    private ArrayList<Contacts> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contacts>();
    }

    public boolean addNewContact(Contacts contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("This contact already exists");
            return false;
        }
        myContacts.add(contact);
        return true;
    }


    public boolean updateContact(Contacts oldContact, Contacts newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition >= 0) {
            this.myContacts.set(foundPosition, newContact);
            System.out.println("Contact " + oldContact.getName() + " has been replaced with " + newContact.getName());
            return true;
        }
        System.out.println("Contact " + oldContact + " has not been found ");
        return false;
    }

    private int findContact(Contacts contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contacts contact = this.myContacts.get(i);
            if (contact.getName().toLowerCase().equals(contactName.toLowerCase()))
                return i;
        }
        return -1;
    }

    public boolean removeContact(Contacts contact) {
        int foundPosition = findContact(contact);
        if (foundPosition >= 0) {
            this.myContacts.remove(foundPosition);
            System.out.println("Contact " + contact.getName() + " has been deleted ");
            return true;
        }
        System.out.printf("Contact " + contact.getName() + " was not found");
        return false;
    }

    public String queryContact(Contacts contact) {
        if (findContact(contact) >= 0)
            return contact.getName();
        return null;
    }

    public Contacts queryContact(String name) {
        int position = findContact(name);
        if ( position >= 0)
          return this.myContacts.get(position);
        return null;
    }

    public void printConctacts () {
        System.out.println("Contact List");
        for ( int i = 0 ; i < myContacts.size(); i ++ )
            System.out.println((i+1)+ ". " + this.myContacts.get(i).getName() +
                    " ---> " + this.myContacts.get(i).getPhoneNumber());
    }


}