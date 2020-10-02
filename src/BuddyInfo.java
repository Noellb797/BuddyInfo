import java.util.*;

public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;

    public static void main(String[] args) {
        BuddyInfo zed = new BuddyInfo("Zed");
        BuddyInfo bob = new BuddyInfo("Bob");
        System.out.println("Hello " +zed.getName()  +"!");
        AddressBook addressBook = new AddressBook();

    }

    public BuddyInfo(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }


}
