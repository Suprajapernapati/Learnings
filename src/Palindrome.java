import java.util.Scanner;


public class Palindrome {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        int temp=num;
        int rev = 0;
        while(num>0){
            int a = num%10;
            rev = rev*10+a;
            num = num/10;
        }
        System.out.println(temp==rev?"Palindrome":"Not a Palindrome");;
        sc.close();
    }
}
