/*
1.Person 클래스에 Comparable과 Comparator 인터페이스를 작성하라.
2.AddressBook클래스에Comparable과 Comparator 인터페이스를 작성하라.
3.YouTuber 클래스에 Comparable과 Comparator 인터페이스를 작성하라.
4.Foreigner클래스에 Comparable과 Comparator 인터페이스를 작성하라.
5.본인이작성한클래스에 Comparable과 Comparator 인터페이스를 작성하라.
6.그리고, Lab3_3 클래스에서는Person, AddressBook, YouTuber, Foreigner, 본인의 추가클래스의 배열에 사용자입력을 통하여 데이터를넣고,
사용자 입력이 완료되면 각 클래스의 멤버 별로 sort한 결과를 출력하라.
 */

import java.util.Arrays;

public class Lab3_3 {
    public static void main(String[] args) {

        Person[] avengers = new Person[3];     // 배열 크기[3] 설정
        AddressBook[] addressbooks = new AddressBook[3];
        YouTuber[] youtuber = new YouTuber[3];
        Foreigner[] foreigner = new Foreigner[3];
        PersonScore[] personscore = new PersonScore[3];

        for (int i = 0; i < 3; i++) {
            avengers[i] = UserInput.getPerson();
        }
        System.out.println("------Person-------");

        System.out.println("******sort by name******");
        Arrays.sort(avengers);
        printAvengers(avengers);

        System.out.println("******sort by age******");
        Arrays.sort(avengers, Person.AgeComparator);
        printAvengers(avengers);

        System.out.println("******sort by weight******");
        Arrays.sort(avengers, Person.WeightComparator);
        printAvengers(avengers);

        System.out.println("******sort by height******");
        Arrays.sort(avengers, Person.HeightComparator);
        printAvengers(avengers);


        for (int i = 0; i < 3; i++) {
            addressbooks[i] = UserInput.getAddressBook();
        }
        System.out.println("-------AddressBook-------");

        System.out.println("******sort by name******");
        Arrays.sort(addressbooks);
        printAddressBook(addressbooks);

        System.out.println("******sort by address******");
        Arrays.sort(addressbooks, AddressBook.AddressComparator);
        printAddressBook(addressbooks);

        System.out.println("******sort by phonenumber******");
        Arrays.sort(addressbooks, AddressBook.PhoneNumberComparator);
        printAddressBook(addressbooks);


        for (int i = 0; i < 3; i++) {
            youtuber[i] = UserInput.getYouTuber();
        }
        System.out.println("------YouTuber------");

        System.out.println("******sort by channelname");
        Arrays.sort(youtuber, YouTuber.ChannelNameComparator);
        printYouTuber(youtuber);

        System.out.println("******sort by subscribers******");
        Arrays.sort(youtuber, YouTuber.SubscribersComparator);
        printYouTuber(youtuber);


        for (int i = 0; i < 3; i++) {
            foreigner[i] = UserInput.getForeigner();
        }
        System.out.println("------Foreigner------");

        System.out.println("******sort by country******");
        Arrays.sort(foreigner, Foreigner.CountryComparator);
        printForeigner(foreigner);

        for (int i = 0; i < 3; i++){
            personscore[i] = UserInput.getPersonScore();
        }
        System.out.println("------PersonScore------");

        System.out.println("******sort by name******");
        Arrays.sort(personscore);
        printPersonScore(personscore);

        System.out.println("******sort by subject******");
        Arrays.sort(personscore, PersonScore.SubjectComparator);
        printPersonScore(personscore);

        System.out.println("******sort by score******");
        Arrays.sort(personscore, PersonScore.ScoreComparator);
        printPersonScore(personscore);
    }


    public static void printAvengers(Person[] avengers){
        for (Person p : avengers) {
            System.out.println(p);
        }
    }

    public static void printAddressBook(AddressBook[] addressbooks){
        for (AddressBook a : addressbooks){
            System.out.println(a);
        }
    }

    public static void printYouTuber(YouTuber[] youtuber){
        for (YouTuber y : youtuber){
            System.out.println(y);
        }
    }
    public static void printForeigner(Foreigner[] foreigner){
        for (Foreigner f : foreigner){
            System.out.println(f);
        }
    }
    public static void printPersonScore(PersonScore[] personscore){
        for (PersonScore s : personscore){
            System.out.println(s);
        }
    }
}