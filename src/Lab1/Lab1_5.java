/*
1. 본 과제에서 작성하는 코드는 Lab1_5.java 파일에 저장한다.
2. 1~99까지의 정수를 키보드로부터 입력받고 정수에 5, 7, 9 중 하나가 있는 경우는
“안녕＂을 출력하고 두 개 있는 경우는 “안녕 안녕~＂을 출력하는 프로그램을 작성하라.
3. 예를 들면, 키보드로 입력된 수가 19인 경우 “안녕＂을, 75인 경우 “안녕 안녕~＂을 출력하면 된다.
만약5, 7, 9 중한개도없는경우에는“5, 7, 9 없음” 을 출력하라.
 */

import java.util.Scanner;

public class Lab1_5 {

    static Scanner scan = null;             // 문자 입력 값 받기 위해 Scanner 사용
    public static int getUserInteger() {    // getUserInteger 로 정수를 받는다.
        scan = new Scanner(System.in);
        int value;                          // value 변수 선언
        do {
            System.out.println("1~99까지의 정수를 입력하세요 :   ");
            String line = scan.nextLine();
            value = Integer.parseInt(line);
        }while(value < 1 || value > 100);   // do while 문을 통해 정수를 입력받을 때, 1이상 99이하 이외의 정수를 받게
        return value;                       // 되면 재입력하도록 설정하고, 알맞게 입력받은 값을 return 함
    }

    public static void main(String[] args) {
        int value = getUserInteger();       // getUserInteger 로 정수값 value 로 받는다

        if (value / 10 == 5 || value / 10 == 7 || value / 10 == 9 ) {       // 두 자리 정수에서 십의 자리수에 5 ,7, 9 확인
            if (value % 10 == 5 || value % 10 == 7 || value % 10 == 9) {    // 있을 경우, 일의 자리도 확인
                System.out.println("안녕 안녕~");                            // 십, 일 의 자리 모두 있을경우 안녕 안녕~ 출력
            } else {
                System.out.println("안녕");                                 // 일의 자리에는 없을 경우 안녕 출력
            }
        }   else if(value % 10 == 5 || value % 10 == 7 || value % 10 == 9){
            System.out.println("안녕");                                     // 일의 자리에만 있을 경우에도 안녕 출력
        }
        else
            System.out.print("5, 7, 9 없음");                               // 모두 없을 경우 5,7,9 없음 출력
    }
}