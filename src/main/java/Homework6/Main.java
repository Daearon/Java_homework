package Homework6;
import java.util.HashSet;
import java.util.Scanner;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(
                """
                        Введите критерий отбора:\s
                        1 - Название марки
                        2 - Название операционной системы
                        3 - Цвет
                        4 - Оперативная память
                        5 - Стоимость
                        6 - Жесткий диск
                        7 - Вывести на экран весь каталог""");
        System.out.println();
        Scanner iScanner = new Scanner(System.in, "cp866");
        int userInput = iScanner.nextInt();
        HashSet<Laptop> laptopSet = new HashSet<>();

        Laptop lap_1 = new Laptop(1, "Acer", "Windows", 2048, 65000, 2, "black");
        Laptop lap_2 = new Laptop(2, "Asus", "Linux", 1024, 12000, 1, "white");
        Laptop lap_3 = new Laptop(3, "Apple", "Mac", 4096, 50000, 4, "green");
        Laptop lap_4 = new Laptop(4, "Lenovo", "Windows", 1024, 30000, 3, "black");

        laptopSet.add(lap_1);
        laptopSet.add(lap_2);
        laptopSet.add(lap_3);
        laptopSet.add(lap_4);

        switch (userInput) {
            case 1 -> {
                System.out.println("Введите марку: ");
                String trademarkInput = iScanner.next();
                List<Laptop> queryLaptop = Laptop.findTrademark(laptopSet, trademarkInput);
                for (Laptop laptop : queryLaptop) {
                    System.out.println(laptop.toString());
                }
            }
            case 2 -> {
                System.out.println("Введите операционную систему: ");
                String osInput = iScanner.next();
                List<Laptop> queryTrademark = Laptop.findOs(laptopSet, osInput);
                for (Laptop laptop : queryTrademark) {
                    System.out.println(laptop.toString());
                }
            }
            case 3 -> {
                System.out.println("Введите цвет: ");
                String colorInput = iScanner.next();
                List<Laptop> queryColor = Laptop.findColor(laptopSet, colorInput);
                for (Laptop laptop : queryColor) {
                    System.out.println(laptop.toString());
                }
            }
            case 4 -> {
                System.out.println("Введите количество оперативной памяти (МБ): ");
                Integer ramInput = Integer.valueOf(iScanner.next());
                List<Laptop> queryRam = Laptop.findRam(laptopSet, ramInput);
                for (Laptop laptop : queryRam) {
                    System.out.println(laptop.toString());
                }
            }
            case 5 -> {
                System.out.println("Введите стоимость: ");
                Integer priceInput = Integer.valueOf(iScanner.next());
                List<Laptop> queryPrice = Laptop.findPrice(laptopSet, priceInput);
                for (Laptop laptop : queryPrice) {
                    System.out.println(laptop.toString());
                }
            }
            case 6 -> {
                System.out.println("Введите емкость жесткого диска (ТБ): ");
                Integer hardDriveInput = Integer.valueOf(iScanner.next());
                List<Laptop> queryHardDrive = Laptop.findHarddrive(laptopSet, hardDriveInput);
                for (Laptop laptop : queryHardDrive) {
                    System.out.println(laptop.toString());
                }
            }
            case 7 -> {
                System.out.println("В наличии: ");
                System.out.println(lap_1);
                System.out.println(lap_2);
                System.out.println(lap_3);
                System.out.println(lap_4);
            }
            default -> System.out.println("Введите число от 1 до 7. ");
        }
        iScanner.close();
    }
}
