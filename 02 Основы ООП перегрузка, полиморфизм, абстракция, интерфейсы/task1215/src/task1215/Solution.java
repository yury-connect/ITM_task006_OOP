package task1215;

/* 
Кошки не должны быть абстрактными!
Унаследуй классы Cat и Dog от Pet.
Реализуй недостающие методы. Классы Cat и Dog не должны быть абстрактными.


Requirements:
1. Класс Pet должен быть абстрактным.
2. Класс Dog не должен быть абстрактным.
3. Класс Cat не должен быть абстрактным.
4. Класс Dog должен наследоваться от класса Pet и реализовывать его абстрактные методы.
5. Класс Cat должен наследоваться от класса Pet и реализовывать его абстрактные методы.*/

public class Solution {
    public static void main(String[] args) {

        Pet cat = new Cat().getChild();
        System.out.println(cat.getName());

        Pet dog = new Dog().getChild();
        System.out.println(dog.getName());
    }


    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }


    public static class Cat extends Pet {

        @Override
        public String getName() {
            return "I am " + this.getClass().getSimpleName();
        }

        @Override
        public Pet getChild() {
            return new Cat();
        }
    }


    public static class Dog extends Pet {

        @Override
        public String getName() {
            return "I am " + this.getClass().getSimpleName();
        }

        @Override
        public Pet getChild() {
            return new Dog();
        }
    }
}
