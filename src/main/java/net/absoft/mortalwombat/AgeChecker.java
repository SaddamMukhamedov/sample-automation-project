package net.absoft.mortalwombat;

public class AgeChecker {
    private final int MIN_AGE = 18;

    public boolean caPlayGame(int age) {
        return age >= this.MIN_AGE;
    }
}
