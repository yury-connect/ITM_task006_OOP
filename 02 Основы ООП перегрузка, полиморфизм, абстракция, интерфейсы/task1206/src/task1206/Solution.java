package task1206;

/* 
Выполняем перегрузку!
Напиши два метода: print(int) и print(String).


Requirements:
1. Программа не должна выводить текст на экран.
2. Класс Solution должен содержать три метода.
3. Класс Solution должен содержать статический метод main().
4. Класс Solution должен содержать статический метод print() с параметром типа int.
5. Класс Solution должен содержать статический метод print() с параметром типа String.*/

public class Solution {
    public static void main(String[] args) {
        print(123);
        print("ITM");
    }

    public static void print(int i) {
        System.out.println("int i = " + i);
    }
    public static void print(String line) {
        System.out.println("String line = " + line);
    }
}
