public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("Задача 1");
        for (int i = 1; i < 11; i = i + 1) {
            System.out.println("Итерация цикла" + i);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        for (int i = 10; i > 0; i = i - 1) {
            System.out.println("Обратная итерация " + i);
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println("Итерация четных чисел " + i);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        for (int i = 10; i > -11; i = i - 1) {
            System.out.println("Обратная итерация " + i);
        }
    }

    public static void task5() {
        for (int y = 1904; y < 2096; y = y + 4) {
            System.out.println(y + " год явдяется високосным");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7)
            System.out.println("Итерация чисел " + i);
    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i * 2)
            System.out.println("Итерация чисел с умножением " + i);
    }

    public static void task8() {
        System.out.println("Задача 8");
        int saving = 29000;
        int total = 0;
        for (int i = 0; i < 12; i = i + 1) {
            total = total + saving;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total);
        }
        System.out.println(total);
    }

    public static void task9() {
        System.out.println("Задача 9");
        int saving = 29000;
        int total = 0;
        for (int i = 0; i < 12; i = i + 1) {
            total = total + total / 100;
            total = total + saving;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total);
        }
        System.out.println(total);
    }

    public static void task10() {
        System.out.println("Задача 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + " = " + 2*i);
        }
        }

    }