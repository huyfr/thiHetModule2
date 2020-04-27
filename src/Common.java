import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Common {

    List<Contact> contact = new ArrayList<>();

    public List<Contact> getContact() {
        return contact;
    }

    public void setContact(List<Contact> contact) {
        this.contact = contact;
    }

    String path = "C:\\Users\\Admin\\Desktop\\csv-example\\contacts.csv";

    private static final String PHONE_REGEX = "^[0-9]+$";

    public void addToList() {
        Contact contacts = new Contact();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        contacts.setName(sc.nextLine());
        System.out.println("Enter gender: ");
        contacts.setGender(sc.nextLine());
        System.out.println("Enter date of birth: ");
        contacts.setDateOfBirth(sc.nextLine());
        System.out.println("Enter phone: ");
        contacts.setPhoneNumber(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter crew: ");
        contacts.setCrew(sc.nextLine());
        System.out.println("Enter address: ");
        contacts.setAddress(sc.nextLine());
        System.out.println("Enter email: ");
        contacts.setEmail(sc.nextLine());

        contact.add(contacts);
    }

    public void readFromFile() {
        File file;
        FileReader fr;
        BufferedReader br = null;
        String line;
        String comma = ",";
        String[] contacts;

        try {
            file = new File(path);
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                contacts = line.split(comma);
                System.out.println(contacts[0] + " " + contacts[1] + " " + contacts[2] + " " + contacts[3] + " " + contacts[4] + " " + contacts[5] + " " + contacts[6]);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }

    public void displayFromList() {
        for (Contact contact : contact) {
            System.out.println(contact);
        }
    }
}
