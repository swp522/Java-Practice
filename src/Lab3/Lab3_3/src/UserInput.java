import java.util.Scanner;

public class UserInput {
    static Scanner scan = new Scanner(System.in);

    public static Person getPerson() {
        System.out.print("name age weight height gender 를 입력하세요 : ");
        String name = scan.next();
        int age = scan.nextInt();
        double weight = scan.nextDouble();
        double height = scan.nextDouble();
        Gender gender = Gender.valueOf(scan.next());
        scan.nextLine();
        return new Person(name, age, weight, height, gender);
    }

    public static AddressBook getAddressBook(){
        System.out.print("name address phonenumber 를 입력하세요 : ");
        String name = scan.next();
        String address = scan.next();
        String phonenumber = scan.next();
        scan.nextLine();
        return new AddressBook(name, address, phonenumber);
    }

    public static YouTuber getYouTuber(){
        System.out.print("name age weight height gender channelName subscribers 를 입력하세요 : ");
        String name = scan.next();
        int age = scan.nextInt();
        double weight = scan.nextDouble();
        double height = scan.nextDouble();
        Gender gender = Gender.valueOf(scan.next());
        String channelname = scan.next();
        int subscribers = scan.nextInt();
        scan.nextLine();
        return new YouTuber(name, age, weight, height, gender, channelname, subscribers);
    }

    public static Foreigner getForeigner(){
        System.out.print("name age weight height gender country 를 입력하세요 : ");
        String name = scan.next();
        int age = scan.nextInt();
        double weight = scan.nextDouble();
        double height = scan.nextDouble();
        Gender gender = Gender.valueOf(scan.next());
        String country = scan.next();
        scan.nextLine();
        return new Foreigner(name, age, weight, height, gender, country);
    }

    public static PersonScore getPersonScore(){
        System.out.print("name subject score 를 입력하셍 : ");
        String name = scan.next();
        String subject = scan.next();
        String score = scan.next();
        scan.nextLine();
        return new PersonScore(name, subject, score);
    }
}