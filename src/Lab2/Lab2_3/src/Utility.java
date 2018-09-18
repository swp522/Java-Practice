public class Utility {
    public static int factorial(int n){
        if(n==1)
            return 1;
        else
            return(n * factorial(n-1));
    }

    public static int fibonacci(int n ){
        if(n==0) return 0;
        if(n==1) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static int power(int b, int n){
        if(n==0)
            return 1;
        else
            return(b * power(b,n-1));
    }

    public static int gcd(int a, int b){
        if(b==0)
            return a;
        else
            return gcd(b,a%b);
    }

    public static int lcm(int a, int b){
        return ( a * b / gcd(b,a%b));
    }
}