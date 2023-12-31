package selenium_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pratice_Test_Automation {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver d=new ChromeDriver();
		d.get("https://practicetestautomation.com/");
		d.manage().window().maximize();
		Thread.sleep(2000);
		
		By ptc=By.xpath("//a[text()=\"Practice\"]");
		WebElement pratice=d.findElement(ptc);
		pratice.click();
		Thread.sleep(2000);
		
		By tstlgn=By.xpath("//a[text()=\"Test Login Page\"]");
		WebElement testlogin=d.findElement(tstlgn);
		testlogin.click();
		Thread.sleep(2000);
		
		By unm=By.xpath("//input[@id=\"username\"]");
		WebElement usrnm=d.findElement(unm);
		usrnm.sendKeys("student");
		Thread.sleep(2000);
		
		By pwd=By.xpath("//input[@id=\"password\"]");
		WebElement pswd=d.findElement(pwd);
		pswd.sendKeys("Password123");
		Thread.sleep(2000);
		
		By smt=By.id("submit");
		WebElement submit=d.findElement(smt);
		submit.click();
		Thread.sleep(2000);
		
		By lgt=By.xpath("//a[text()=\"Log out\"]");
		WebElement logout=d.findElement(lgt);
		logout.click();
		
		By unm1=By.xpath("//input[@id=\"username\"]");
		WebElement usrnm1=d.findElement(unm1);
		usrnm1.sendKeys("incorrectUser");
		Thread.sleep(2000);
		
		By pwd1=By.xpath("//input[@id=\"password\"]");
		WebElement pswd1=d.findElement(pwd1);
		pswd1.sendKeys("Password123");
		Thread.sleep(2000);
		
		By smt1=By.id("submit");
		WebElement submit1=d.findElement(smt1);
		submit1.click();
		Thread.sleep(2000);
		
		By unm2=By.xpath("//input[@id=\"username\"]");
		WebElement usrnm2=d.findElement(unm2);
		usrnm2.sendKeys("student");
		Thread.sleep(2000);
		
		By pwd2=By.xpath("//input[@id=\"password\"]");
		WebElement pswd2=d.findElement(pwd2);
		pswd2.sendKeys("Passwd123");
		Thread.sleep(2000);
		
		By smt2=By.id("submit");
		WebElement submit2=d.findElement(smt2);
		submit2.click();
		Thread.sleep(2000);
		
		By crs=By.xpath("//a[text()=\"Courses\"]");
		WebElement course=d.findElement(crs);
		course.click();
		Thread.sleep(2000);
		
		By ftrl=By.xpath("//a[text()=\"Start Free Trial\"]");
		WebElement frtrl=d.findElement(ftrl);
		frtrl.click();
		
		
		
	}

}
