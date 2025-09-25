import java.util.ArrayList;

/* this is the AddressBook class for Lab 3 */

public class AddressBook {
    private ArrayList<BuddyInfo> buddyBook;

    public AddressBook(){
        this.buddyBook = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        if (buddy != null){
            this.buddyBook.add(buddy);
        }
    }

    public BuddyInfo removeBuddy(int index){
        if (index >= 0 && index <= buddyBook.size()){
            return this.buddyBook.remove(index);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("****** Address Book ******");
        BuddyInfo myBuddy = new BuddyInfo("Lonita", "67 Lollipop Drive", "905-295-1953");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(myBuddy);
        addressBook.removeBuddy(0);
    }
}

