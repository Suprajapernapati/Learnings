import java.util.Scanner;
public class Strongnumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int  num = sc.nextInt();
        int sum =0;
        int temp = num;
        while (num>0){
            int digit= num%10;
            int fact=1;
            for(int i =1;i<=digit;i++) {
                fact =fact*i;

            }

                sum= sum+fact;
                num = num/10;

        }
        System.out.println(temp==sum?"Strong Number":"Not a Strong Number");
        sc.close();
    }
}
