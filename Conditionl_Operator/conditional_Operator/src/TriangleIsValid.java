import java.util.Scanner;

public class TriangleIsValid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        String result = (a+b>c&& b+c>a&& c+a>b)?"Triangle is valid ":"Triangle is not valid";
        System.out.println(result);

    }
}
