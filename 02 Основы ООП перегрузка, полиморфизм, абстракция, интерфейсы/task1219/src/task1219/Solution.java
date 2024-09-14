package task1219;

/* 
Создаем человека
Есть public интерфейсы CanFly (летать), CanRun (бежать/ездить), CanSwim (плавать).
Добавь эти интерфейсы классам Human (человек), Duck (утка), Penguin (пингвин), Airplane (самолет),
и не забудь про реализацию методов интерфейсов (в методах ничего делать не нужно).


Requirements:
1. Класс Solution должен содержать интерфейс CanFly с одним методом fly().
2. Класс Solution должен содержать интерфейс CanRun с одним методом run().
3. Класс Solution должен содержать интерфейс CanSwim с одним методом swim().
4. Человек должен уметь бегать и плавать.
5. Утка должна уметь летать, плавать и бегать.
6. Пингвин должен уметь плавать и бегать.
7. Самолет должен уметь летать.*/

public class Solution {
    public static void main(String[] args) {
        CanRun human = new Human();
        human.run();

        CanSwim duck = new Duck();
        duck.swim();

        CanSwim penguin = new Penguin();
        penguin.swim();

        CanFly airplane = new Airplane();
        airplane.fly();
    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }


    public static class Human implements CanRun {

        @Override
        public void run() {
            System.out.println("Human is CanRun");
        }
    }

    public static class Duck implements CanSwim {

        @Override
        public void swim() {
            System.out.println("Duck is CanSwim");
        }
    }

    public static class Penguin implements CanSwim {

        @Override
        public void swim() {
            System.out.println("Penguin is CanSwim");
        }
    }

    public static class Airplane implements CanFly {

        @Override
        public void fly() {
            System.out.println("Airplane is CanFly");
        }
    }
}
