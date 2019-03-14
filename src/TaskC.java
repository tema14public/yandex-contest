import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.atomic.AtomicInteger;

public class TaskC {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        AtomicInteger rows = new AtomicInteger(read(r));


        if(rows.intValue()>0) {

            int lastN = read(r);
            System.out.println(lastN);

            while (rows.decrementAndGet() > 0) {
                int n = read(r);
                if (n > lastN) System.out.println(n);
                lastN = n;
                if(rows.get()%100000==0)System.gc();
            }

        }

        r.close();

    }

    public static int read(BufferedReader r) throws Exception{
        return Integer.parseInt(r.readLine());
    }


}