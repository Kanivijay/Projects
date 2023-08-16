package com.NykaaIPT.runner;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRunner {

	static WebDriver driver;
		
    public static void browserLaunch() {
    	
    	WebDriverManager.chromedriver().setup();
    	driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.nykaa.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        }
    public static void userlogin() throws InterruptedException {
    	WebElement signin_btn = driver.findElement(By.xpath("(//button[@kind='primary'])"));
    	signin_btn.click();
		WebElement signin_emailormob_btn = driver.findElement(By.xpath("(//button[@kind='secondary'])"));
		signin_emailormob_btn.click();
		WebElement email_Btn = driver.findElement(By.xpath("//input[@name='emailMobile']"));
		email_Btn.sendKeys("sridevivijay31@gmail.com");
		WebElement emailsubmit_Btn = driver.findElement(By.id("submitVerification"));
		emailsubmit_Btn.click();
		WebElement proceed_Btn = driver.findElement(By.xpath("//button[@class='button big full small-button-seperator']"));
		proceed_Btn.click();
        WebElement otp = driver.findElement(By.id("otpField"));
		otp.sendKeys("387154");
		Thread.sleep(30000);
		WebElement otp_submit = driver.findElement(By.xpath("//button[@type='submit']"));		
		otp_submit.click();
        }
    public static void ProductSelect() throws Throwable {
    	WebElement selectProduct=driver.findElement(By.xpath("//a[@href='https://www.nykaa.com/sp/makeup-sale/makeup-sale']"));
    	selectProduct.click();    
    	Set<String> windowHandles = driver.getWindowHandles();
    	for(String string:windowHandles)
    	{
    	    String url=driver.switchTo().window(string).getCurrentUrl();
    	    System.out.println(url);    
    	}
    	String url = "https://www.nykaa.com/sp/makeup-clp-desktop/makeup";
    	for(String string:windowHandles)
    	{
    		if(driver.switchTo().window(string).getCurrentUrl().equals(url));
    	}
    	JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(3000);
        WebElement product = driver.findElement(By.xpath("//p[text()='Manish Malhotra Hi Shine Lipstick - Long Lasting, UVB Protected, Glossy Finish']"));
        product.click();
        js.executeScript("window.scrollBy(0,200)");
        }
    public static void Cart() throws Throwable {
    	WebElement addtobag_Btn = driver.findElement(By.xpath("//span[text()='Add to Bag']"));
    	addtobag_Btn.click();
    	WebElement cart_icon = driver.findElement(By.xpath("//span[@class='cart-count']"));
    	cart_icon.click();
    	driver.switchTo().frame(0);
    	Thread.sleep(3000);
		WebElement proceed = driver.findElement(By.xpath("//div[@class='css-15vhhhd e25lf6d4']"));
		proceed.click();
		WebElement deliverhere_Btn = driver.findElement(By.xpath("//button[@class='css-n7wnfc e8tshxd0']"));
		deliverhere_Btn.click();
		}
    public static void Payment(String filename) throws InterruptedException, IOException {
    	WebElement CardNumber = driver.findElement(By.xpath("//input[@label='Card Number']"));
    	CardNumber.click();
    	Thread.sleep(3000);
    	CardNumber.sendKeys("4263 9826 4026 9299");
    	WebElement ExpiryDate = driver.findElement(By.xpath("//input[@placeholder='Expiry (MM/YY)']"));
    	ExpiryDate.click();
    	Thread.sleep(2000);
    	ExpiryDate.sendKeys("02/26");
    	WebElement CVV = driver.findElement(By.xpath("//input[@placeholder='CVV']"));
    	CVV.click();
    	Thread.sleep(2000);
    	CVV.sendKeys("837");
    	WebElement pay_Btn = driver.findElement(By.xpath("//button[@class='css-v61n2j e8tshxd0']"));
    	pay_Btn.click();
    	WebElement securecardpay_Btn = driver.findElement(By.xpath("//button[text()='Secure Card and pay']"));
    	securecardpay_Btn.click();
    	WebElement paynow_Btn = driver.findElement(By.xpath("//button[text()='Pay Now']"));
    	paynow_Btn.click();
    	Thread.sleep(10000);
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File des = new File("C:\\Users\\Kanisri\\eclipse-workspace\\Selenium\\Screenshot\\"+filename+".png");
        FileHandler.copy(src,des);
        WebElement paymentfailed = driver.findElement(By.xpath("//button[text()='Close']"));
        paymentfailed.click();   
        WebElement product_remove = driver.findElement(By.xpath("//img[@class='css-0 ek8d9s80'][1]"));
        product_remove.click();
        WebElement remove_edit_Btn = driver.findElement(By.xpath("//p[text()='Bag']"));
        remove_edit_Btn.click();
        WebElement remove_product = driver.findElement(By.xpath("//p[text()='Edit']"));
        remove_product.click();
        WebElement remove_Btn = driver.findElement(By.xpath("//div[@data-test-id='product-remove']"));
        remove_Btn.click(); 
        WebElement remove = driver.findElement(By.xpath("//div[@class='css-n3w7xh es81o671'][1]"));
        remove.click();
        }
    	
    public static void main(String args[]) throws Throwable {

	browserLaunch();
	userlogin();
	ProductSelect();
	Cart();
	Payment("Nykaa");
	
}
	
}
