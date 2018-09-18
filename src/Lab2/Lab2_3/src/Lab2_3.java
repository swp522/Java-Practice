/*
1. 본 과제에서 작성하는 코드는 UserInput.java, Utility.java, Lab2_3.java 파일로 나뉜다.
2. UserInput 클래스를 작성하라.
 1). 사용자로부터 하나의 정수를 입력받는 메소드 int getInteger()
 2). 사용자로부터 두 개의 정수를 입력받는 메소드 int[] getTwoIntegers()
 3). 사용자로부터 여러 개의 정수를 입력받는 메소드 int[] getMultipleIntegers()
3. 그리고 UserInput 클래스의 getInteger() 와 getTwoIntegers() 모소드를 사용하고
Utility 클래스의 메소드를 사용하여, Lab2_1, Lab2_2 와 동일하게 동작하는 Lab2_3 프로그램을 작성하라.
4. 그리고, UserInput 클래스의 getMultipleIntegers() 메소드를 사용하여
사용자 입력된 숫자들의 Factorial 과 Fibonacci 계산결과를 출력하라.
 */

public class Lab2_3 {

    public static void main(String[] args){
        System.out.print("Factorial ");
        int value = UserInput.getInteger();
        int result = Utility.factorial(value);
        System.out.println(value + "! = "+ result);     // factorial 함수 출력

        System.out.print("FIbonacci ");
        value = UserInput.getInteger();
        result = Utility.fibonacci(value);
        System.out.println("F(" + value + ") = " + result);     // fibonacci 함수 출력

        System.out.print("Power 의 ");
        int[] tmp = UserInput.getTwoIntegers();
        result = Utility.power(tmp[0],tmp[1]);
        System.out.println(tmp[0] + "^" + tmp[1] + "=" + result);       // power 함수 출력

        System.out.print("gcd 를 구할 ");
        tmp = UserInput.getTwoIntegers();
        result = Utility.gcd(tmp[0],tmp[1]);
        System.out.println("gcd(" + tmp[0] + ", " + tmp[1] + ") = " + result);      // 최대공약수 출력

        System.out.print("lcm 을 구할 ");
        int[] tmp1 = UserInput.getTwoIntegers();
        result = Utility.lcm(tmp1[0],tmp1[1]);
        System.out.println("lcm(" + tmp1[0] + ", " + tmp1[1] + ") = " + result);    //최소공배수 출력

        System.out.print("Factorial ");
        int[] tmp2 = UserInput.getMultiIntegers();
        for(int i=0; i < tmp2[0]; i++) {
            result = Utility.factorial(tmp2[i + 1]);
            System.out.println(result);     // 여러개의 factorial 함수 출력
        }

        System.out.print("Fibonacci ");
        int[] tmp3 = UserInput.getMultiIntegers();
        for(int i=0; i < tmp3[0]; i++) {
            result = Utility.fibonacci(tmp3[i + 1]);
            System.out.println(result);     // 여러개의 fibonacci 함수 출력
        }
    }
}
