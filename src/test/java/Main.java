import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // Sets location of the chrome driver
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
                +"/chromedriver.exe");

        // Creates an instance of WebDriver using ChromeDriver
        // Telling selenium to use chrome
        WebDriver driver = new ChromeDriver();

        // opens browser to certain url
        driver.get("https://www.mztech.us"); // .get() - waits for the entire page to load

        //Navigation commands
        driver.navigate().to("https://www.facebook.com"); // this just navigates to the browser
        driver.navigate().back(); // goes back to previous navigated url
        driver.navigate().forward(); // goes forward to previous navigated url
        driver.navigate().refresh(); // Refreshes the page

        //Close commands
        driver.quit(); // Closes the entire browser
        driver.close(); // Closes the current tab or closes the browser if only one tab is open

        // Tells java to wait for 5 second
        Thread.sleep(5000);
        System.out.println("Done...");
    }
}
