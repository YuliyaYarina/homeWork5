public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 1;
        int year = 2015;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для IOS по ссылке.");
                break;
            case 1:
                System.out.println("Установите версию приложения для Андройд по ссылке.");
                break;
        }

        System.out.println("Задача 2");
        int clientOS1 = 0;
        int clientDeviceYear = 2015;

        String osString = clientOS1 == 1 ? "Андройд" : "IOS";
        String version = clientDeviceYear > 2015 ? "" : "облегчающую";

        System.out.println(
                "Установите " + version + " версию для " + clientOS + " по ссылке");
    }

    public static void task2() {
        System.out.println("Задача 3");
        int year = 2023;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " является весокосным");
        } else {
            System.out.println(year + " не является весокосным");
        }
    }

    public static void task3() {
        System.out.println("Задача 4");
        int distance = 95;
        int deliveryDays = 0;

        if (distance < 20) {
            deliveryDays = 1;
        }else if (distance < 60) {
            deliveryDays = 2;
        }else if (distance < 100) {
            deliveryDays = 3;
        }

        if (deliveryDays == 0) {
            System.out.println("доставки нет");
        } else {
            System.out.println("Потребуется дней:" + deliveryDays);
        }

    }

    public static void task4() {
        System.out.println("Задача 5");

        int month = 7;
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет.");
        }
        }

}