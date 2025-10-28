package utilities;

import org.openqa.selenium.WebElement;

public class EleInt {
	
	public static void click(WebElement ele)
	{
		ele.click();
		
	}
	public static void sendKeys(WebElement ele, String val)
	{
		ele.sendKeys(val);
	}

}