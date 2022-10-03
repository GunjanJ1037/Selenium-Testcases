package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithForms {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
				
		driver.get("F:\\\\HTML Pages\\\\HTML Pages");
		driver.findElement(By.xpath("/html/body/table/tbody/tr[22]/td[1]/a")).click();
		//Find Username textbox and enter value
		driver.findElement(By.id("txtUserName")).sendKeys("Gunjan123");

		//Find Password textbox and enter value
		driver.findElement(By.name("txtPwd")).sendKeys("g1037");
		

		//Find Confirm Password textbox and enter value
		driver.findElement(By.className("Format")).sendKeys("g1037");
		
		//Find First Name textbox and enter value
		driver.findElement(By.cssSelector("input.Format1")).sendKeys("Gunjan");
		
		//Find Last Name textbox and enter value
		driver.findElement(By.name("txtLN")).sendKeys("Joundal");
		
		//Find Gender radio button and enter value
		driver.findElement(By.cssSelector("input[value='Female']")).click();
		
		//Find Date Of Birth textbox and enter value
		driver.findElement(By.name("DtOB")).sendKeys("07/02/1997");
		
		//Find Email textbox and enter value
		driver.findElement(By.name("Email")).sendKeys("gjoundal@gmail.com");
		
		//Find Address textbox and enter value
		driver.findElement(By.name("Address")).sendKeys("Vadanage");

		Select drpCity = new Select(driver.findElement(By.name("City")));
		//drpCity.selectByVisibleText("Mumbai");
		//driver.findElement(By.cssSelector("input[value='Mumbai']")).click();
		drpCity.selectByVisibleText("Mumbai");
		drpCity.selectByIndex(1);
		drpCity.selectByIndex(2);
		
		//Find Phone textbox and enter value	
		driver.findElement(By.name("Phone")).sendKeys("1234567890");
		
		List<WebElement> element = driver.findElements(By.name("chkHobbies"));
		
		for (WebElement webElement : element)
		{
			webElement.click();
			
			try
			{
				Thread.sleep(8000);
			}
			catch(InterruptedException ex)
			{
				System.out.println(ex.getMessage());
			}			
		}
		
        		//Examples of Get commands
		
				String Title;
				Title=driver.getTitle();
				System.out.println("The page title is :" + Title);
				
				Boolean b =  driver.getPageSource().contains("Email Registration Form");
				
				if(b==true)
				{
					System.out.println("U got the right title");
				}
				else
				{
					System.out.println("Sorry .... Wrong title");
				}

				String currentURL;
				currentURL = driver.getCurrentUrl();
				System.out.println("The page current URL is :" + currentURL);
						
				//Find Submit button
				driver.findElement(By.name("submit")).click();
				Thread.sleep(8000);
				driver.close();
				//driver.quit();
	}
}

	
