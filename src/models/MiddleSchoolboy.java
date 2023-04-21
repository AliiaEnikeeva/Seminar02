package models;

public class MiddleSchoolboy extends Schoolboy implements GameJuniorMiddle, Smoking, Cards {

    @Override
    public void study() {
        System.out.println("Я ненавижу учиться!");
    }

    @Override
    public void game() {
        System.out.println("Я играю в Minecraft!");
    }

    @Override
    public void isSmoking() {
        System.out.println("Я начинаю курить!");
    }

    @Override
    public void isPlayCards() {
        System.out.println("Я играю в Мафию!");
    }
}
