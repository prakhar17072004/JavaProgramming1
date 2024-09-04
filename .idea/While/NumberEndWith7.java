import java.util.Scanner;
public class NumberEndWith7 {

public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
     int n = sc.nextInt();
     int i=1;
     while (i<=n) {
        if(i%10==7){
            System.out.println(i +" ");


        }
        i++;
     }
     sc.close();
    

}
     
}
