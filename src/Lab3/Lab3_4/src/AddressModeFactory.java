public class AddressModeFactory {
    public static AddressBook getInstance(AddressBookMode mode){
        switch(mode){
            case ADDRESSBOOK:
                AddressBook addressbook = new AddressBook();
                return addressbook;
            case SCHOOL:
                School school = new School();
                return school;
            default:
                return null;
        }
    }
}
