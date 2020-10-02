import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddies;

    public static void main(String[] args) {
        //create a buddy and address book, add and remove buddy from address book
        BuddyInfo zed = new BuddyInfo("Zed");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(zed);
        addressBook.removeBuddy(zed);
    }

    public AddressBook()
    {
        buddies = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy)
    {
        buddies.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy)
    {
        buddies.remove(buddy);
    }

    public void branchMethod() {
        System.out.println("This is a method to test git branches");
    }

}
