package cyclos_web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Execution {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver drv = new ChromeDriver();
		drv.get("https://demo.cyclos.org/ui/home");

		drv.manage().window().maximize();
		Thread.sleep(2000);
		
		register_cyclos.rtr();
		

	}

}
