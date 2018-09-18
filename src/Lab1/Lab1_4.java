/*
1.본 과제에서 작성하는 코드는 Lab1_4.java 파일에 저장한다.
2. 키보드에서 정수로 된 돈의 액수를 입력받아,
오만원권, 만원권, 천원권, 500원, 100원, 10원, 1원짜리 동전 각 몇 개로 변환되는지 출력하라.
예를 들어, 655370이 입력되면 오만원권 1매, 만원권1매, 천원권5매, 100원 짜리동전3개, 50원짜리 동전1개, 10원짜리 동전 2개를 출력한다.
 각 단위의 돈을 출력할 때에는 줄을 바꿔서 출력한다.
 */

import java.util.Scanner;

public class Lab1_4 {

    static Scanner scan = null;                 // 문자 입력 값 받기 위해 Scanner 사용
    public static int getUserInteger() {        // getUserInteger 로 정수를 받는다.
        scan = new Scanner(System.in);
        System.out.println("금액을 입력하세요 :  ");
        String line = scan.nextLine();
        int money = Integer.parseInt(line);
        return money;                           // 받은 정수를 moeny 로 return 한다
    }

    public static void main(String[] args){
        int money = getUserInteger();           // return 한 value 를 받는다
        int number;                             // 새로운 변수 number 선언

        number = money/50000;
        System.out.println("오만원"+number+"개,");
        money %= 50000;

        number = money/10000;
        System.out.println("만원"+number+"개,");
        money %= 10000;

        number =  money/1000;
        System.out.println("천원"+number+"개,");
        money %= 1000;

        number = money/100;
        System.out.println("100원"+number+"개,");
        money %= 100;

        number = money/50;
        System.out.println("50원"+number+"개,");
        money %=50;

        number = money/10;
        System.out.println("10원"+number+"개");
        money %=10;
    }   // number 변수에는 입력받은 money 를 각각 50000,10000,1000,100,50,10 순서대로 나누어 떨어질 때까지
        // '/' 연산을 수행해서 각 지폐와 동전의 개수를 구할 수 있도록 설계함
        // 단계별로 나누어 '%/' 으로 인해 나머지 금액이 다음 단계로 넘어가는 형태
        //
}