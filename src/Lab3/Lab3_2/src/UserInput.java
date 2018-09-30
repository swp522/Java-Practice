import java.util.Scanner;

public class UserInput {
    static Scanner scan = new Scanner(System.in);

    public static boolean getExitKey() {
        System.out.println("계속 진행하려먼 아무키를 누르고 나가려먼 'q' 를 누르세요");
        String input = scan.nextLine();
        if (input == null)
            System.out.println("input null");
        if (input.equals("q"))
            return true;
        return false;
    }

    public static YouTuber getYouTuber(){
        System.out.print("name age weight height gender channelName subscribers 를 입력하세요 : ");
        String name = scan.next();
        int age = scan.nextInt();
        double weight = scan.nextDouble();
        double height = scan.nextDouble();
        Gender gender = Gender.valueOf(scan.next());
        String channelName = scan.next();
        int subscribers = scan.nextInt();
        scan.nextLine();
        return new YouTuber(name, age, weight, height, gender, channelName, subscribers);
    }

    public static Foreigner getForeigner(){
        System.out.print("name age weight height gender country를 입력하세요 : ");
        String name = scan.next();
        int age = scan.nextInt();
        double weight = scan.nextDouble();
        double height = scan.nextDouble();
        Gender gender = Gender.valueOf(scan.next());
        String country = scan.next();
        scan.nextLine();
        return new Foreigner(name, age, weight, height, gender, country);
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
}