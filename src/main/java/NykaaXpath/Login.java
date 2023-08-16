package NykaaXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NykaaIPT.base.BaseClass;

public class Login extends BaseClass {
	
	public Login() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = ("//button[@kind='primary']"))
	private WebElement signin_btn;
	//signin_btn.click();

	@FindBy(xpath = ("//button[@kind='secondary']"))
	private WebElement signin_emailormob_btn;
	//signin_emailormob_btn.click();

	@FindBy(xpath = ("//input[@name='emailMobile']"))
	private WebElement email_Btn;
	//email_Btn.sendKeys("sridevivijay31@gmail.com");
	
	@FindBy(id = ("submitVerification"))
	private WebElement emailsubmit_Btn;
	//emailsubmit_Btn.click();
	
	@FindBy(xpath = ("//button[@class='button big full small-button-seperator']"))
	private WebElement proceed_Btn;
	//proceed_Btn.click();
	
	@FindBy(id = ("otpField"))
	private WebElement otp;
	//otp.sendKeys("387154");
	
	@FindBy(xpath = ("//button[@type='submit']"))
	private WebElement otp_submit;
	//otp_submit.click();
	
	}
