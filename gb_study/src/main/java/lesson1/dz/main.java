package lesson1.dz;

import lesson1.dz.Competition.ObstacleCourse;
import lesson1.dz.Competition.HeightJumpMeters;
import lesson1.dz.Competition.HundredMeterRun;
import lesson1.dz.people.People;
import lesson1.dz.people.Team;

public class main {


    public static void main(String[] args) {

        ObstacleCourse obstacleCourse = new ObstacleCourse(new HundredMeterRun(8), new HeightJumpMeters(9));

        Team team1 = new Team("First", new People("ivan", 2, 8),
                new People("ivan1", 3, 8),
                new People("ivan2", 4, 8));

        obstacleCourse.doIt(team1);

        team1.getResult();


    }


}
