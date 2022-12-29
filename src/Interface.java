import java.util.Scanner;

public class Interface {
    public static void getMenu() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1 -> Вывести список всех ноутбуков");
            System.out.println("2 -> Найти ноутбук по характеристикам");
            System.out.println("X -> Выход");
            System.out.print("Выберите пункт: ");
            String choice = input.nextLine().toLowerCase();
            switch (choice) {
                case ("1") -> {
                    Main.getAllPosition();
                    System.out.print("Для продолжения нажмите Enter.");
                    input.nextLine();
                }
                case ("2") -> {
                    getSearchChoice();
                    System.out.print("Для продолжения нажмите Enter.");
                    input.nextLine();
                }
                case ("x"), ("х") -> System.exit(0);
            }
        }
    }

    public static void getSearchChoice() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите фильтр поиска:");
            System.out.println("1 -> Бренд");
            System.out.println("2 -> Модель");
            System.out.println("3 -> Размер экрана");
            System.out.println("4 -> Объем памяти");
            System.out.println("5 -> Цвет");
            System.out.println("X -> Вернуться назад");
            System.out.print("Выберите пункт: ");
            String choice = input.nextLine().toLowerCase();
            switch (choice) {
                case ("1") -> {
                    System.out.print("Введите бренд ноутбука: ");
                    String brand = input.nextLine();
                    Main.searchBrand(brand, Main.laptops);
                    System.out.print("Для продолжения нажмите Enter.");
                    input.nextLine();
                }
                case ("2") -> {
                    System.out.print("Введите модель ноутбука: ");
                    String model = input.nextLine();
                    Main.searchModel(model, Main.laptops);
                    System.out.print("Для продолжения нажмите Enter.");
                    input.nextLine();
                }
                case ("3") -> {
                    System.out.print("Введите размер экрана: ");
                    String screen = input.nextLine();
                    Main.searchScreen(screen, Main.laptops);
                    System.out.print("Для продолжения нажмите Enter.");
                    input.nextLine();
                }
                case ("4") -> {
                    System.out.print("Введите объем памяти: ");
                    String memory = input.nextLine();
                    Main.searchMemory(memory, Main.laptops);
                    System.out.print("Для продолжения нажмите Enter.");
                    input.nextLine();
                }
                case ("5") -> {
                    System.out.print("Введите цвет ноутбука: ");
                    String color = input.nextLine();
                    Main.searchColor(color, Main.laptops);
                    System.out.print("Для продолжения нажмите Enter.");
                    input.nextLine();
                }
                case ("x"), ("х") -> getMenu();
            }
        }
    }
}