package FibonacciSequence;

public class Fibonacci {
    static Integer[] memo = new Integer[100]; // as we need nulls in array as initials
    public static int fib(int n){
        if (memo[n] != null){
            return memo[n];
        }
        if (n == 0 || n == 1) return  n;
        memo[n] = fib(n-1)+ fib(n-2);
        return memo[n];
    }

    public static int fibBottomUp(int n){
        int[] fibList = new int[n+1];
        fibList[0] = 0;
        fibList[1] = 1;

        for(int i = 2; i <= n; i++){
            fibList[i] = fibList[i-1]+ fibList[i-2];
        }

        return fibList[n];

    }
    public static void main(String[] args) {
        System.out.println(fibBottomUp(7));
    }
}
