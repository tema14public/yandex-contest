import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.atomic.AtomicInteger;

/*
C. Удаление дубликатов

Язык	Ограничение времени	Ограничение памяти	Ввод	Вывод
Все языки	1 секунда	10Mb	стандартный ввод или input.txt	стандартный вывод или output.txt
Oracle Java 8	1 секунда	20Mb

Дан упорядоченный по неубыванию массив целых 32-разрядных чисел. Требуется удалить из него все повторения.
Желательно получить решение, которое не считывает входной файл целиком в память, т.е., использует лишь константный объем памяти в процессе работы.
Формат ввода

Первая строка входного файла содержит единственное число n, n ≤ 1000000.
На следующих n строк расположены числа — элементы массива, по одному на строку. Числа отсортированы по неубыванию.
Формат вывода

Выходной файл должен содержать следующие в порядке возрастания уникальные элементы входного массива.
Пример 1

Ввод	Вывод
5       2
2       4
4       8
8
8
8

Пример 2

Ввод	Вывод
5          2
2          8
2
2
8
8
*/

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