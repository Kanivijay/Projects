package com.NykaaIPT.pom;

import org.openqa.selenium.support.PageFactory;

import com.NykaaIPT.base.BaseClass;
import com.utility.ConfigReader;

public class PageObjectManager extends BaseClass {
	
	private PageObjectManager () {
		PageFactory.initElements(driver, this);
	}
	
	private static PageObjectManager pom;
	
	private LoginImp Login_page;
	private ProductImp Product_page;
	private CartImp Cart_page;
	private PaymentImp Payment_page;
	
	private ConfigReader config_reader;
	
	public static PageObjectManager getPom() {
		if(pom == null) {
			pom = new PageObjectManager();
		}
		return pom;
    }
    public LoginImp getLogin_page () {
    	if(Login_page == null) {
    		Login_page = new LoginImp();	
    	}
    	return Login_page;    	
    }
    public ProductImp getProduct_page() {
    	if (Product_page == null) {
    		 Product_page = new ProductImp();
    	}
    	return Product_page;
    }
    public CartImp getCart_page() {
    	if (Cart_page == null) {
    		 Cart_page = new CartImp();
    	}
    	return Cart_page;
    } 
    public PaymentImp getPayment_page() {
    	if (Payment_page == null) {
    		 Payment_page = new PaymentImp();
    	}
    	return Payment_page;
    }

}



