package summ; 

import java.util.Scanner;
public class Summ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number(100-999): ");
        int num = scan.nextInt();
        System.out.println("Сумма цифр числа " + num +" равна "+((num%10)+((num/10)%10)+((num/100)%10));
        
    }
    
}
