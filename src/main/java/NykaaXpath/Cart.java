package NykaaXpath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cart {

	@FindBy(xpath = ("//span[text()='Add to Bag']"))
	private WebElement addtobag_Btn;
	//addtobag_Btn.click();
	
	@FindBy(xpath = ("//span[@class='cart-count']"))
	private WebElement cart_icon;
	//cart_icon.click();
	
	@FindBy(xpath = ("//div[@class='css-15vhhhd e25lf6d4']"))
	private WebElement proceed;
	//proceed.click();
	
	@FindBy(xpath = ("//button[@class='css-n7wnfc e8tshxd0']"))
	private WebElement deliverhere_Btn;
	//deliverhere_Btn.click();
	
	}
		
	





