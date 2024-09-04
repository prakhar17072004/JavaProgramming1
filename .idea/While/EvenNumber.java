import java.util.Scanner;
public class EvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        
        while (i<=99) {
            if(i%2==0){
                System.out.println("Number is even " +i);
            }
            
            i++;
        }
        sc.close();
    }
}
