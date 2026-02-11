package pomMethod;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotfullPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		//driver.manage().window().maximize();
		//TakeScreenShorFull page 
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sourceFile= ts.getScreenshotAs(OutputType.FILE);
		
		File targetFile=new File(System.getProperty("user.dir")+"\\screenshot\\fullpage.png");
		sourceFile.renameTo(targetFile);
	}

}
