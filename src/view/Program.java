package view;

import models.base.*;
import models.JuniorSchoolboy;
import models.MiddleSchoolboy;
import models.SeniorSchoolboy;

public class Program {
    public static void main(String[] args){
        Schoolboy[] schoolboys = new Schoolboy[] {new JuniorSchoolboy(), new MiddleSchoolboy(), new SeniorSchoolboy()};
        for (Schoolboy schoolboy: schoolboys) {
            getInfo(schoolboy);
        }
    }

    public static void getInfo(Schoolboy schoolboy){
        schoolboy.study();

        if(schoolboy instanceof GameJuniorMiddle gameJuniorMiddle){
            gameJuniorMiddle.game();
        }

        if(schoolboy instanceof AfterCare afterCare){
            afterCare.isAfterCare();
        }

        if(schoolboy instanceof Army army){
            army.isGoArmy();
        }

        if(schoolboy instanceof Cards cards){
            cards.isPlayCards();
        }

        if(schoolboy instanceof Driving driving){
            driving.isDriving();
        }

        if(schoolboy instanceof Smoking smoking){
            smoking.isSmoking();
        }
    }
}