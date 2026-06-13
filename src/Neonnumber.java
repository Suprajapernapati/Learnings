import java.util.Scanner;
public class Neonnumber {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int sum = 0;
        int square;
        square = num*num;
        System.out.println(square);
        while(square>0){
            int digit = square%10;
            sum = sum +digit;
            square=square/10;
        }
        System.out.println(num ==sum?"Neon number":"Not a neon number");
    }
}
