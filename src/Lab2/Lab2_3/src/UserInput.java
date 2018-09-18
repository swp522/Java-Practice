import java.util.Scanner;
import java.util.*;

public class UserInput {
    static Scanner scan = new Scanner(System.in);
    public static int getInteger(){
        System.out.println("정수를 입력하세요 : ");
        int value = scan.nextInt();
        scan.nextLine();
        return value;                               // 정수를 한 개만 받는 case
    }

    public static int[] getTwoIntegers(){
        System.out.println("첫번째 정수을 입력하세요 : ");
        int value1 = scan.nextInt();
        System.out.println("두번째 정수를 입력하세요 : ");
        int value2 = scan.nextInt();
        int[] tmp = {value1, value2};
        return tmp;                                 // 정수를 두 개 받는 case
    }

    public static int[] getMultiIntegers(){
        System.out.println("몇개의 정수를 입력할지 정하세요 : ");
        int number = scan.nextInt();
        int[] tmp = new int[1000];
        tmp[0] = number;
        for(int i=1;i<=number;i++) {
            System.out.print("[" + (i) + "]" + "번째 정수 값을 입력하세요 : ");
            tmp[i] = scan.nextInt();
        }
        return tmp;                                 // 정수를 원하는 만큼 받는 case
    }
}