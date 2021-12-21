package ctl.it.qa.testAssignment;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestAssignmentClickelement {
	
	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ab55672\\ChromeDriver\\ChromeDriver95\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.lumen.com/en-us/home.html");
			driver.manage().window().maximize();
			Actions ac = new Actions(driver);
			WebElement SOLUTION_TOOLTIP = driver.findElement(By.xpath("//span[@class='tier-link'][contains(.,'SOLUTIONS')]"));
			WebElement ByIndustry_Link = driver.findElement(By.xpath("//span[@class='tier-link'][contains(.,'By Industry')]"));
			WebElement FINANCIAL_SERVICES_Link = driver.findElement(By.xpath("//ul[@class='tier3 column-count-2']//li[contains(@class,'tier-item')]//a[contains(@class,'tier-link')][contains(text(),'Financial Services')]"));
			try {
				ac.moveToElement(SOLUTION_TOOLTIP).moveToElement(ByIndustry_Link).build().perform();
				ac.click(FINANCIAL_SERVICES_Link).build().perform();
			} catch (Exception e) {
				// TODO: handle exception
			}
			//A.moveToElement(SOLUTION_TOOLTIP).moveToElement(ByIndustry_Link).click(FINANCIAL_SERVICES_Link).build().perform();
			
		
		Thread.sleep(3000);
		//System.out.println(driver.getCurrentUrl());
		if (driver.getCurrentUrl().contains("financial-services")) {
			System.out.println("UserNavigated to financial-services page ");
		}else {
			System.out.println("User is not Navigated to financial-services page ");
		}
				
			driver.quit();
		
		
	}

}
