public class Main {
    public static void main(String[] args) {
        // task1
        System.out.println("task1");

        for (int i = 0; i < 10; i = i + 1) {
            System.out.println("Итерация цикла " + i);
        }


        // task2
        System.out.println("task2");
        for (int i = 10; i >= 1; i--) {
            System.out.println("Итерация цикла " + i);
        }


        // task3
        System.out.println("task3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }


        // task4
        System.out.println("task4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);

        }
        // task5
        System.out.println("task5");
        for (int year = 1904; year < 2096; year++) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + "год является высокосным");
            }

        }
        // task6
        System.out.println("task6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();


        // task7
        System.out.println("task7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");

        }
        System.out.println();

        // task8
        System.out.println("task8");
        int number = 1;
        System.out.println(number + " ");
        for (int i = 0; i < 9; i++) {
            number = number * 2;
            System.out.print(number + " ");

        }
        System.out.println();


        // task9
        System.out.println("task9");
        int salary = 29_000;
        int sum = 0;
        for (int i = 1; i <= 12; i++) {
            sum += salary;
            System.out.println("Месяц" + i + "сумма накоплений равна" + sum + "рублей");

        }
        // task10
        System.out.println("task10");
        double sumWithPercent = 0;
        double percent = 0.01;
        for (int i = 1; i <= 12; i++) {
            sumWithPercent = (sumWithPercent + salary) * (1 + percent);
            System.out.println("Месяц" + i + "сумма накоплений равна" + sumWithPercent + "рублей");

        }
        // task11
        System.out.println("task11");
        for (int i = 1; i <= 9; i++) {
            System.out.println(" 2 * " + i + " = " + 2 * i);

        }


    }
}


