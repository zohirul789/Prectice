import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://accounts.google.com/signin");
		
		driver.findElement(By.id("identifierId")).sendKeys("zohirul789@gmail.com");
		
		driver.findElement(By.id("identifierNext")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("password")).sendKeys("05071988");
		
		driver.findElement(By.id("passwordNext")).click();
		
		
	}

}
