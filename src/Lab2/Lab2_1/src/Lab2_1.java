/*
1.본 과제에서 작성하는 코드는 Lab2_1.java 파일에 저장한다.
2. 재귀호출을 사용하여, 다음 메소드 프로그램을 작성하라. 이 프로그램은 사용자 입력을 받아서 계산하여 출력한다.
1). 양의 정수 n의 n! 메소드를 작성하라.
2). 양의 정수 n의 f(n) 메소드를 작성하라
3). 양의 정수 b,n b^n 메소드를 작성하라
4). 양의 정수 a,b 의 최대공약수 메소드를 작성하라
5). 본인이 원하는 재귀호출 메소드를 추가로 작성하라 ( 최대공약수 메소드 )
 */

import java.util.Scanner;

public class Lab2_1 {
    static Scanner scan = new  Scanner(System.in);      // 문자 입력 값 받기 위해 Scanner 사용
    public static int getUserInteger() {                // getUserInteger 로 정수를 받는다
        System.out.println("정수를 입력하세요 : ");
        int value = scan.nextInt();
        scan.nextLine();
        return value;                                   // 받은 정수를 value로 return 한다
    }

    public static int factorial(int n){
        if(n==1)
            return 1;
        else
            return(n * factorial(n-1));             // factorial 구현하는 함수
    }

    public static int fibonacci(int n ){
        if(n==0) return 0;
        if(n==1) return 1;
        return fibonacci(n-1) + fibonacci(n-2); // fibonacci 구현하는 함수
    }

    public static int power(int b, int n){
        if(n==0)
            return 1;
        else
            return(b * power(b,n-1));               // power 구현하는 함수
    }

    public static int gcd(int a, int b){
        if(b==0)
            return a;
        else
            return gcd(b,a%b);                      // 최대공약수 구현하는 함수
    }

    public static int lcm(int a, int b){
        return ( a * b / gcd(b,a%b));               // 최소공배수 구현하는 함수
    }

    public static void main(String[] args){
        System.out.print("factorial ");
        int value = getUserInteger();
        int result = factorial(value);
        System.out.println(value + "! = "+ result);     // factorial 출력

        System.out.print("fIbonacci ");
        value = getUserInteger();
        result = fibonacci(value);
        System.out.println("F(" + value + ") = " + result);     // fibonacci 출력

        System.out.print("super 의 degree ");
        value = getUserInteger();
        int num = getUserInteger();
        result = power(num, value);
        System.out.println(num + "^" + value + " = " + result);     // super 출력

        System.out.print("gcd 를 구할 첫번째 ");
        int num1 = getUserInteger();
        System.out.print("두번째 ");
        int num2 = getUserInteger();
        result = gcd(num1, num2);
        System.out.println("gcd(" + num1 + ", " + num2 + ") = " + result);      // num1,num2 의 최대공약수 출력

        System.out.print("lcm 을 구할 첫번째 ");
        num1 = getUserInteger();
        System.out.print("두번째");
        num2 = getUserInteger();
        result = lcm(num1, num2);
        System.out.println("lcm(" + num1 + ", " + num2 + ") = " + result);      // num1,num2 의 최소공배수 출력
    }
}