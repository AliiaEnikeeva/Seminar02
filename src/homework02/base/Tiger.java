package homework02.base;

public class Tiger extends WildAnimal{
    public Tiger(double height, double weight, String colorEyes, String habitat, String findDate) {
        super(height, weight, colorEyes, habitat, findDate);
    }

    @Override
    public void getVoice() {
        System.out.println("Рррррррррр...");
    }

    @Override
    public String toString() {
        return "Тигр {" +
                "Место обитания = '" + habitat + '\'' +
                ", Дата нахождения = '" + findDate + '\'' +
                ", Рост = " + height +
                ", Вес = " + weight +
                ", Цвет глаз = '" + colorEyes + '\'' +
                "} " + super.toString();
    }
}
