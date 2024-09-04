import java.util.Scanner;
public class EndWith7AndDivisibleBy7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int  i = sc.nextInt();
        
        while(i<2000){
          if((i%10==7)&&(i%7==0)){
            System.out.println(i + " ");
            count++;
          }
         
          i++;
        }
        System.out.println("Total digits which are divisible "+count);

        sc.close();

    }
}
