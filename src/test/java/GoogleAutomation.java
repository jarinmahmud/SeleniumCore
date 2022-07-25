import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutomation {
    public static void main(String[] args) throws InterruptedException {
        // Sets location of the chrome driver
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
                +"/chromedriver.exe");

        // Creates an instance of WebDriver using ChromeDriver
        // Telling selenium to use chrome
        WebDriver driver = new ChromeDriver();

        // opens browser to certain url
       // driver.get("https://www.mztech.us"); // .get() - waits for the entire page to load
        //....//

        //driver.findElement(By.name("q")).sendKeys("Mztech");

        driver.get("https://demoqa.com/automation-practice-form");
        driver.findElement(By.id("firstName")).sendKeys("Jarin");
        driver.findElement(By.id("lastName")).sendKeys("Mahmud");
        driver.findElement(By.id("userEmail")).sendKeys("jarinmahmud@gmail.com");
        //driver.findElement(By.className("custom-control-label")); //subject
        driver.findElement(By.id("userNumber")).sendKeys("9294004804");
        driver.findElement(By.id("dateOfBirthInput")).clear();
        driver.findElement(By.id("dateOfBirthInput")).sendKeys("24 March 1996");

        //hobbies
        //picture
        //gender
        driver.findElement(By.id("currentAddress")).sendKeys("Dallas,TX");

        Thread.sleep(5000);
    }
}
