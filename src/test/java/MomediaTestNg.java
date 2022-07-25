import org.openqa.selenium.By;
import org.testng.annotations.Test;
import util.TestBase;
import util.TestUtil;

public class MomediaTestNg extends TestBase {
    TestUtil ut = new TestUtil();
    By searchInput = By.id("search-input");
    String baseUrl = "https://momedia.netlify.app/contact";

    @Test()
    public void momediaAutomation(){
//        driver.get(baseUrl); // Waits for the page to load
//        driver.findElement(By.name("q")).sendKeys("Selenium");
//driver.get(baseUrl);
       ut.navigateTo(baseUrl);
        ut.enterText(searchInput,"Batman");
    }

}
