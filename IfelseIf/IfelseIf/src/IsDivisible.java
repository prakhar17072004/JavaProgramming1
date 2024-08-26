import java.util.Scanner;
public class IsDivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();
        if(x%7==0&&x%11==0)
        {
            System.out.println(+x+ " is divisible by 7 & 11");
        }
        else {
            System.out.println(+x+ " Not Divisible by 7 & 11");
        }
    }
}
