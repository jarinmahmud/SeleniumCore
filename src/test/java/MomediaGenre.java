import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MomediaGenre {
    public static void main(String[] args) throws InterruptedException {
        // Sets location of the chrome driver
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
                +"/chromedriver.exe");

        // Creates an instance of WebDriver using ChromeDriver
        // Telling selenium to use chrome
        WebDriver driver = new ChromeDriver();

        //maximize the window
        driver.manage().window().maximize();

        // opens browser to certain url
        driver.get("https://momedia.netlify.app");
        driver.findElement(By.id("search-input")).sendKeys("Action Movies");

        Thread.sleep(1200);
        driver.quit();

    }
}
