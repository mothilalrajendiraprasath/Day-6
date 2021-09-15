import javax.swing.*;
import java.util.Scanner;
public class perfect {
    public static void main(String args[]){
       System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i,sum=0;
        for( i=1;i<a;i++) {
            if (a % i == 0) {
                sum += i;
            }
        }
            System.out.println("sum of the divisors:" + sum);
        if(sum == a) {
            System.out.println(a + "=" + sum + " " + "So,It is  perfect number");
        }else{
                System.out.println(a + "!=" + sum + " " + "So,It is not perfect number");
        }
    }
}
