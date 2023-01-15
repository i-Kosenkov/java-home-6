import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Laptops> laptops;

    public static void main(String[] args) {
        laptops = new ArrayList<>();
        laptops.add(new Laptops("Asus", "AS-14/64", 14,
                128, "Черный", "Windows 11", 12345678));
        laptops.add(new Laptops("Apple", "Pro-16", 16,
                512, "Черный", "Mac OS", 12341234));
        laptops.add(new Laptops("HP", "HP-14/128", 14,
                128, "Серый", "linux", 87654321));
        laptops.add(new Laptops("Asus", "AS-13/256", 13,
                256, "Серый", "Windows 10", 123478906));
        laptops.add(new Laptops("Xiaomi", "XI-16/256", 16,
                256, "Белый", "Ubuntu", 985837594));
        laptops.add(new Laptops("HP", "HP-12/512", 16,
                256, "Черный", "Windows 11", 345656445));
        laptops.add(new Laptops("Apple", "Air-13", 13,
                512, "Серый", "Mac OS", 664435544));
        laptops.add(new Laptops("Apple", "Air-16", 16,
                256, "Белый", "Mac OS", 664435544));

        Interface.getMenu();
    }

    public static void getAllPosition() {
        for (Laptops item : laptops) {
            System.out.println(item);
        }
    }

    public static void searchBrand(String brand, List<Laptops> laptops) {
        for (int i = 0; i < laptops.size(); i++) {
            String s = laptops.get(i).toString().toLowerCase();
            if (s.contains(brand.toLowerCase())) {
                System.out.println(laptops.get(i));
            }
        }
    }

    public static void searchModel(String model, List<Laptops> laptops) {
        for (Laptops laptop : laptops) {
            String s = laptop.toString().toLowerCase();
            if (s.contains(model.toLowerCase())) {
                System.out.println(laptop);
            }
        }
    }

    public static void searchScreen(String screen, List<Laptops> laptops) {
        for (Laptops laptop : laptops) {
            String s = laptop.toString().toLowerCase();
            if (s.contains(screen.toLowerCase() + "\"")) {
                System.out.println(laptop);
            }
        }
    }

    public static void searchMemory(String memory, List<Laptops> laptops) {
        for (Laptops laptop : laptops) {
            String s = laptop.toString().toLowerCase();
            if (s.contains(memory.toLowerCase() + "гб")) {
                System.out.println(laptop);
            }
        }
    }

    public static void searchColor(String color, List<Laptops> laptops) {
        for (Laptops laptop : laptops) {
            String s = laptop.toString().toLowerCase();
            if (s.contains(color.toLowerCase())) {
                System.out.println(laptop);
            }
        }
    }
}