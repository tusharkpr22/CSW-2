import java.util.*;
public class Q1 {
    public static boolean isPrime(int a){
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 19;
        System.out.println(isPrime(n));

    }
}
