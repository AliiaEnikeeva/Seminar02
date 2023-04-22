package homework02.base;

public class Chiken extends Bird{
    public Chiken(double height, double weight, String colorEyes, double flyHeight) {
        super(height, weight, colorEyes, flyHeight);
    }

    @Override
    public void getVoice() {
        System.out.println("Ко-ко-ко!");
    }

    @Override
    public String toString() {
        return "Курица {" +
                "Рост = " + height +
                ", Вес = " + weight +
                ", Цвет глаз = '" + colorEyes + '\'' +
                "} " + super.toString();
    }
}
