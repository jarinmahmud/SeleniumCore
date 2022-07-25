package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.TestBase;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestUtil extends TestBase {

    public void navigateTo(String URL) {
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void clickElement(By element) {
        WebElement localElement = waitForElement(element);
        localElement.click();
    }

    private WebElement waitForElement(By element) {
        WebDriverWait wait = new WebDriverWait(driver,10);

        Boolean found = wait.until(ExpectedConditions.or(
                ExpectedConditions.elementToBeClickable(element),
                ExpectedConditions.visibilityOfElementLocated(element)
        ));

        if (found) {
            return driver.findElement(element);
        } else {
            return driver.findElement(element);
        }
    }

//    private WebElement waitForElement(By element) {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        return wait.until(ExpectedConditions.visibilityOfElementLocated(element));
//    }

    public void enterText(By element, String text) {
        WebElement localElement = waitForElement(element);
        localElement.sendKeys(text);
    }

    public void getText(By element) {
        WebElement localElement = waitForElement(element);
        System.out.println(localElement.getText());
    }

    public void verifyText(By locator, String expectedText) {
        WebElement localElement = waitForElement(locator);
        String actualText = localElement.getText();
        Assert.assertEquals(expectedText.toLowerCase(), actualText.toLowerCase());
    }

//    private void screenshot(String fileName) {
//        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//
//        //Copy the file to a location and use try catch block to handle exception
//        try {
//            FileUtils.copyFile(screenshot, new File(System.getProperty("user.dir") + "/Screenshots/" + fileName + ".png"));
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//    }

    private void getMultipleText(By element){
        List<WebElement> localElement = driver.findElements(element);

        int elementsLength = localElement.size(); // 6

        for(int i = 0; i < elementsLength; i++){
            System.out.println(localElement.get(i).getText());
        }
    }
}
