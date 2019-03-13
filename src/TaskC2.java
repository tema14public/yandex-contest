import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        int rows = in.nextInt();

        int lastN = 0 ;
        for (int i = 0; i < rows; i++) {
            int n = in.nextInt();
            if(i==0 || n>lastN) System.out.println(n);
            lastN=n;
        }

        in.close();
    }
}
