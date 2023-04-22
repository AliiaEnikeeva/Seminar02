package homework02.base;

public class Stork extends Bird{
    public Stork(double height, double weight, String colorEyes, double flyHeight) {
        super(height, weight, colorEyes, flyHeight);
    }

    @Override
    public void getVoice() {
        System.out.println("Кряук-кряук!");
    }

    @Override
    public String toString() {
        return "Аист {" +
                "Рост = " + height +
                ", Вес = " + weight +
                ", Цвет глаз = '" + colorEyes + '\'' +
                "} " + super.toString();
    }
}
