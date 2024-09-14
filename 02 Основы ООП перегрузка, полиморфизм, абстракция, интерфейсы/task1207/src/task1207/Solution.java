package task1207;

/* 
Int и Integer
Реализуй два метода: print(int) и print(Integer).
Напиши такой код в методе main(), чтобы вызвались оба.


Requirements:
1. Класс Solution должен содержать статический метод main().
2. Класс Solution должен содержать статический void метод print() с параметром типа int.
3. Класс Solution должен содержать статический void метод print() с параметром типа Integer.
4. Метод main() должен вызывать метод print() с параметром типа int.
5. Метод main() должен вызывать метод print() с параметром типа Integer.*/

public class Solution {
    public static void main(String[] args) {
        print(123);
        print(new Integer(456));
    }


    public static void print(int iInt) {
        System.out.println("int i = " + iInt);
    }

    public static void print(Integer iInteger) {
        System.out.println("Integer i = " + iInteger);
    }
}
