//Java program to count number of trailing zeros in binary representation of a number using Bitset
import java.util.Scanner;
public class Main
{
    //Function to count number of trailing zeros in binary representation of a number using Bitset
    public static int solve(int a){
        int count = 0;
        while((a&1)==0 && a>0){
            count++;
            a/=2;
        }
        return count;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter an integer:");
	    int a = sc.nextInt();
	    int ans = solve(a);
	    System.out.println(ans);
	}
}
