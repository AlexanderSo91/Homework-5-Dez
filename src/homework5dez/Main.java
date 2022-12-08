package homework5dez;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("\nЗадача_1");

        int age = 19;
        if (age <= 18) {
            System.out.println("Ты не достиг совершеннолетия, нужно немного подождать");
        }
    }


    public static void task2() {

        System.out.println("\nЗадача_2");

        int temperature = 2;

        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }

    public static void task3() {

        System.out.println("\nЗадача_3");

        int speed = 70;

        if (speed > 60) {
            System.out.println("Придется заплатить штраф");
        } else {
            System.out.println("Можно ездить спокойно");
        }
    }


    public static void task4() {

        System.out.println("\nЗадача_4");
        int age = 25;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека " + age + " то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека " + age + " то ему нужно ходить в школу");
        } else if (age > 18 && age < 24) {
            System.out.println("Если возраст человека " + age + " то ему нужно ходить в университет");
        } else if (age > 24) {
            System.out.println("Если возраст человека " + age + " то ему нужно ходить на работу");
        }
    }


    public static void task5() {

        System.out.println("\nЗадача_5");
        int age = 20;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + " то ему нельзя кататься на аттрационе");
        }
        boolean canNotRide = age > 5 && age < 14;
        if (age > 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + " то можно кататься только в сопровождении взрослого");
        }
        if (canNotRide)
            System.out.println("Если возраст ребенка равен " + age + " и взрослого нет, то кататься нельзя");

        else if (age > 14) {
            System.out.println("Если возраст ребенка равен " + age + " то можно кататься без взрослого");
        }
    }

    public static void task6() {

        System.out.println("\nЗадача_6");

        int carriage = 80;
        int seatPlace = 60;
        int standingPlace = 102 - 60;

        if (carriage > 102) {
            System.out.println("В вагоне нет места");

        } else if (carriage < 42 && carriage < 102) {
            System.out.println("В вагоне есть места.И сидячие тоже");
        } else if (carriage < 60 && carriage < 102) {
            System.out.println("Сидячих мест нет.Остались только стоячие");
        }


    }


    private static void task7() {

        System.out.println("\nЗадача_7");

        int one = 1;
        int two = 2;
        int three = 3;
        if (one==1) {
            System.out.println("Не самое большое число");
        } else if (two==2) {
            System.out.println("Не самое большое число");
        } else if (three==3) {
            System.out.println("Самое большое число");

        }
    }

                }


