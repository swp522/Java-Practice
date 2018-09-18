public class Utility {
    public static int factorial(int n){
        if(n==1)
            return 1;
        else
            return(n * factorial(n-1));     // factorial 함수 구현
    }

    public static int fibonacci(int n ){
        if(n==0) return 0;
        if(n==1) return 1;
        return fibonacci(n-1) + fibonacci(n-2);     // fibonacci 함수 구현
    }

    public static int power(int b, int n){
        if(n==0)
            return 1;
        else
            return(b * power(b,n-1));                   // power 함수 구현
    }

    public static int gcd(int a, int b){
        if(b==0)
            return a;
        else
            return gcd(b,a%b);                          // 최대공약수 함수 구현
    }

    public static int lcm(int a, int b){
        return ( a * b / gcd(b,a%b));
    }       // 최소공배수 함수 구현
}