/*
<응용컴퓨터공학과 32141762 박성원>

1.Person클래스를작성하라.
    1.String name, intage, double weight, double height, Gender gender멤버를갖는다.
    2.생성자/Getter/Setter/ToString메소드를작성하라.
2.AddressBook클래스를작성하라.
    1.String name, String address, String phone 멤버를갖는다.
    2.생성자/Getter/Setter/ToString메소드를작성하라.
3.UserInput클래스에서는사용자로부터Person, AddressBook을입력받는 메소드를포함한다.
4.Lab3_1 클래스에서는Person, AddressBook배열에 사용자 입력을 통하여 데이터를넣고,
  사용자입력이완료되면전체를출력하라.
5.본인이원하는클래스를추가로작성하고, Lab3_1에서테스트한다.
*/

public class Lab3_1 {
    public static void main(String[] args){

        Person[] avengers = new Person[3];     // 배열 크기[3] 설정
		for (int i=0; i < 3; i++) {
			avengers[i] = UserInput.getPerson();
		}
		for (Person p : avengers) {
			System.out.println(p);
		}                                      // Person 정보 입력받고 출력

        do {
            AddressBook b = UserInput.getAddressBook();
            System.out.println(b);             // AddressBook 정보 입력받고 출력
        } while(!UserInput.getExitKey());      // q 누르면 Exit

        do {
            PersonScore b = UserInput.getPersonScore();
            System.out.println(b);
        } while(!UserInput.getExitKey());

        System.out.println("끝");
    }
}