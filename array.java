import java.util.Arrays;
        import java.util.Scanner;
//reverse of array
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        int[] n= new int[k];
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(n));
        for (int i = 0; i < n.length/2; i++) {
            int c = n[i];
            n[i] = n[n.length - i - 1];
            n[n.length - i - 1] = c;
        }
        System.out.println(Arrays.toString(n));
    }
}//
