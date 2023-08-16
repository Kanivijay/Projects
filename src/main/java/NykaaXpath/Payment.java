package NykaaXpath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Payment {

	@FindBy(xpath = ("//input[@label='Card Number']"))
	private WebElement CardNumber;
	//CardNumber.click();
	//CardNumber.sendKeys("4263 9826 4026 9299");
	
	@FindBy(xpath = ("//input[@placeholder='Expiry (MM/YY)']"))
	private WebElement ExpiryDate;
	//ExpiryDate.click();
	//ExpiryDate.sendKeys("02/26");
	
	@FindBy(xpath = ("//input[@placeholder='CVV']"))
	private WebElement CVV;
	//CVV.click();
	//CVV.sendKeys("837");
	
	@FindBy(xpath = ("//button[@class='css-v61n2j e8tshxd0']"))
	private WebElement pay_Btn;
	//pay_Btn.click();
	
	@FindBy(xpath = ("//button[text()='Secure Card and pay']"))
	private WebElement securecardpay_Btn;
	//securecardpay_Btn.click();
	
	@FindBy(xpath = ("//button[text()='Pay Now']"))
	private WebElement paynow_Btn;
	//paynow_Btn.click();
	
	@FindBy(xpath = ("//button[text()='Close']"))
	private WebElement paymentfailed;
	//paymentfailed.click();
	
	@FindBy (xpath = ("//img[@class='css-0 ek8d9s80'][1]"))
	private WebElement product_remove;
	//product_remove.click();
	
	@FindBy(xpath = ("//p[text()='Bag']"))
	private WebElement remove_edit_Btn;
	//remove_edit_Btn.Click();
	
	@FindBy (xpath = ("//p[text()='Edit']"))
	private WebElement remove_product;
	
	@FindBy (xpath = ("//div[@data-test-id='product-remove']"))
	private WebElement remove_Btn;
	
	@FindBy (xpath = ("//div[@class='css-n3w7xh es81o671'][1]"))
	private WebElement remove;	
		
    }
