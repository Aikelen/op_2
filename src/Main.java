public class Main {
    public static void main(String[] args) {

        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");

        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }


        int clientDeviceYear = 0;
        int clientOS_2 = 1;
        if (clientOS_2 == 0 && clientDeviceYear == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS_2 == 0 && clientDeviceYear == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS_2 == 1 && clientDeviceYear == 0) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        int year = 2040;
        if ((year > 1584) && ((year % 400 == 0) || ((year % 100 != 0)) && (year % 4 == 0))) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }


        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance < 20) {
            System.out.print("Потребуется дней " + deliveryDays);
        } else if ((20 <= deliveryDistance) && (deliveryDistance <= 60)) {
            deliveryDays += 1;
            System.out.println("Потребуется дней " + deliveryDays);
        } else if ((60 < deliveryDistance) && (deliveryDistance < 100)) {
            deliveryDays += 2;
            System.out.println("Потребуется дней " + deliveryDays);
        } else {
            System.out.println("доставка не работает");
        }


        int monthNumber = 4;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");

                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("Такого месяца нет");

        }

    }
}