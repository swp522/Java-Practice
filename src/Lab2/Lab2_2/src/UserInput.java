import java.util.Scanner;

public class UserInput {
    static Scanner scan = new  Scanner(System.in);  // 입력 값 받기 위해 Scanner 사용
    public static int getUserInteger() {
        System.out.println("정수를 입력하세요 : ");
        int value = scan.nextInt();
        scan.nextLine();
        return value;                               // value 로 받은 값 return
    }
}
