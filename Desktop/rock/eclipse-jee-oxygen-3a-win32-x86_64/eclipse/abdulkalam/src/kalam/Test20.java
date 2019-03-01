package kalam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test20
{

	public static void main(String[] args) throws Exception
	{
		//Launch site	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\rock\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		Thread.sleep(5000);
	//Test wheather it is Singleselect or Multiselect	
		driver.findElement(By.xpath("(//*[contains(text(),'Holidays')])[5]")).click();
		WebElement w=driver.findElement(By.name("nights"));
		Select s=new Select(w);
    //select by index
		s.selectByIndex(5);
	//close site
	    driver.close();

	}

}
