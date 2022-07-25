package pages;

import org.openqa.selenium.By;
import util.TestUtil;

public class MomediaContact {

    TestUtil ut = new TestUtil();

    String baseURL = "https://momedia.netlify.app/";

    By name =  By.id("validationCustom01");
    By email = By.id("validationCustom02");
    By message = By.id("validationCustom03");
   //By sendButton = By.xpath("//*[@id=\"root\"]//div[4]/button");

    public void navigateToContactPage(){
        ut.navigateTo(baseURL + "/contact");
    }

    public void fillContactForm(){
        ut.enterText(name,"Jarin Mahmud");
        ut.enterText(email, "jarinmahmud@gmail.com");
        ut.enterText(message, "Fill out the form.");

    }
    public void submitContactForm(){
       // ut.clickElement(sendButton);
    }


}
