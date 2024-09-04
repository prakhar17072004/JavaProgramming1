import java.util.Scanner;
public class EndWith8AndDivisbleBy8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        while (i<=1000) {
            if((i%10==8)&& (i%8==0)){
                System.out.println(i +" ");
            }
            i++;
        }
    }
}
