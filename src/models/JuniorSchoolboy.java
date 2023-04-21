package models;

public class JuniorSchoolboy extends Schoolboy implements GameJuniorMiddle, AfterCare {

    @Override
    public void study() {
        System.out.println("Я люблю учиться!");
    }

    @Override
    public void game() {
        System.out.println("Я играю в игрушки!");
    }

    @Override
    public void isAfterCare() {
        System.out.println("Я хожу на продленку!");
    }
}
