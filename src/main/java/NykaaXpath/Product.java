package NykaaXpath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Product {
	
	@FindBy(xpath = ("//a[@href='https://www.nykaa.com/sp/makeup-clp-desktop/makeup']"))
	private WebElement selectproduct;
	//selectProduct.click();
	
	@FindBy(xpath = ("//p[text()='Manish Malhotra Hi Shine Lipstick - Long Lasting, UVB Protected, Glossy Finish']"))
	private WebElement product;
	//product.click();
	
    }
