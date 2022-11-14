package net.absoft.wombat;

import net.absoft.mortalwombat.AgeChecker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AgeCheckerTest {


    @Test
    public void testAgedUserCanPlay() {

        AgeChecker ageChecker = new AgeChecker();
        Assert.assertTrue(ageChecker.canPlayGame(25), "Aged user can't play a game");
        ageChecker.setMinAge(14);
        Assert.assertTrue(ageChecker.canPlayGame(25), "Aged user can't play a game");
    }


    @Test
    public void testThatTooYoungUsersCanNotPlay() {

        AgeChecker ageChecker = new AgeChecker();
        Assert.assertFalse(ageChecker.canPlayGame(19), "Under Aged user can't play a game");

    }


}
