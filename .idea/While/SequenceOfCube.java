import java.util.Scanner;
public class SequenceOfCube {
    public static void main(String[] args) {
        
        int i = 1;
        int sum = 0;
        while (i<=99) {
            sum =sum +i*i*i;
           // System.out.println(sum);
            i++;

        }
        System.out.println("The cube of sequence " +sum);
    }
}
