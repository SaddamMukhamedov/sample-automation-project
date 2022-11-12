package net.absoft.wombat;

import net.absoft.mortalwombat.AgeChecker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AgeCheckerTest {


    @Test
    public void testAgedUserCanPlay() {

        AgeChecker ageChecker = new AgeChecker();
        Assert.assertTrue(ageChecker.caPlayGame(19), "Aged user can't play a game");

    }

}
