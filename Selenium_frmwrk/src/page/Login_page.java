package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Selnium_Utility.Basic_operation;

public class Login_page extends Basic_operation
{
	static By uid=By.id("user-name");
	static By pwd=By.id("password");
	static By login=By.id("login-button");


	public static WebElement id() 
	{
		WebElement usrid=drv.findElement(uid);
		return usrid;
	}

	public static WebElement pwd() 
	{
		WebElement pwdd=drv.findElement(pwd);
		return pwdd;

	}

	public static WebElement lgn() 
	{
		WebElement ln=drv.findElement(login);
		return ln;

	}


	public static void user_action(String Username) 
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(id() ));
		id().sendKeys(Username);

	}
	public static void password_action(String password) 
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(pwd() ));
		pwd().sendKeys(password);
	}

	public static void Logn_action() 
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(lgn() ));
		lgn().click();
	}


}
