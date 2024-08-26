import java.util.Scanner;
public class BigFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input ");
        int x= sc.nextInt();
        int y= sc.nextInt();
        int z= sc.nextInt();
        int k = sc.nextInt();
        if(x>y&&x>z&&x>k)
        {
            System.out.println("x is greater");
        } else if (y>x&&y>z&&y>k)
        {
            System.out.println("y is greater");
        } else if (z>x&& z>y&&z>k) {
            System.out.println("z is greater");
        }
        System.out.println("k is greater");

    }
}
