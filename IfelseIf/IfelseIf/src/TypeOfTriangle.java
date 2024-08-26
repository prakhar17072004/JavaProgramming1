import java.util.Scanner;
public class TypeOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        if(x==y &&y==z)
        {
            System.out.println("Triangle is equilateral");
        }else if (x!=y &&y!=z) {
            System.out.println("Triangle is Scalene");
        }
        else{
            System.out.println("Triangle is isosceles");
        }

    }
}
