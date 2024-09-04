import java.util.Scanner;
public class SequenceProgram1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        int i= sc.nextInt();
        int sum =0;
        
        while (i<=99){
            
            sum = sum +i*i;
            i++;
        }
        System.out.println("The Sequence square is : " +sum);
        sc.close();
    }
}
