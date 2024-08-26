import java.util.Scanner;
public class NumberIsDivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result = (n%7==0&&n%11==0)?" Divisible":"Not Divisible";
        System.out.println(result);

    }
}
