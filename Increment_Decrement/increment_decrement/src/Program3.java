public class Program3 {
    public static void main(String[] args) {
        int z = 5;
        int result = z++ - --z + z-- - --z;
        System.out.println(result);
    }
}
