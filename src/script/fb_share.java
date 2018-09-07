package script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generic_lib.Excel;
import generic_lib.constant;

public class fb_share implements constant {

	public static void main(String[] args) {
		System.setProperty(key,value);
		WebDriver driver=new ChromeDriver();
		String url = Excel.getdata("sheet1", 16, 3);
		String username=Excel.getdata("sheet1",17,3);
		String password=Excel.getdata("sheet1",18,3);
		String search=Excel.getdata("sheet1", 21,3);
		driver.get(url);
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Actions A=new Actions(driver);
		A.sendKeys(Keys.ESCAPE).perform();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		for(int i=0;i<=2;i++)
		{
			try
			{
				driver.findElement(By.xpath("//input[@name='q']")).sendKeys(search);
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				break;
			}
			catch(Exception e)
			{
			}
		}
		driver.findElement(By.xpath("(//div[.='Lamborghini'])[1]")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[10]")).click();
		driver.findElement(By.xpath("//button[.='Post']"));
		driver.findElement(By.xpath("//div[@data-click='home_icon']")).click();
	}

}
