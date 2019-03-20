/*

public class TaskF {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int arrCnt = Integer.parseInt(r.readLine());

        int[] res = new int[101];

        for (int i = 0; i < arrCnt ; i++) {

            int[] arr = Arrays.stream(r.readLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
            if(arr.length>1)
            for (int j = 1; j <arr.length ; j++) {
                res[arr[j]] +=1;
            }
        System.gc();

        }

        r.close();

        for (int i = 0; i <= 100 ; i++) {
            for (int j = 0; j < res[i] ; j++) {
                System.out.println(i);
            }
        }

    }
}

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

import java.io.File;
import java.util.Scanner;

public class TaskF {
    public static void main(String[] args) throws Exception {

        int[] res = new int[101];
        Scanner scanner = new Scanner(new File("input.txt"));
        int rows = scanner.nextInt();
        int inRow = 0;
        int n = 0;

        while (rows>0){
            if(scanner.hasNextInt())
                inRow = scanner.nextInt();
            while (inRow>0){
                n = scanner.nextInt();
                res[n] +=1;
                inRow--;
            }
            rows--;
        }
        scanner.close();


        for (int i = 0; i <= 100 ; i++) {
            for (int j = 0; j < res[i] ; j++) {
                System.out.println(i);
            }
        }

    }
}
