package com.NykaaIPT.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NykaaIPT.base.BaseClass;

public class ProductImp extends BaseClass {
	
	public ProductImp () {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = NykaaInterface.selectproduct)
	private WebElement selectproduct;
	
	public WebElement getSelectproduct() {
		return selectproduct;
	}

	public WebElement getProduct() {
		return product;
	}

	@FindBy(xpath = NykaaInterface.product)
	private WebElement product;
	
}
