import java.io.BufferedReader;
import java.io.InputStreamReader;

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

public class TaskD {

    public static void main(String[] args) throws Exception{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(r.readLine());



    }

}
