package lesson1.dz.Competition;

import lesson1.dz.people.People;
import lesson1.dz.people.Team;

public class HundredMeterRun extends BaseCompetition {

    private double time;

    public HundredMeterRun(double time) {
        this.time = time;
    }

    @Override
    public void doIt(Team team) {
        for (People people : team.getPeoples()) {
            if (people.hundredMeterRun() >= time) {
                people.setResult(this, true);
            } else {
                people.setResult(this, false);
            }
        }

    }

    @Override
    public String toString() {
        return "Соревнования по бегу на 100 метров";
    }
}
