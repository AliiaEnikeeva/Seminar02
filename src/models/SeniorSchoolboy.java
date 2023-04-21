package models;

public class SeniorSchoolboy extends Schoolboy implements Smoking, Army, Driving {

    @Override
    public void study() {
        System.out.println("Я должен учиться!");
    }

    @Override
    public void isSmoking() {
        System.out.println("Я бросаю курить!");
    }

    @Override
    public void isGoArmy() {
        System.out.println("Я боюсь военкомат!");
    }

    @Override
    public void isDriving() {
        System.out.println("Я хочу водить!");
    }
}
