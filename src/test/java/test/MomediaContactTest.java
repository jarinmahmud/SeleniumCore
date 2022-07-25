package test;

import org.testng.annotations.Test;
import pages.MomediaContact;
import util.TestBase;

public class MomediaContactTest extends TestBase {
    MomediaContact pg = new MomediaContact();

    @Test()
    public void contactUsTest(){
        pg.navigateToContactPage();
        pg.fillContactForm();
        pg.submitContactForm();
    }
}
