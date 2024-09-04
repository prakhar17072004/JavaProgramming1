import java.util.Scanner;
public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int sum= 0;
        while (i<=99) {
            System.out.println(i +" ");
            sum = sum+i; 
            i++;
        }
        
        System.out.println("The sum of Natural no. is :" + sum);
        sc.close();
    }
}
