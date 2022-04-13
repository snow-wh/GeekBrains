package lesson1.dz.Competition;

import lesson1.dz.people.People;
import lesson1.dz.people.Team;

public class HeightJumpMeters extends BaseCompetition {
    private int height;

    public HeightJumpMeters(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Team team) {
        for (People people : team.getPeoples()) {
            if (people.heightJump() >= height) {
                people.setResult(this, true);
            } else {
                people.setResult(this, false);
            }
        }

    }

    @Override
    public String toString() {
        return "Соревнования по прыжкам в высоту";
    }
}

