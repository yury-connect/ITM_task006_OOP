package task1224;

/* 
Неведома зверушка
Напиши метод, который определяет, какой объект передали в него.
Программа должна выводить на экран одну из надписей: «Кот», «Тигр», «Лев», «Бык», «Животное».


Requirements:
1. Класс Solution должен содержать классы Cat, Tiger, Lion, Bull, Pig.
2. Класс Solution должен содержать метод String getObjectType(Object o).
3. Метод getObjectType() должен возвращать строку "Кот", если передан объект типа Cat.
4. Метод getObjectType() должен возвращать строку "Тигр", если передан объект типа Tiger.
5. Метод getObjectType() должен возвращать строку "Лев", если передан объект типа Lion.
6. Метод getObjectType() должен возвращать строку "Бык", если передан объект типа Bull.
7. Метод getObjectType() должен возвращать строку "Животное", если передан любой другой объект.
8. Программа должна выводить на экран результат метода getObjectType().*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        if (o.getClass().getSimpleName().equals("Cat")) {
            return "Кот";
        }

        if (o.getClass().getSimpleName().equals("Tiger")) {
            return "Тигр";
        }

        if (o.getClass().getSimpleName().equals("Lion")) {
            return "Лев";
        }

        if (o.getClass().getSimpleName().equals("Bull")) {
            return "Бык";
        }

        return "Животное";
    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
