import java.util.Scanner;
public class prime {
    public static void main(String args[]){
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=2;i<a/2;i++) {
            if (a % i == 0) {
                System.out.println("It is not prime");
            } else {
                System.out.println("It is prime");
            }
        }
    }
}
