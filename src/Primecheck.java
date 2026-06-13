import java.util.Scanner;

public class Primecheck {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int count = 0;
        for(int i =1;i<=num;i++){
            if(num % i ==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("PrimeNumber");
        }
        else{
            System.out.println("Not a primenumber");
        }
        sc.close();
    }
}
