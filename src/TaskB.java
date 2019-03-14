import java.io.BufferedReader;
import java.io.InputStreamReader;
/*

B. Последовательно идущие единицы

Ограничение времени	1 секунда
Ограничение памяти	64Mb
Ввод	стандартный ввод или input.txt
Вывод	стандартный вывод или output.txt
Требуется найти в бинарном векторе самую длинную последовательность единиц и вывести её длину.
Желательно получить решение, работающее за линейное время и при этом проходящее по входному массиву только один раз.
Формат ввода

Первая строка входного файла содержит одно число n, n ≤ 10000. Каждая из следующих n строк содержит ровно одно число — очередной элемент массива.
Формат вывода

Выходной файл должен содержать единственное число — длину самой длинной последовательности единиц во входном массиве.
Пример

Ввод	Вывод
5       1
1
0
1
0
1


 */

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
