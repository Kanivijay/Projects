package com.NykaaIPT.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NykaaIPT.base.BaseClass;

public class LoginImp extends BaseClass {
	
	public LoginImp () {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = NykaaInterface.signin_btn)
	private WebElement signin_btn;
	
	public WebElement getSignin_btn() {
		return signin_btn;
	}

	public WebElement getSignin_emailormob_btn() {
		return signin_emailormob_btn;
	}

	public WebElement getEmail_Btn() {
		return email_Btn;
	}

	public WebElement getEmailsubmit_Btn() {
		return emailsubmit_Btn;
	}

	public WebElement getProceed_Btn() {
		return proceed_Btn;
	}

	public WebElement getOtp() {
		return otp;
	}

	public WebElement getOtp_submit() {
		return otp_submit;
	}

	@FindBy(xpath = NykaaInterface.signin_emailormob_btn)
	private WebElement signin_emailormob_btn;
	
	@FindBy(xpath = NykaaInterface.email_Btn)
	private WebElement email_Btn;
	
	@FindBy(xpath = NykaaInterface.emailsubmit_Btn)
	private WebElement emailsubmit_Btn;
	
	@FindBy(xpath = NykaaInterface.proceed_Btn)
	private WebElement proceed_Btn;
	
	@FindBy(xpath = NykaaInterface.otp)
	private WebElement otp;
	
	@FindBy(xpath = NykaaInterface.otp_submit)
	private WebElement otp_submit;

}
