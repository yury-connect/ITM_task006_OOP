package task1106;

/* 
Скрытный инкапсулированный кот
Скрой все внутренние переменные класса Cat.


Requirements:
1. Переменная name класса Cat должна быть скрыта.
2. Переменная age класса Cat должна быть скрыта.
3. Переменная weight класса Cat должна быть скрыта.
4. В классе Cat должны быть 3 переменные.
5. Все переменные класса Cat должны быть private.*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Cat {
        public String name;
        public int age;
        public int weight;

        public Cat() {
        }

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
    }
}

