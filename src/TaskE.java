import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class TaskE {
    /*

E. Анаграммы

Ограничение времени	1 секунда
Ограничение памяти	20Mb
Ввод	стандартный ввод или input.txt
Вывод	стандартный вывод или output.txt
Даны две строки, состоящие из строчных латинских букв. Требуется определить, являются ли эти строки анаграммами, т. е. отличаются ли они только порядком следования символов.
Формат ввода

Входной файл содержит две строки строчных латинских символов, каждая не длиннее 100 000 символов. Строки разделяются символом перевода строки.
Формат вывода

Выходной файл должен содержать единицу, если строки являются анаграммами, и ноль в противном случае.
Пример 1

Ввод	Вывод
qiu     1
iuq

Пример 2

Ввод	Вывод
zprl    0
zprc

     */

    public static void main(String[] args) throws Exception {

        int res = 1;

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        char[] str1 = r.readLine().toCharArray();
        char[] str2 = r.readLine().toCharArray();

        r.close();

        if(str1.length!=str2.length){
            res = 0;
        }else {
            /*Arrays.sort(str1);
            Arrays.sort(str2);

            for (int i = 0; i < str1.length; i++) {
                if(str1[i]!=str2[i]){
                    res = 0;
                    break;
                }
            }*/

            HashMap<Character, Integer> map1 = new HashMap<>();
            HashMap<Character, Integer> map2 = new HashMap<>();

            for (int i = 0; i < str1.length ; i++) {
                if(map1.containsKey(str1[i])){
                    map1.put(str1[i],map1.get(str1[i])+1);
                }else{
                    map1.put(str1[i],1);
                }

                if(map2.containsKey(str2[i])){
                    map2.put(str2[i],map2.get(str2[i])+1);
                }else{
                    map2.put(str2[i],1);
                }
            }

            if(!map1.equals(map2)) res=0;

        }

        System.out.println(res);

    }
}
