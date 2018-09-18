/*
1. 본 과제에서 작성하는 코드는 UserInput.java, Utility.java, Lab2_2.java 파일로 나뉜다.
2. 사용자로부터 정수를 입력받는 메소드를 포함하는, UserInput 클래스를 작성하라.
3. Lab2_1에서 작성했던 method를 포함하는, Utility 클래스를 작성하라.
4. 그리고, UserInput 클래스의 메소드와 Utility 클래스의 메소드를 사용하여, Lab2_1과 동일하게 동작하는 Lab2_2 프로그램을 작성하라.
 */
public class Lab2_2 {
    public static void main(String[] args){
        System.out.print("factorial ");
        int value = UserInput.getUserInteger();
        int result = Utility.factorial(value);
        System.out.println(value + "! = "+ result);             // factorial 실행

        System.out.print("fIbonacci ");
        value = UserInput.getUserInteger();
        result = Utility.fibonacci(value);
        System.out.println("F(" + value + ") = " + result);     // fibonacci 실행

        System.out.print("super 의 degree ");
        value = UserInput.getUserInteger();
        int num = UserInput.getUserInteger();
        result = Utility.power(num, value);
        System.out.println(num + "^" + value + " = " + result); // super 함수 실행

        System.out.print("gcd 를 구할 첫번째 ");
        int num1 = UserInput.getUserInteger();
        System.out.print("두번째 ");
        int num2 = UserInput.getUserInteger();
        result = Utility.gcd(num1, num2);
        System.out.println("gcd(" + num1 + ", " + num2 + ") = " + result);  // 최대공약수 함수 실행

        System.out.print("lcm 을 구할 첫번째 ");
        num1 = UserInput.getUserInteger();
        System.out.print("두번째");
        num2 = UserInput.getUserInteger();
        result = Utility.lcm(num1, num2);
        System.out.println("lcm(" + num1 + ", " + num2 + ") = " + result);  // 최소공배수 함수 실행
    }
}