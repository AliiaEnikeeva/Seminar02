package homework02.base;

public class Cat extends HomeAnimal {
    private Boolean wool;

    public Cat(double height, double weight, String colorEyes, String nickname, String breed, Boolean vaccination, String coatColor, String birthDate, Boolean wool) {
        super(height, weight, colorEyes, nickname, breed, vaccination, coatColor, birthDate);
        this.wool = wool;
    }

    @Override
    public void getVoice() {
        System.out.println("Мяу");
    }

    @Override
    public String toString() {
        return "Кот {" +
                "Наличие шерсти = " + wool +
                ", Кличка = '" + nickname + '\'' +
                ", Порода = '" + breed + '\'' +
                ", Наличие прививок = " + vaccination +
                ", Цвет шерсти = '" + coatColor + '\'' +
                ", Дата рождения = '" + birthDate + '\'' +
                ", Рост = " + height +
                ", Вес = " + weight +
                ", Цвет глаз = '" + colorEyes + '\'' +
                "} " + super.toString();
    }

    @Override
    public void love() {
        System.out.println("Погладь меня! Мяу! Мурррр!");

    }
}
