import java.util.Scanner;

public class AlphaIsVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the char");
        char x =sc.next().charAt(0);
        String result= (x=='A'||x=='a'||x=='e'||x=='E'||x=='i'||x=='I'||x=='O'||x=='o'||x=='U'||x=='u')?"vowel":"Not vowel";
        System.out.println(result);

    }
}
