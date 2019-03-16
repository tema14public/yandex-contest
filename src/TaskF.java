/*

F. Слияние k сортированных списков

Язык	Ограничение времени	Ограничение памяти	Ввод	Вывод
Все языки	1 секунда	10Mb	стандартный ввод или input.txt	стандартный вывод или output.txt
Oracle Java 7	1 секунда	20Mb
Node JS 8.9.4	1 секунда	20Mb
Oracle Java 8	1 секунда	20Mb
Kotlin	1 секунда	20Mb
Даны k отсортированных в порядке неубывания массивов неотрицательных целых чисел, каждое из которых не превосходит 100. Требуется построить результат их слияния: отсортированный в порядке неубывания массив, содержащий все элементы исходных k массивов.
Длина каждого массива не превосходит 10 ⋅ k.
Постарайтесь, чтобы решение работало за время k ⋅ log(k) ⋅ n, если считать, что входные массивы имеют длину n.
Формат ввода

Первая строка входного файла содержит единственное число k, k ≤ 1024.
Каждая из следующих k строк описывает по одному массиву. Первое число каждой строки равняется длине соответствующего массива, оставшиеся числа этой строки описывают значения элементов этого же массива. Элементы массивов являются неотрицательными целыми числами и не превосходят 100.
Формат вывода

Выходной файл должен содержать отсортированный в порядке неубывания массив, содержащий все элементы исходных массивов.
Пример

Ввод
4
6 2 26 64 88 96 96
4 8 20 65 86
7 1 4 16 42 58 61 69
1 84

Вывод
1 2 4 8 16 20 26 42
58 61 64 65 69 84 86
88 96 96


 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TaskF {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int arrCnt = Integer.parseInt(r.readLine());
        int fullSize = 0;

        int[][] arr = new int[arrCnt][];
        for (int i = 0; i < arrCnt ; i++) {
            int[] intArray = Arrays.stream(r.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            if(intArray[0]>0){
                fullSize+=intArray[0];
                arr[i] = new int[intArray[0]];
                System.arraycopy(intArray,1,arr[i],0,intArray[0]);
            }
        }

        int[] res = new int[fullSize];
        int point = 0;

        for(int[] a : arr){
            if(a!=null) {
                System.arraycopy(a, 0, res, point, a.length);
                point += a.length;
            }
        }

        Arrays.sort(res);

        StringBuilder sb = new StringBuilder();
        Arrays.stream(res).forEach(i->sb.append(i+" "));
        System.out.println(sb.toString().trim());

        r.close();

    }
}
