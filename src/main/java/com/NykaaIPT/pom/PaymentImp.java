package com.NykaaIPT.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NykaaIPT.base.BaseClass;

public class PaymentImp extends BaseClass {

	public PaymentImp () {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = NykaaInterface.CardNumber)
	private WebElement CardNumber;
	
	public WebElement getCardNumber() {
		return CardNumber;
	}

	public WebElement getExpiryDate() {
		return ExpiryDate;
	}

	public WebElement getCVV() {
		return CVV;
	}

	public WebElement getPay_Btn() {
		return pay_Btn;
	}

	public WebElement getSecurecardpay_Btn() {
		return securecardpay_Btn;
	}

	public WebElement getPaynow_Btn() {
		return paynow_Btn;
	}

	public WebElement getPaymentfailed() {
		return paymentfailed;
	}

	public WebElement getProduct_remove() {
		return product_remove;
	}

	public WebElement getRemove_edit_Btn() {
		return remove_edit_Btn;
	}

	public WebElement getRemove_product() {
		return remove_product;
	}

	public WebElement getRemove_Btn() {
		return remove_Btn;
	}

	public WebElement getRemove() {
		return remove;
	}

	@FindBy(xpath = NykaaInterface.ExpiryDate)
	private WebElement ExpiryDate;
	
	@FindBy(xpath = NykaaInterface.CVV)
	private WebElement CVV;
	
	@FindBy(xpath = NykaaInterface.pay_Btn)
	private WebElement pay_Btn;
	
	@FindBy(xpath = NykaaInterface.securecardpay_Btn)
	private WebElement securecardpay_Btn;
	
	@FindBy(xpath = NykaaInterface.paynow_Btn)
	private WebElement paynow_Btn;
	
	@FindBy(xpath = NykaaInterface.paymentfailed)
	private WebElement paymentfailed;
	
	@FindBy(xpath = NykaaInterface.product_remove)
	private WebElement product_remove;
	
	@FindBy(xpath = NykaaInterface.remove_edit_Btn)
	private WebElement remove_edit_Btn;
	
	@FindBy(xpath = NykaaInterface.remove_product)
	private WebElement remove_product;
	
	@FindBy(xpath = NykaaInterface.remove_Btn)
	private WebElement remove_Btn;
	
	@FindBy(xpath = NykaaInterface.remove)
	private WebElement remove;
		
}
