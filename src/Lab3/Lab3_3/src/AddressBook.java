import java.lang.Comparable;
import java.util.Comparator;

public class AddressBook implements  Comparable<AddressBook> {
    String name;
    String address;
    String phonenumber;

    public AddressBook(){
        this(null, null, null);
    }

    public AddressBook(String name, String address, String phonenumber){
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String toString(){
        return String.format("%s,%s,%s", name, address, phonenumber);
    }

    @Override
    public int compareTo(AddressBook a){
        return name.compareTo(a.name);
        }

    public static Comparator<AddressBook> AddressComparator = new Comparator<AddressBook>() {
        @Override
        public int compare(AddressBook a1, AddressBook a2) {
            String address1 = a1.getAddress().toUpperCase();
            String address2 = a2.getAddress().toUpperCase();

            return address1.compareTo(address2);
        }
    };

    public static Comparator<AddressBook> PhoneNumberComparator = new Comparator<AddressBook>() {
        @Override
        public int compare(AddressBook a1, AddressBook a2) {
            String phonenumber1 = a1.getPhonenumber();
            String phonenumber2 = a2.getPhonenumber();

            return phonenumber1.compareTo(phonenumber2);
        }
    };
}