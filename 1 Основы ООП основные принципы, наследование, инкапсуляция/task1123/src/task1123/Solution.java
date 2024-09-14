package task1123;

/*
Минимакс
Реализуй метод, который возвращает объект класса Pair.
В поле x этого объекта должно содержаться минимальное число, а в поле y - максимальное число из массива inputArray.


Requirements:
1. Программа не должна считывать данные с клавиатуры.
2. Класс Pair не изменяй.
3. Метод main не изменяй.
4. Допиши реализацию метода getMinimumMaximumPair: он должен возвращать пару из минимума и максимума.
5. Программа должна вывести правильный результат.
6. Метод getMinimumMaximumPair не должен изменять массив inputArray.
 */

public class Solution {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair result = getMinimumMaximumPair(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair getMinimumMaximumPair(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new Pair(null, null);
        }

        // напишите тут ваш код   // Я реализовал решение в строках 34-43
        Pair minMax = new Pair(inputArray[0], inputArray[0]);
        for (int item: inputArray)
            if (item < minMax.x) {
                minMax.x = item;
            }
            else if (item > minMax.y) {
                minMax.y = item;
            }

        return minMax;
    }

    public static class Pair {
        public Integer x;
        public Integer y;

        public Pair(Integer x, Integer y) {
            this.x = x;
            this.y = y;
        }
    }
}
