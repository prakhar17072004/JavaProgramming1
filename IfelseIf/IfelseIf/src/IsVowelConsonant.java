import java.util.Scanner;
public class IsVowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char x = sc.nextLine().charAt(0);
        if(x=='a'||x=='A'||x=='e'||x=='E'||x=='i'||x=='I'||x=='o'||x=='O'||x=='u'||x=='U')
        {
            System.out.println("vowel");
        } else if ((x!='a'||x!='A'||x!='e'||x!='E'||x!='i'||x!='I'||x!='o'||x!='O'||x!='u'||x!='U')&&(x>=65 && x<=90)&&(x>=97&&x<=122) ){
            System.out.println("consonant");
        }
        else{
            System.out.println("wrong input");
        }

    }
}
