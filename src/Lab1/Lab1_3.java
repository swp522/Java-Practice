/*
1. 본 과제에서 작성하는 코드는 Lab1_3.java 파일에 저장한다.
2. 사용자로부터 정수형 값을 한 개 입력 받아서 만약 그 값이 50이면 “50이 입력됨”, 70이면 “70이 입력됨”,
 90이면 “90이 입력 됨”을 출력하고, 50, 70, 90 이 아닌 숫자가 입력되었을 경우에는 “50, 70, 90 이외의 숫자가 입력됨” 을 출력하라.
3. 이 과제는 switch문을 이용해서 작성하라.
 */

import java.util.Scanner;

public class Lab1_3 {

    static Scanner scan = null;             // 문자 입력 값 받기 위해 Scanner 사용
    public static int getUserInteger() {    // getUserInteger 로 정수를 받는다.
        scan = new Scanner(System.in);
        System.out.println("정수를 입력하세요 :   ");
        String line = scan.nextLine();
        int value = Integer.parseInt(line);
        return value;                       // 받은 정수를 value 로 return 한다
    }

    public static void main(String[] args){
        int value = getUserInteger();       // return 한 value 를 받는다
        switch (value) {
            case 50:
                System.out.println("50이 입력됨");
                break;
            case 70:
                System.out.println("70이 입력됨");
                break;
            case 90:
                System.out.println("90이 입력됨");
                break;
            default :
                System.out.println("50,70,90 이외의 숫자가 입력됨");
                break;
                        }                   // switch 문 case 를 나누어 50, 70, 90, 이외의 값 구간을 나누어 다르게 출력
    }
}