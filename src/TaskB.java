import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TaskB {

    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int rowsCnt = Integer.parseInt(r.readLine());

        int len = 0;
        int tmpLen = 0;

        for (int i = 0; i < rowsCnt; i++) {
            int n = Integer.parseInt(r.readLine());
            if(n==1){
                tmpLen++;
            }else{
                if(tmpLen>len) len = tmpLen;
                tmpLen=0;
            }
        }
        if(tmpLen>len) len = tmpLen;

        System.out.println(len);

    }

}
