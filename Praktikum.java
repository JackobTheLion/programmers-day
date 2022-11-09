import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println("День програмиста 12.09." + year + ".");// Високосный год
        }
        else {
            System.out.println("День програмиста 13.09." + year + ".");// Не високосный год
        }
    }

    public static boolean isLeapYear(int year) { //Проверяем високосность
        if (year % 400 == 0) { //проверяем кратность 400.  Если не кратно идем дальше.S
            return true; //Если кратно, год високосный.
        } else if (year % 100 == 0) { //проверяем кратность 100.  Если не кратно идем дальше.
            return false; // Если кратно год не високосный,
        } else if (year % 4 == 0) { // Проверяем кратность 4. Если не кратно идем дальше.
            return true; // Если кратно год не високосный.
        } else {
            return false;
        }
    }
}