import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TaskC {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int rows = Integer.parseInt(r.readLine());

        int lastN = 0 ;
        int cnt = 0;
        while (rows>0){
            int n = Integer.parseInt(r.readLine());

            if(cnt==0 || n>lastN) System.out.println(n);
            lastN=n;
            rows--;
            cnt++;
        }

        r.close();
    }
}
