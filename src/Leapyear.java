import java.util.Scanner;
public class Leapyear {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.println(num%4==0?"Leap Year":"Not a Leap Year");;
    }
}
