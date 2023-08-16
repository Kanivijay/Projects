package com.utility;

public class ConfigReader {
	
	private static String browserLaunch = PropertyFileReader.getAPropertyFiles().getProperty("browserLaunch");
	private static String launchUrl = PropertyFileReader.getAPropertyFiles().getProperty("launchUrl");
	private static String Email = PropertyFileReader.getAPropertyFiles().getProperty("Email");
	private static String CardNumber = PropertyFileReader.getAPropertyFiles().getProperty("CardNumber");
	private static String ExpiryDate = PropertyFileReader.getAPropertyFiles().getProperty("ExpiryDate");
	private static String CVV = PropertyFileReader.getAPropertyFiles().getProperty("CVV");
	
	public static String getBrowserLaunch() {
		return browserLaunch;
	}
	public static String getLaunchUrl() {
		return launchUrl;
	}
	public static String getEmail() {
		return Email;
	}
	public static String getCardNumber() {
		return CardNumber;
	}
	public static String getExpiryDate() {
		return ExpiryDate;
	}
	public static String getCVV() {
		return CVV;
	}
	
}
