import java.util.Scanner;

public class UserInput {
    static Scanner scan = new Scanner(System.in);

    public static boolean getExitKey(){
        System.out.println("계속 진행하려먼 아무키를 누르고 나가려먼 'q' 를 누르세요");
        String input = scan.nextLine();
        if (input == null)
            System.out.println("input null");
        if (input.equals("q"))
            return true;
        return false;
    }

    public static PersonMode getPersonMode(){
        System.out.println("[PERSON, YOU_TUBER, FOREIGNER] 중에 선택하시오 : ");
        String input = scan.nextLine();
        return PersonMode.valueOf(input);
    }

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

    public static AddressBookMode getAddressBookMode(){
        System.out.println("[ADDRESSBOOK, SCHOOL] 중에 선택하시오 : ");
        String input = scan.nextLine();
        return AddressBookMode.valueOf(input);
    }


    public static School getSchool(){
        System.out.print("name address phonenumber grade schoolname를 입력하세요 : ");
        String name = scan.next();
        String address = scan.next();
        String phonenumber = scan.next();
        int grade = scan.nextInt();
        String schoolname = scan.next();
        scan.nextLine();
        return new School(name, address, phonenumber, schoolname, grade);
    }

    public static AddressBook getAddressBook(){
        System.out.print("name address phonenumber를 입력하세요 : ");
        String name = scan.next();
        String address = scan.next();
        String phonenumber = scan.next();
        scan.nextLine();
        return new AddressBook(name, address, phonenumber);
    }

}