//Java program to count set bits in an integer
import java.util.Scanner;
public class Main
{
    //Function to get no. of set bits in binary representation of positive integer n
    public static int numSetBits(long a){
        int count = 0;
        while(a>0){
            a &= (a-1);
            count++;
        }
        return count;
    }
    
    //driver program
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter an integer:");
	    long a = sc.nextLong();
	    long ans = numSetBits(a);
	    System.out.println(ans);
	    
	}
}
