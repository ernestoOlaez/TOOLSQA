package WebDriverCommads;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.out.println("Execution after setting ChromeDriver path in System Variables");
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demoqa.com");
		 Thread.sleep(3000);
		 driver.quit();
		 System.out.println("Execution complete");

	}

}
