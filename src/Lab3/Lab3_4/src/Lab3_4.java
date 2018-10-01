/*
1.PersonMode열거형을작성하라. PERSON, YOU_TUBER, FOREIGNER 
2.UserInput클래스에다음메소드를추가로작성하라. 
   1).사용자로부터하나의PersonMode열거형을입력받는메소드PersonMode getPersonMode() 
   2).사용자로부터q-key를입력받았으면true, 아니면false를주는메소드Boolean getExitKey()
3.그리고, PersonFactory클래스를작성하라. 
   1).사용자로부터PersonMode에따라서사용자입력을받아해당객체를넘겨주는메소드 Person getInstance(PersonModemode) 
4.그리고, for을사용하여PersonMode를선택하여각종 Person/YouTuber/Foreigner를입력받아출력하는,Lab3_4 프로그램을작성 하라. 
5.그리고, AddressBookMode열거형, AddressModeFactory클래스를작성하 고Lab3_4에추가테스트한다.
*/
public class Lab3_4 {
    public static void main(String[] args) {

        for(PersonMode mode: PersonMode.values()){
            selectpersonmode(mode);
        }

        /*for (AddressBookMode mode : AddressBookMode.values()) {
            selectaddress(mode);
        }*/
    }


    public static void selectpersonmode(PersonMode mode){
        PersonMode input = UserInput.getPersonMode();

        switch(mode){
            case PERSON:
                do {
                    Person p = UserInput.getPerson();
                    System.out.println(p);
                } while(!UserInput.getExitKey());
                break;

            case YOU_TUBER:
                do {
                    YouTuber y = UserInput.getYouTuber();
                    System.out.println(y);
                } while(!UserInput.getExitKey());
                break;

            case FOREIGNER:
                do{
                    Foreigner f = UserInput.getForeigner();
                    System.out.println(f);
                } while(!UserInput.getExitKey());
                break;
            default:
                break;

        }
    }

    /*public static void selectaddress(AddressBookMode mode) {
        AddressBookMode input = UserInput.getAddressBookMode();

            switch (mode) {
                case ADDRESSBOOK:
                    do {
                        AddressBook a = UserInput.getAddressBook();
                        System.out.println(a);
                    } while (!UserInput.getExitKey());
                    break;

                case SCHOOL:
                    do {
                        School s = UserInput.getSchool();
                        System.out.println(s);
                    } while (!UserInput.getExitKey());
                    break;
            }
    }*/
}