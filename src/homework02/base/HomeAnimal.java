package homework02.base;

import homework02.base.Animal;

public abstract class HomeAnimal extends Animal {
    public String nickname;
    public String breed;
    public Boolean vaccination;
    public String coatColor;
    public String birthDate;

    public HomeAnimal(double height, double weight, String colorEyes, String nickname, String breed, Boolean vaccination, String coatColor, String birthDate) {
        super(height, weight, colorEyes);
        this.nickname = nickname;
        this.breed = breed;
        this.vaccination = vaccination;
        this.coatColor = coatColor;
        this.birthDate = birthDate;
    }

    public abstract void love();
}
