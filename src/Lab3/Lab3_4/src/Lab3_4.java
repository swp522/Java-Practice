/*
1.PersonMode���������ۼ��϶�. PERSON, YOU_TUBER, FOREIGNER 
2.UserInputŬ�����������޼ҵ带�߰����ۼ��϶�. 
   1).����ڷκ����ϳ���PersonMode���������Է¹޴¸޼ҵ�PersonMode getPersonMode() 
   2).����ڷκ���q-key���Է¹޾�����true, �ƴϸ�false���ִ¸޼ҵ�Boolean getExitKey()
3.�׸���, PersonFactoryŬ�������ۼ��϶�. 
   1).����ڷκ���PersonMode�����󼭻�����Է����޾��ش簴ü���Ѱ��ִ¸޼ҵ� Person getInstance(PersonModemode) 
4.�׸���, for������Ͽ�PersonMode�������Ͽ����� Person/YouTuber/Foreigner���Է¹޾�����ϴ�,Lab3_4 ���α׷����ۼ� �϶�. 
5.�׸���, AddressBookMode������, AddressModeFactoryŬ�������ۼ��� ��Lab3_4���߰��׽�Ʈ�Ѵ�.
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