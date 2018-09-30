import java.util.Scanner;

public class UserInput {
    static Scanner scan = new Scanner(System.in);

    public static boolean getExitKey(){
        System.out.println("계속 진행하려먼 아무키를 누르고 나가려먼 'q' 를 누르세요");
        String input = scan.nextLine();
        if(input == null)
            System.out.println("input null");
            if(input.equals("q"))
                return true;
        return false;
    }

    public static Person getPerson(){
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
        System.out.print("name address phonenuber 를 입력하세요 : ");
        String name = scan.next();
        String address = scan.next();
        String phonenumber = scan.next();
        scan.nextLine();
        return new AddressBook(name, address, phonenumber);
    }

    public static PersonScore getPersonScore(){
        System.out.print("name subject score 를 입력하세요 : ");
        String name = scan.next();
        String subject = scan.next();
        String score = scan.next();
        scan.nextLine();
        return new PersonScore(name, subject, score);
    }
}
