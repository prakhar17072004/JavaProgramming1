import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        System.out.println("Enter the value of Triangle");
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc. nextInt();
        int c = sc.nextInt();
        if((a+b+c == 180) && a!=0&& b!=0&& c!=0)
        {
            System.out.println("Triangle is valid triangle");
        }
        else {
            System.out.println("Triangle is not valid ");
        }
    }
}
