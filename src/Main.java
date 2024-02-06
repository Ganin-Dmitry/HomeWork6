public class Main {
    public static void main(String[] args) {
        /// Задание №1.
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        /// Задание №2.
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        /// Задание №3.
        for (int i = 0; i <= 17; i=i+2) {
            System.out.println(i);
        }

        /// Задание №4.
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        /// Задание №5.
        for (int i = 1904; i <= 2096; i=i+4) {
            System.out.println(i + " год високосный.");
        }

        /// Задание №6.
        for (int i = 7; i <= 98; i=i+7) {
            System.out.println(i);
        }

        /// Задание №7.
        int res;
        for (int i = 1; i <= 10; i++) {
            res = 1;
            for (int j = 1; j < i; j++) {
                res = res * 2;
            }
            System.out.println(res);
        }

        /// Задание №8.
        int vklad = 0;
        for (int i = 1; i <= 12; i++) {
            vklad = vklad + 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + vklad + " рублей.");
        }

        /// Задание №9.
        vklad = 0;
        for (int i = 1; i <= 12; i++) {
            vklad = vklad + 29000;
            vklad = vklad + vklad / 100;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + vklad + " рублей.");
        }

        /// Задание №10.
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + (2*i));
        }
    }
}