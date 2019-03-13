import java.io.BufferedReader;
import java.io.InputStreamReader;

public class taskA {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        String J = r.readLine();
        String S = r.readLine();

        int cnt = 0;
        for(char c : S.toCharArray()){
            if(J.indexOf(c)>=0){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
