import java.util.Scanner;

public class IsAlphabetOrDigitOrSpecialCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char a = sc.nextLine().charAt(0);
        if((a>=97&&a<=122)||(a>=65&&a<=90)) {
            System.out.println("Character is Alphabet");
        } else if (a>=48&&a<=57) {
            System.out.println("Chracter is digit");

        }
        else{
            System.out.println("Special character");
        }
    }
}
