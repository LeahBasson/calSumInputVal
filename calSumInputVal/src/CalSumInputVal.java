
import java.util.Scanner;


public class CalSumInputVal {

   
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int num1,num2,num3,sum;
        
        System.out.println("===== Calculating the sum of 3 values =====");
        System.out.print("Enter value 1: ");
        num1 = scn.nextInt();
       
        System.out.print("Enter value 2: ");
        num2 = scn.nextInt();
        
        System.out.print("Enter value 3: ");
        num3 = scn.nextInt();
        
        sum = num1 + num2 + num3;
        
        System.out.println("==== Result of the sum of 3 values ====");
        System.out.println("Answer: "+ sum);
    }
    
}
