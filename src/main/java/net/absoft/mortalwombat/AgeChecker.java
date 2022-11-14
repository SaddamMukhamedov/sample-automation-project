package net.absoft.mortalwombat;

public class AgeChecker {
    private int minAge = 21;

    public boolean canPlayGame(int age) {
        return age >= this.minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }
}
