package com.NykaaIPT.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public interface NykaaInterface {
	
	//Login Class
	String signin_btn = "//button[@kind='primary']";
	String signin_emailormob_btn = "//button[@kind='secondary']";
	String email_Btn = "//input[@name='emailMobile']";
	String emailsubmit_Btn = "submitVerification";
	String proceed_Btn = "//button[@class='button big full small-button-seperator']";
	String otp = "otpField";
	String otp_submit = "//button[@type='submit']";
	
	//Product Class
	String selectproduct = "//a[@href='https://www.nykaa.com/sp/makeup-clp-desktop/makeup']";
	String product = "//p[text()='Lakme Absolute Lip Mousse']";
	
	//Cart Class
	String addtobag_Btn = "//span[text()='Add to Bag']";
	String cart_icon = "//span[@class='cart-count']";
	String proceed = "//div[@class='css-15vhhhd e25lf6d4']";
	String deliverhere_Btn = "//button[@class='css-n7wnfc e8tshxd0']";
	
	//Payment Class
	String CardNumber = "//input[@label='Card Number']";
	String ExpiryDate = "//input[@placeholder='Expiry (MM/YY)']";
	String CVV = "//input[@placeholder='CVV']";
	String pay_Btn = "//button[@class='css-v61n2j e8tshxd0']";
	String securecardpay_Btn = "//button[text()='Secure Card and pay']";
	String paynow_Btn = "//button[text()='Pay Now']";
	String paymentfailed = "//button[text()='Close']";
	String product_remove = "//img[@class='css-0 ek8d9s80'][1]";
	String remove_edit_Btn = "//p[text()='Bag']";
	String remove_product = "//p[text()='Edit']";
	String remove_Btn = "//div[@data-test-id='product-remove']";
	String remove = "//div[@class='css-n3w7xh es81o671'][1]";
		
}
