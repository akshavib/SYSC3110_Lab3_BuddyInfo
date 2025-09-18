public class BuddyInfo {
    private String name;
    private String address;
    private String phonenumber;

    public BuddyInfo(String name, String address, String phonenumber) {
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
    }

    public BuddyInfo() {
        this.name = "Ianos";
        this.address = "67 Lollipop Street";
        this.phonenumber = "352-098-2929";
    }

    public String getName() {

        return name;
    }

    public static void main(String[] args) {
        BuddyInfo myBuddy = new BuddyInfo("Diane", "33 Coolio Drive", "203-425-9992");
        String buddyName = myBuddy.getName();
        System.out.println("Hello " + buddyName);
    }
}
