package homework02.base;

import homework02.metods.Training;

public class Dog extends HomeAnimal implements Training {
    private Boolean isTrained;

    public Dog(double height, double weight, String colorEyes, String nickname, String breed, Boolean vaccination, String coatColor, String birthDate, Boolean isTrained) {
        super(height, weight, colorEyes, nickname, breed, vaccination, coatColor, birthDate);
        this.isTrained = isTrained;
    }

    @Override
    public void getVoice() {
        System.out.println("Гав-гав");
    }

    @Override
    public void isTraining() {
        System.out.println("Меня можно дрессировать!");
    }

    @Override
    public String toString() {
        return "Собака {" +
                "Наличие дрессировки = " + isTrained +
                ", Кличка = '" + nickname + '\'' +
                ", Порода = '" + breed + '\'' +
                ", Наличие прививок = " + vaccination +
                ", Цвет шерсти = '" + birthDate + '\'' +
                ", Рост = " + height +
                ", Вес = " + weight +
                ", Цвет глаз = '" + colorEyes + '\'' +
                "} " + super.toString();
    }

    @Override
    public void love() {
        System.out.println("Погладь меня! Гав гав!");
    }
}
