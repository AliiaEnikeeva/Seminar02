package homework02.base;

public class Wolf extends WildAnimal{
    private Boolean isLeader;

    public Wolf(double height, double weight, String colorEyes, String habitat, String findDate, Boolean isLeader) {
        super(height, weight, colorEyes, habitat, findDate);
        this.isLeader = isLeader;
    }

    @Override
    public void getVoice() {
        System.out.println("Аоооуууууууу!");
    }

    @Override
    public String toString() {
        return "Волк {" +
                "Вожак стаи = " + isLeader +
                ", Место обитания = '" + habitat + '\'' +
                ", Дата нахождения = '" + findDate + '\'' +
                ", Рост = " + height +
                ", Вес = " + weight +
                ", Цвет глаз = '" + colorEyes + '\'' +
                "} " + super.toString();
    }
}
