public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 1;
        switch (clientOS){
            case 0:
                System.out.println("Установите версию приложения для IOS по ссылке.");
                break;
            case 1:
                System.out.println("Установите версию приложения для Андройд по ссылке.");
                break;
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 0;
        int year = 2016;
        boolean clientDeviceYear = year <= 2015;
        if (clientDeviceYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке.");
        }

    }

    public static void task3() {
        System.out.println("Задача 3");

    }

    public static void task4() {
        System.out.println("Задача 4");

    }

    public static void task5() {
        System.out.println("Задача 5");

    }
}