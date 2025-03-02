public class Task1 {

    public static void main(String... args) {
        printThreeWords();
        checkSumSign(5, -3); // Вызов метода для проверки знака суммы
        printColor(13); // Вызов метода с аргументом 13
        compareNumbers();
        boolean result = checkSum(4, 2);
        printNumberSign(5);  // Пример вызова с положительным числом
        printNumberSign(-3); // Пример вызова с отрицательным числом
        printNumberSign(0);  // Пример вызова с нулём
        boolean resultcheckPositive = checkPositive(16);
        System.out.println(resultcheckPositive);
        printString("Hello!", 5);
        int year = 2024; // Пример года
        boolean isLeapYear = isLeapYear(year);
        System.out.println("Год " + year + " является високосным? " + isLeapYear);
        // Задаем целочисленный массив с элементами 0 и 1
        int[] array = {1, 1, 0, 0, 1, 0, 0};
        // Выводим исходный массив
        System.out.print("Исходный массив: ");
        printArray(array);
        // Заменяем 0 на 1 и 1 на 0
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1; // Заменяем 0 на 1
            } else {
                array[i] = 0; // Заменяем 1 на 0
            }
            // Выводим измененный массив
            {
                System.out.print("Измененный массив: ");
                printArray(array);
            }
        }
        // Создаем пустой целочисленный массив длиной 100
        int[] arrayAlternative = new int[100];
        // Заполняем массив значениями от 1 до 100
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1; // Записываем значение от 1 до 100
        }
        // Выводим массив на экран
        System.out.print("Заполненный массив: ");
        printArrayAlternative(array);

        int[] arrayAlternativeNew = {1, 5, 3, 2, 11, 4, 8, 9, 1};
        // Проходим по массиву циклом и умножаем числа меньше 6 на 2
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        printArrayAlternative(array);

        int n = 5; // Размер массива (например, 5x5)
        int[][] arrayAlternative1 = new int[n][n];

        // Заполняем главную диагональ единицами
        for (int i = 0; i < n; i++) {
            arrayAlternative1[i][i] = 1;
        }
        printArrayAlternative1(arrayAlternative1);

        int len = 5;
        int initialValue = 10;
        int[] resultArray = createArray(len, initialValue);
        // Выводим массив на экран
        for (int num : resultArray) {
            System.out.print(num + " ");
        }
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(int a, int b) {
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(int value) {
        if (value < 0) {
            System.out.println("Красный");
        } else if (value >= 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 5;  // любые значения
        int b = 3;  // любые значения

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean checkSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum >= 10 && sum <= 20;

    }

    public static void printNumberSign(int number) {
        if (number > 0) {
            System.out.println("Число положительное.");
        } else if (number < 0) {
            System.out.println("Число отрицательное.");
        } else {
            System.out.println("Число ноль (считаем положительным).");
        }
    }

    public static boolean checkPositive(int number) {
        return number < 0;  // возвращает true, если число отрицательное
    }

    public static void printString(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

    public static boolean isLeapYear(int year) {
        // Условие для проверки високосного года
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0; // Если кратен 100, то проверяем кратен ли 400
            }
            return true; // Если кратен 4, но не 100, то високосный
        }
        return false; // Если не кратен 4, не високосный
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void printArrayAlternative(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void printArrayAlternativeNew(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void printArrayAlternative1(int[][] array) {
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}









