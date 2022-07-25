public class WaitInSelenium {
    /*
    The wait commands are essential when it comes to executing Selenium tests. They help to observe and troubleshoot issues that may occur due to variation in time lag.

While running Selenium tests, it is common for testers to get the message “Element Not Visible Exception“. This appears when a particular web element with which WebDriver has to interact, is delayed in its loading. To prevent this Exception, Selenium Wait Commands must be used.
     */
    /*
    Implicit Wait:
    Implicit Wait directs the Selenium WebDriver to wait for a certain measure of time before throwing an exception. Once this time is set, WebDriver will wait for the element before the exception occurs.

    Syntax:
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     */
    /*
    Explicit wait:
    By using the Explicit Wait command, the WebDriver is directed to wait until a certain condition occurs before proceeding with executing the code.

Setting Explicit Wait is important in cases where there are certain elements that naturally take more time to load. If one sets an implicit wait command, then the browser will wait for the same time frame before loading every web element. This causes an unnecessary delay in executing the test script.

Explicit wait is more intelligent, but can only be applied for specified elements.
 However, it is an improvement on implicit wait since it allows the program to pause for dynamically loaded Ajax elements.

 Syntax:

     */
    /*
    Fluent Wait:
    Fluent Wait in Selenium marks the maximum amount of time for Selenium WebDriver to wait for a certain condition (web element) becomes visible. It also defines how frequently WebDriver will check if the condition appears before throwing the “ElementNotVisibleException”.

To put it simply, Fluent Wait looks for a web element repeatedly at regular intervals until timeout happens or until the object is found.
     */
}
