import java.util.Objects;

public class Laptops {
    public String brand;
    public String model;
    public Integer screenSize;
    public Integer memorySize;
    public String color;
    public String os;
    public Integer serialNumber;

    public Laptops(String brand, String model, Integer screenSize, Integer memorySize, String color, String os, Integer serialNumber) {
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
        this.memorySize = memorySize;
        this.color = color;
        this.os = os;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return String.format("""
                        Производитель: %s
                        Модель: %s
                        Размер экрана: %s"
                        Объем памяти: %dГб
                        Цвет: %s
                        Операционная система: %s
                        Серийный номер: %d
                        """
                , brand, model, screenSize, memorySize, color, os, serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, screenSize, memorySize, color, os, serialNumber);
    }
}