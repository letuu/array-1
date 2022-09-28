package pro.sky.java.ds_3_0.task1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание Массивы-1");
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1 *******************************************************************");
        //Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new
//        int[] arr0 = new int[3]; //без заполнения
        int[] arr1 = new int[] {1, 2, 3};
        System.out.println(arr1[0] + "\n" + arr1[1] + "\n" + arr1[2] + "\n");

        //Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями
        double[] arr2 = {1.57, 7.654, 9.986};
        System.out.println(arr2[0] + "\n" + arr2[1] + "\n" + arr2[2] + "\n");

        //Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите способ создания массива:
        //с помощью ключевого слова или сразу заполненный элементами.
        float[] arr3 = {1.22f, 5.56f, 10.9f, 658146.56f};
        System.out.println(arr3[0] + "\n" + arr3[1] + "\n" + arr3[2] + "\n" + arr3[3] + "\n");
    }

    public static void task2() {
        System.out.println("Задача 2 *******************************************************************");
        int[] arr1 = new int[] {1, 2, 3};
        System.out.println(arr1[0] + ", " + arr1[1] + ", " + arr1[2]);
        double[] arr2 = {1.57, 7.654, 9.986};
        System.out.println(arr2[0] + ", " + arr2[1] + ", " + arr2[2]);
        float[] arr3 = {1.22f, 5.56f, 10.9f, 658146.56f};
        System.out.println(arr3[0] + ", " + arr3[1] + ", " + arr3[2] + ", " + arr3[3]);
    }

    public static void task3() {
        System.out.println("Задача 3 *******************************************************************");
        int[] arr1 = new int[] {1, 2, 3};
        System.out.println(arr1[2] + ", " + arr1[1] + ", " + arr1[0]);
        double[] arr2 = {1.57, 7.654, 9.986};
        System.out.println(arr2[2] + ", " + arr2[1] + ", " + arr2[0]);
        float[] arr3 = {1.22f, 5.56f, 10.9f, 658146.56f};
        System.out.println(arr3[3] + ", " + arr3[2] + ", " + arr3[1] + ", " + arr3[0]);
    }

    public static void task4() {
        System.out.println("Задача 4 *******************************************************************");
        int[] arr = new int[] {1, 2, 3};
        for (int i = 0; i < 3; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = arr[i] + 1;
            }
            System.out.println(arr[i]);
        }
    }
}
