public class HomeWork {
    public static void main(String[] args) {
        /**
         * Список заданий самостоятельной работы:
         * 1. Создайте метод sumRange, который принимает два числа (начало и конец диапазона) и возвращает сумму всех чисел между ними (включительно).
         * 2. Создайте два перегруженных метода add: Первый складывает два целых числа; Второй складывает две строки.
         * 3. Напишите метод findMax, который принимает массив целых чисел и возвращает его максимальный элемент.
         * 4. Напишите метод, вычисляющий факториал числа с помощью цикла for
         * 5. Создайте перегруженные методы calculateArea: Для круга (принимает радиус); Для прямоугольника (принимает длину и ширину).
         * 6. Реализуйте метод, который принимает три числа и возвращает их среднее арифметическое.
         * 7. Напишите метод, который принимает два числа, представляющие длины катетов, и возвращает длину гипотенузы (используйте теорему Пифагора).
         * 8. Реализовать тесты для задач выше :)
         */
        int a = -3;
        int b = -1;
        System.out.printf("Сумма чисел в интервале %s .. %s = %s%s", a, b, sumRange(a, b), System.lineSeparator());
        int c = -10;
        int d = 20;
        System.out.printf("%s + %s = %s%s", c, d, add(c, d), System.lineSeparator());
        String strFirst = "Жили";
        String strSecond = "Были";
        System.out.println("Результат соединения двух строк: " + add(strFirst, strSecond));
        int[] arr = {-1, 4, 5, 6, 7, 667, 77};
        System.out.println("Максимальное число из массива: " + findMax(arr));
        int n = 4;
        System.out.printf("Факториал %s = %s%s", n, getFactorial(n), System.lineSeparator());
        double radius = 2;
        System.out.printf("Площадь круга радиусом %.2f равна %.2f%s", radius, calculateArea(radius), System.lineSeparator());
        double length = 5;
        double width = 5.01;
        System.out.printf("Площадь прямоугольника со сторонами %.2f и %.2f равна %.2f%s", length, width, calculateArea(length, width), System.lineSeparator());
        int numA = 4;
        int numB = 5;
        int numC = -4;
        System.out.printf("Среднее арифметическое чисел %s, %s %s равно %.2f%s", numA, numB, numC, arithmeticMean(numA, numB, numC), System.lineSeparator());
        double legA = 33.33;
        double legB = 11.33;
        System.out.printf("Гипотенуза прямого треугольника со сторонами %.2f и %.2f равна %.2f%s", legA, legB, getHypotenuse(legA, legB), System.lineSeparator());

    }

    // 1. Создайте метод sumRange, который принимает два числа (начало и конец диапазона) и возвращает сумму всех чисел между ними (включительно).
    static int sumRange(int start, int end) {
        int sum = 0;
        int locStart = start > end ? end : start;
        int locEnd = start > end ? start : end;
        for (int i = locStart; i <= locEnd; i++) {
            sum += i;
        }
        return sum;
    }

    // 2. Создайте два перегруженных метода add: Первый складывает два целых числа; Второй складывает две строки.
    static int add(int a, int b) {
        return a + b;
    }

    // Сложить две строки
    static String add(String a, String b) {
        return (a == null ? "" : a) + (b == null ? "" : b);
    }

    // 3. Напишите метод findMax, который принимает массив целых чисел и возвращает его максимальный элемент.
    static Integer findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    // 4. Напишите метод, вычисляющий факториал числа с помощью цикла for
    static Integer getFactorial(int n) {
        int fact = 1;
        if (n <= 0) {
            return null;
        }
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // 5. Создайте перегруженные методы calculateArea: Для круга (принимает радиус); Для прямоугольника (принимает длину и ширину).
    // Площадь круга
    static double calculateArea(double radius) {
        if (radius < 0) {
            return 0;
        }
        return Math.PI * Math.pow(radius, 2);
    }

    // Площадь прямоугольника
    static double calculateArea(double length, double width) {
        if (length <= 0 || width <= 0) {
            return 0;
        }
        return length * width;
    }

    // 6. Реализуйте метод, который принимает три числа и возвращает их среднее арифметическое.
    static double arithmeticMean(int a, int b, int c) {
        return (double) (a + b + c) / 3;
    }

    // 7. Напишите метод, который принимает два числа, представляющие длины катетов, и возвращает длину гипотенузы (используйте теорему Пифагора).
    static double getHypotenuse(double legA, double legB) {
        if (legA < 0 || legB < 0) {
            return 0;
        }
        return Math.sqrt(Math.pow(legA, 2) + Math.pow(legB, 2));
    }
}
