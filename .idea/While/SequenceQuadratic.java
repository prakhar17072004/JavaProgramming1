
public class SequenceQuadratic {
    public static void main(String[] args) {
        int i =1;
        // int p = 4;
        int sum = 0;

        while (i<=99) {
            System.out.println((i*i*i*i) + " ");
              sum = sum +(i*i*i*i);
            i++;
        }
        System.out.println("Total sum of :" +sum);
    }
}
