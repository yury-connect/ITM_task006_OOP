package task1208;

/* 
Свобода печати
Напиши пять методов print() с разными параметрами.


Requirements:
1. Программа не должна выводить текст на экран.
2. Класс Solution должен содержать шесть методов.
3. Класс Solution должен содержать статический метод main().
4. Класс Solution должен содержать пять статических методов print() с разными параметрами.*/

public class Solution {
    public static void main(String[] args) {
        print((byte) 12);   //  byte
        print((short) 23);  //  short
        print(34);          //  int
        print(45L);         //  long
        print(56D);         //  double
        print(67F);         //  float
    }



    public static void print(byte byteValue) {
        System.out.println("byte value = " + byteValue);
    }

    public static void print(short shortValue) {
        System.out.println("short value = " + shortValue);
    }

    public static void print(int intValue) {
        System.out.println("int value = " + intValue);
    }

    public static void print(long longValue) {
        System.out.println("long value = " + longValue);
    }

    public static void print(double doubleValue) {
        System.out.println("double value = " + doubleValue);
    }

    public static void print(float floatValue) {
        System.out.println("float value = " + floatValue);
    }
}
