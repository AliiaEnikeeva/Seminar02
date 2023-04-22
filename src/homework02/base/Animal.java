package homework02.base;

public abstract class Animal {
    public double height;
    public double weight;
    public String colorEyes;

    public Animal(double height, double weight, String colorEyes) {
        this.height = height;
        this.weight = weight;
        this.colorEyes = colorEyes;
    }

    public abstract void getVoice();

    @Override
    public String toString() {
        return "Животное {" +
                "Рост = " + height +
                ", Вес = " + weight +
                ", Цвет глаз - '" + colorEyes + '\'' +
                '}';
    }
}
