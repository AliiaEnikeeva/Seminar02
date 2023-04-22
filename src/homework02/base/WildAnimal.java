package homework02.base;

import homework02.base.Animal;

public class WildAnimal extends Animal {
    public String habitat;
    public String findDate;

    public WildAnimal(double height, double weight, String colorEyes, String habitat, String findDate) {
        super(height, weight, colorEyes);
        this.habitat = habitat;
        this.findDate = findDate;
    }

    @Override
    public void getVoice() {

    }
}
