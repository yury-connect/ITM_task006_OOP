package task1218;

/* 
Есть, летать и двигаться
Есть public интерфейсы CanFly (летать), CanMove (передвигаться), CanEat (есть).
Добавь эти интерфейсы классам Dog (собака), Car (автомобиль), Duck (утка), Airplane (самолет).


Requirements:
1. Класс Solution должен содержать интерфейс CanFly с одним методом fly().
2. Класс Solution должен содержать интерфейс CanMove с одним методом move().
3. Класс Solution должен содержать интерфейс CanEat с одним методом eat().
4. Собака должна уметь передвигаться и есть.
5. Автомобиль должен уметь передвигаться.
6. Самолет должен уметь передвигаться и летать.
7. Утка должна уметь передвигаться, летать и есть.*/

public class Solution {
    public static void main(String[] args) {
        CanEat dog = new Dog();
        dog.eat();

        CanEat duck = new Duck();
        duck.eat();

        CanMove car = new Car();
        car.move();

        CanFly airplane = new Airplane();
        airplane.fly();
    }


    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }


    public static class Dog implements CanEat {
        @Override
        public void eat() {
            System.out.println("Dog CanEat");
        }
    }

    public static class Duck implements CanEat {
        @Override
        public void eat() {
            System.out.println("Duck CanEat");
        }
    }

    public static class Car implements CanMove {
        @Override
        public void move() {
            System.out.println("Car CanMove");
        }
    }

    public static class Airplane implements CanFly {
        @Override
        public void fly() {
            System.out.println("Airplane CanFly");
        }
    }
}
