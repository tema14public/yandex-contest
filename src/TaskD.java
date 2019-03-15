import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
D. Генерация скобочных последовательностей

Ограничение времени	1 секунда
Ограничение памяти	20Mb
Ввод	стандартный ввод или input.txt
Вывод	стандартный вывод или output.txt
Дано целое число n. Требуется вывести все правильные скобочные последовательности длины 2 ⋅ n, упорядоченные лексикографически (см. https://ru.wikipedia.org/wiki/Лексикографический_порядок).
В задаче используются только круглые скобки.
Желательно получить решение, которое работает за время, пропорциональное общему количеству правильных скобочных последовательностей в ответе, и при этом использует объём памяти, пропорциональный n.
Формат ввода

Единственная строка входного файла содержит целое число n, 0 ≤ n ≤ 11
Формат вывода

Выходной файл содержит сгенерированные правильные скобочные последовательности, упорядоченные лексикографически.
Пример 1

Ввод	Вывод
2       (())
        ()()

Пример 2

Ввод	Вывод
3       ((()))
        (()())
        (())()
        ()(())
        ()()()
*/

/*
https://neerc.ifmo.ru/wiki/index.php?title=Правильные_скобочные_последовательности
Pseudo code:
function gen(n: int, counter_open: int, counter_close: int, ans: string):
   if counter_open + counter_close == 2 * n
     print(ans)
     return
   if counter_open < n
     gen(n, counter_open + 1, counter_close, ans + '(')
   if counter_open > counter_close
     gen(n, counter_open, counter_close + 1, ans + ')')
 */

/*
*     //битовые операции

        int i = 0;
        System.out.println(i&(1<<1));
        i = 1<<2;//set 1 to bit#2
        //i = ~(1<<1);//set 0 to bit#2
        System.out.println(1<<2);//get bit#2

 */

public class TaskD {

    public static int count = 0;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception{

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(r.readLine());
        //long start = System.currentTimeMillis();
        if(n>0)
            generate(n,0,0,0);
        //System.out.println("Time: "+((System.currentTimeMillis()-start)));
    }

    public static void generate(int n, int cntOpen, int cntClose, int answer){

        if(cntOpen+cntClose == 2*n){
            sb.delete(0,(2*n));
            for (int i = 0; i < 2*n ; i++) {
                if((answer&(1<<i))==0){
                    sb.append("(");
                }else{
                    sb.append(")");
                }
            }

            System.out.println(sb.toString());
            count++;
            if(count%10000==0) System.gc();
            return;
        }
        int y = cntOpen+cntClose;
        if(cntOpen<n){
            int answ2 = answer;
            answ2 &= ~(1<<y);
            generate(n,cntOpen+1,cntClose,answ2);
        }
        if(cntOpen > cntClose){
            int answ1 = answer;
            answ1 |= (1<<y);
            generate(n,cntOpen,cntClose+1,answ1);
        }

    }

}
