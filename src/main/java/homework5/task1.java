package homework5;
import java.util.HashMap;


public class task1 {
    private static final HashMap<String, String> contacts = new HashMap<>();
    public static void addPhoneNumber(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
    }
    public static void addPhoneNumberToContact(String name, String phoneNumber) {
        contacts.put(name, contacts.get(name) + " " + phoneNumber);
    }
    public static void removePhoneNumberFromContact(String name, String phoneNumber) {
        String contactDetails = contacts.get(name);
        String newContactDetails = contactDetails.replace(phoneNumber, "");
        contacts.put(name, newContactDetails);
    }
    public static void removePhoneNumber(String name) {
        contacts.remove(name);
    }
    public static void printContacts() {
        for (String name : contacts.keySet()) {
            System.out.println("Name: " + name + "; Phone Numbers: " + contacts.get(name));
        }
    }
    public static void main(String[] args) {
        addPhoneNumber("Мария", "+7 963 084 75 35");
        addPhoneNumber("Александр", "+7 963 440 65 20");
        addPhoneNumber("Василиса", "+7 963 660 32 11");
        addPhoneNumber("Альберт", "+7 963 162 77 84");

        printContacts();

        addPhoneNumberToContact("Мария", "+7 963 084 75 35");
        addPhoneNumberToContact("Александр", "+7 963 440 65 20");

        printContacts();

        removePhoneNumberFromContact("Мария", "+7 963 084 75 35");
        removePhoneNumber("Мария");

        printContacts();
    }
}
