import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import util.TestBase;
import util.TestUtil;

public class GoogleTestNg extends TestBase {
    TestUtil ut = new TestUtil();
    By googleSearchInput = By.name("q");
    String baseUrl = "https://www.google.com";

    @Test()
    public void googleAutomation(){
//        driver.get(baseUrl); // Waits for the page to load
//        driver.findElement(By.name("q")).sendKeys("Selenium");

        ut.navigateTo(baseUrl);
        ut.enterText(googleSearchInput,"Mztech");
    }


}

