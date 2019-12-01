package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import BaseTest.BaseTest;

public class FlipkartAppPage extends BaseTest {
	
	public FlipkartAppPage() {
		PageFactory.initElements(driver, this);
	}
	

	 @FindBy(how=How.XPATH, using="//*[@class=\"LM6RPg\"]")WebElement enterprod;
	 @FindBy(how=How.XPATH, using="//div[@class='O8ZS_U']/input")WebElement enterprodKeys;
	 @FindBy (how=How.XPATH, using="/html/body/div[2]/div/div/button")WebElement closePopup;
	 @FindBy(how=How.XPATH, using="//div//div//div[@class='_3wU53n' and contains(text(), \"Apple iPhone XR (Yellow, 64 GB)\")]") WebElement iphoneFlipkart;
	 @FindBy(how=How.XPATH, using="//div//div//div[@class='_1vC4OE _3qQ9m1']")
	public WebElement iPhoneFlipkartPrice;
	 
	
	public void searchIPhoneFlip() {
		closePopup.click();
		enterprod.sendKeys("iPhone XR (64GB) - Yellow");
		enterprodKeys.sendKeys(Keys.ENTER);
	}
	
	public void selectIPhoneFlip() {
		iphoneFlipkart.click();
	}
	
	
	
	
//	public void flpis() {
//		login.click();
//		enterprod.sendKeys("Apple iPhone XR (Yellow, 64 GB)");
//		//login.click();
//
//		
//		enterprodKeys.sendKeys(Keys.ENTER);
//		
//		iphoneFlipkart.click();
//		String parentHandle = driver.getWindowHandle();
//		for (String winHandle : driver.getWindowHandles()) {
//		    driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
//		}
//		String text2 = iPhoneFlipkartPrice.getText();
//		System.out.println("Value: " + text2);
//		
//		 //String text_removecurrencysymbol = text.substring(1,text.length());
//	        String text2_removecurrencysymbol = text2.substring(1,text2.length());
//
//	        //System.out.println(text_removecurrencysymbol);
//	        System.out.println(text2_removecurrencysymbol);
//
//	        int difference = Integer.parseInt(text2_removecurrencysymbol);
//
//	        System.out.println("Difference is:"+difference);
//	}
}
