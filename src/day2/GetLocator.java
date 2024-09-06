package day2;

import org.openqa.selenium.By;

public class GetLocator {

	public static void main(String[] args) {
		
		//By locator = getByLocator("id", "firstName");
		System.out.println(getByLocator("id", "firstName"));
		System.out.println(getByLocator("xpath", "//a"));
	}
 public static By getByLocator(String locatorType, String locatorValue) {
	 //chuyển đổi locatorType để chuẩn hóa đầu vào
	 By result = null;
	  locatorType = locatorType.toLowerCase();
	  switch(locatorType) {
	  case "id":
	  {result = By.id(locatorValue);
		break;}
	  case "name":
	  {result = By.id(locatorValue);
		break;}
	  case "linkText":
	  {result = By.id(locatorValue);
		break;}
	  case "cssSelector":
	  {result = By.id(locatorValue);
		break;}
	  case "partialLinkText":
	  {result = By.id(locatorValue);
		break;}
	  case "tagName":
	  {result = By.id(locatorValue);
		break;}
	  case "xpath":
	  {result = By.id(locatorValue);
		break;}
	  
	  }
	  return result;
	 

	    }

}
