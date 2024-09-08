package day5_kenh14;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestBaiTin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thanhnhung\\Documents\\AutomationProject\\01_AutomationProject\\01Tools\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//open page: https://kenh14.vn
		driver.get("https://kenh14.vn");
		//sleep 5s
		Thread.sleep(5000);
		// close browser
		driver.quit();
	}

}