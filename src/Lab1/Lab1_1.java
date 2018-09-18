/*
1.본 과제에서 작성하는 코드는 Lab1_1.java 파일에 저장한다 .
2.사용자로부터 정수형 값을 한 개 입력 받아서 만약 50이상이면 “50보다 크거나 같음”을 출력하고 만약 작다면 “50보다 작음＂을 화면에 출력하라.
 */

import java.util.Scanner;

public class Lab1_1 {

    static Scanner scan = null;                  // 문자 입력 값 받기 위해 Scanner 사용
    public static int getUserInteger() {        // getUserInteger 로 정수를 받는다.
        scan = new Scanner(System.in);
        System.out.println("정수를 입력하세요:   ");
        String line = scan.nextLine();
        int value = Integer.parseInt(line);
        return value;                           // 받은 정수를 value 로 return 한다
    }

    public static void main(String[] args){
        int value = getUserInteger();           // return 한 value 를 받는다
        if(value >= 50)
            System.out.println("50보다 크거나 같음");
        else
            System.out.println("50보다 작음");
    }                                           // if 문으로 50을 경계로 구간을 나누어 다르게 출력함
}

// 정수를 받는 부분과 main 을 분리해 코드를 설계함으로써 가독성을 높혀보았다.//