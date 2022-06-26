// +Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму.
// Пример 1: а = 3, b = 2, ответ: 9
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1
// Пример 4: а = 0, b = 0, ответ: не определено
// Пример 5
// входные данные находятся в файле input.txt в виде
// b 3
// a 10
// Результат нужно сохранить в файле output.txt
// 1000
// можно использовать знания прошедших вебинаров. в т ч 2, 3, 4, 5...
package task1.T1.src;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class T1 {
    public static void main(String[] args) throws IOException {
        // считать данные с файла
        // создаем BufferedReader для построчного считывания
        // BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        // String line;
        // while ((line = reader.readLine()) != null) {
        // System.out.println(line);
        // }
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        String str;
        // записываем данные с файла в список
        ArrayList<String> list = new ArrayList<>();
        while ((str = reader.readLine()) != null) {
            if (!str.isEmpty()) {
                list.add(str);
                System.out.println(str);
            }
        }
        //String[] stringArr = list.toArray(new String[0]);
        System.out.println(list);
        // if (list.size() < 1) {
            
        // }
        int i;
        if (list.size() > 1){
            for(i = 0; i < list.size(); i++){
                //int index = list.indexOf(element1);
                //System.out.println(index);
            }
        }
    }

    
}
