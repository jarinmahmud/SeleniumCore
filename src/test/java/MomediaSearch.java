import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MomediaSearch {
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
        driver.findElement(By.id("search-input")).sendKeys("The Bad Guys");
        driver.findElement(By.xpath("/html/body/div/div/nav/div/form/span/div/ul/li[1]/div/div/a/p")).click();
        String expectedName = "The Bad Guys";
        String actualName = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/header/section/div[1]/h1")).getText();
        if (expectedName.equals(actualName)){
            System.out.println("Search criteria worked!");
        }else{
            System.out.println("Please try again.");
        }
        Thread.sleep(1200);
        driver.quit();

    }
}
