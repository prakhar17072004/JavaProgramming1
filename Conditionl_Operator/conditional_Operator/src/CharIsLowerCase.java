import java.util.Scanner;
public class CharIsLowerCase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the character");
        char a = sc.next().charAt(0);
        String result = Character.isLowerCase(a)?"is in  lowercase": "is in Uppercase";
        System.out.println(result);

    }
}
