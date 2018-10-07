package utils;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Providers {
	public String URL = "https://encodable.com/uploaddemo/";
	public String uploadFileLocation = "https://encodable.com/uploaddemo/";
	public WebDriver setupDriver() {
		System.setProperty("webdriver.chrome.driver",
				"/SeleniumProject/src/main/java/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}

	public void uploadFileRobot(String fileLocation)
			throws InterruptedException {
		Thread.sleep(6000);
		try {

			// Setting clipboard with file location
			setClipboardData(fileLocation);
			
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(6000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception exp) {
			exp.printStackTrace();
		}
	}

	public void setClipboardData(String fileLocation) {
		StringSelection stringSelection = new StringSelection(fileLocation);
		Toolkit.getDefaultToolkit().getSystemClipboard()
				.setContents(stringSelection, null);
	}
}
