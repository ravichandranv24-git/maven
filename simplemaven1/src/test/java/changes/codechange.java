package changes;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class codechange {


public class BajajiTest {
	@Test
	public void opensite() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bajajauto.com/");
		Reporter.log("Bajaji lanuched",true);
		Reporter.log("Bajaji lanuched",true);

	}
}}

