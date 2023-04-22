package homework02.base;

import homework02.base.Animal;

public abstract class Bird extends Animal {
    private double flyHeight;

    public Bird(double height, double weight, String colorEyes, double flyHeight) {
        super(height, weight, colorEyes);
        this.flyHeight = flyHeight;
    }

    public void fly(){
        System.out.println("Я лечу на высоте " + flyHeight + "метров");
    }

    @Override
    public String toString() {
        return "Птица {" +
                "Высота полета = " + flyHeight +
                ", Рост = " + height +
                ", Вес = " + weight +
                ", Цвет глаз '" + colorEyes + '\'' +
                "} " + super.toString();
    }
}
