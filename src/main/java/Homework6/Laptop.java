package Homework6;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
public class Laptop {
    int id;
    String trademark;
    String os;
    Integer ram;
    Integer price;
    Integer harddrive;
    String color;

    public Laptop(int id, String trademark, String os, Integer ram, Integer price, Integer harddrive, String color) {
        this.id = id;
        this.trademark = trademark;
        this.os = os;
        this.ram = ram;
        this.price = price;
        this.harddrive = harddrive;
        this.color = color;
    }

    public String toString() {
        return " Марка ноутбука: " + trademark + " Операционная система: " + os + " Оперативная память:" + ram
                + " Жесткий диск: " + harddrive + "Цвет: " + color + " Цена: " + price;
    }

    public static List<Laptop> findOs(HashSet<Laptop> hashLaptop, String os) {
        List<Laptop> laptopList = new ArrayList<>();
        for (Laptop laptop : hashLaptop) {
            if (laptop.os.equalsIgnoreCase(os)) {
                laptopList.add(laptop);
            }
        }
        return laptopList;
    }

    public static List<Laptop> findTrademark(HashSet<Laptop> hashLaptop, String trademark) {
        List<Laptop> TradeList = new ArrayList<>();
        for (Laptop laptop : hashLaptop) {
            if (laptop.trademark.equalsIgnoreCase(trademark)) {
                TradeList.add(laptop);
            }
        }
        return TradeList;
    }
    public static List<Laptop> findColor(HashSet<Laptop> hashLaptop, String color) {
        List<Laptop> ColorList = new ArrayList<>();
        for (Laptop laptop : hashLaptop) {
            if (laptop.color.equalsIgnoreCase(color)) {
                ColorList.add(laptop);
            }
        }
        return ColorList;
}
    public static List<Laptop> findRam(HashSet<Laptop> hashLaptop, Integer ram) {
        List<Laptop> RamList = new ArrayList<>();
        for (Laptop laptop : hashLaptop) {
            if (laptop.ram.equals(ram)) {
                RamList.add(laptop);
            }
        }
        return RamList;
    }
    public static List<Laptop> findPrice(HashSet<Laptop> hashLaptop, Integer price) {
        List<Laptop> PriceList = new ArrayList<>();
        for (Laptop laptop : hashLaptop) {
            if (laptop.price.equals(price)) {
                PriceList.add(laptop);
            }
        }
        return PriceList;
    }
    public static List<Laptop> findHarddrive(HashSet<Laptop> hashLaptop, Integer harddrive) {
        List<Laptop> HarddriveList = new ArrayList<>();
        for (Laptop laptop : hashLaptop) {
            if (laptop.harddrive.equals(harddrive)) {
                HarddriveList.add(laptop);
            }
        }
        return HarddriveList;
    }
}
