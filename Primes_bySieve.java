//for discription check out README
import java.util.Scanner;
import java.util.Arrays;
public class Primes_bySieve{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Limt for printing the Prime Numbers :");
        long number = sc.nextLong();
        isPrime(number);
    }
    public static void isPrime(long number) {
        boolean[] ar = new boolean[(int)number+1];
        Arrays.fill(ar,true);
        ar[0] = false;
        ar[1] = false;
        for(int i=2;i<Math.sqrt(number);i++){
            if(ar[i]){
                for(int j=i*i;j<number;j+=i){
                    ar[j] = false;
                }
            }
        }
        for(int i=2;i<=number;i++){
            if(ar[i]){
                System.out.print(i+" ");
            }
        }
    }
}
