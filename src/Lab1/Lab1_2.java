/*
1.본 과제에서 작성하는 코드는 Lab1_2.java 파일에 저장한다.
2.사용자로부터 정수형 값을 한 개 입력받아서 만약 그 값이 50이하이면 ‘50이하의 숫자가 입력됨’,
 51~70이면 ‘51~70의 숫자가 입력됨’, 71이상이면 ‘71이상의 숫자가 입력됨’을 출력하라.
*/

import java.util.Scanner;

public class Lab1_2 {

    static Scanner scan = null;                 // 문자 입력 값 받기 위해 Scanner 사용
    public static int getUserInteger()	{        // getUserInteger 로 정수를 받는다.
        scan = new Scanner(System.in);
        System.out.println("정수를 입력하세요:  ");
        String line = scan.nextLine();
        int value = Integer.parseInt(line);
        return value;                           // 받은 정수를 value 로 return 한다
    }

    public static void main(String[] args) {
        int value = getUserInteger();           // return 한 value 를 받는다
        if(value <= 50)
            System.out.println(value + ":" + "50 이하의 숫자가 입력됨");
        else if (value > 50 && value <= 70)
            System.out.println(value + ":" + "51~70의 숫자가 입력됨");
        else
            System.out.println(value + ":" + "71이상의 숫자가 입력됨");
    }                                           // if 문으로50이하 51~10 그리고 71 이상의 구간을 나누어 다르게 출력//
}