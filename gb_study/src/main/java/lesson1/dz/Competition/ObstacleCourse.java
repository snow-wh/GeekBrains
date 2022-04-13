package lesson1.dz.Competition;

import lesson1.dz.people.Team;

public class ObstacleCourse<T extends BaseCompetition> {


    private T[] obstacles;

    @SafeVarargs
    public ObstacleCourse(T... obstacles) {
        this.obstacles = obstacles;

    }


    public void doIt(Team team) {

        for (T obstacle : obstacles) {
            obstacle.doIt(team);
        }


    }


}
