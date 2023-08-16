package com.NykaaIPT.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NykaaIPT.base.BaseClass;

public class CartImp extends BaseClass {
	
	public CartImp () {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = NykaaInterface.addtobag_Btn)
	private WebElement addtobag_Btn;
	
	public WebElement getAddtobag_Btn() {
		return addtobag_Btn;
	}

	public WebElement getCart_icon() {
		return cart_icon;
	}

	public WebElement getProceed() {
		return proceed;
	}

	public WebElement getDeliverhere_Btn() {
		return deliverhere_Btn;
	}

	@FindBy(xpath = NykaaInterface.cart_icon)
	private WebElement cart_icon;
	
	@FindBy(xpath = NykaaInterface.proceed)
	private WebElement proceed;
	
	@FindBy(xpath = NykaaInterface.deliverhere_Btn)
	private WebElement deliverhere_Btn;	

    }
