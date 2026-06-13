import java.util.Scanner;


public class Fibonacciseries {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int a =0 ,b=1;
        for(int i=1;i<=num;i++){
            int c = a + b;
            a=b;
            b=c;
            System.out.println(a);

        }

        sc.close();
    }
}
