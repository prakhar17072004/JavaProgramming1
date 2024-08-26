import java.util.Scanner;
public class LowerOrUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char a= sc.nextLine().charAt(0);
        if(a>=97&&a<=122)
        {
            System.out.println("in lowercase");
        } else if (a>=65&&a<=90) {
            System.out.println("uppercase letter");

        }
        else {
            System.out.println("wrong input");
        }
    }
}
