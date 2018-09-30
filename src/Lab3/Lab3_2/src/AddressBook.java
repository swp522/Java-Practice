public class AddressBook {
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
}