package test;

import java.util.ArrayList;

import object_repositories.FileChuckerProperties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import utils.ProvidersUtils;

public class FileChuckerPageTest extends ProvidersUtils {
	WebDriver driver;
	ArrayList<String> expectedResult = new ArrayList<String>();
	ArrayList<String> actualResult = new ArrayList<String>();

	@BeforeMethod
	public void beforeMethod() {
		driver = setupDriver();
	}

	@Test()
	public void scenariosTest() throws InterruptedException {
		driver.get(URL);

		/*-------- Actions ------------*/
		// Choose upload file
		By fileChucker_btnChooseFile = FileChuckerProperties
				.getFileChucker_btnChooseFile();
		driver.findElement(fileChucker_btnChooseFile).click();
		uploadFileRobot(uploadFileLocation);
		Thread.sleep(3000);

		// Destination of upload file
		By fileChucker_SelectOption_UploadTo = FileChuckerProperties
				.getFileChucker_SelectOption_UploadTo();
		driver.findElement(fileChucker_SelectOption_UploadTo).click();

		// New subfolder? Name field
		By fileChucker_txtNewSubFolder = FileChuckerProperties
				.getFileChucker_txtNewSubFolder();
		driver.findElement(fileChucker_txtNewSubFolder).sendKeys(
				"nashtech1254353");

		// Email Address field
		By fileChucker_txtEmailAddress = FileChuckerProperties
				.getFileChucker_txtEmailAddress();
		driver.findElement(fileChucker_txtEmailAddress).sendKeys(
				"nashtech@gmail.com");

		// First Name field
		By fileChucker_txtFirstName = FileChuckerProperties
				.getFileChucker_txtFirstName();
		driver.findElement(fileChucker_txtFirstName).sendKeys("NASH TECH");

		// Upload button
		By fileChucker_btnUpload = FileChuckerProperties
				.getFileChucker_btnUpload();
		driver.findElement(fileChucker_btnUpload).click();
		Thread.sleep(10000);

		/*-------------- Verify results ------------*/
		// Email adress
		By fileChuckerCompleted_txtEmailAddress = FileChuckerProperties
				.getFileChuckerCompleted_txtEmailAddress();
		String email = driver.findElement(fileChuckerCompleted_txtEmailAddress)
				.getText();
		String emailActual = email.substring(
				email.indexOf("nashtech@gmail.com"), email.length());
		System.out.println(emailActual);

		// Firstname
		Thread.sleep(6000);
		By fileChuckerCompleted_txtFirstName = FileChuckerProperties
				.getFileChuckerCompleted_txtFirstName();
		String firstName = driver
				.findElement(fileChuckerCompleted_txtFirstName).getText();
		String firstNameActual = firstName.substring(
				firstName.indexOf("NASH TECH"), firstName.length());
		System.out.println(firstNameActual);

		// Filename
		Thread.sleep(6000);
		By fileChuckerCompleted_txtFileName = FileChuckerProperties
				.getFileChuckerCompleted_txtFileName();
		String fileName = driver.findElement(fileChuckerCompleted_txtFileName)
				.getText();
		System.out.println(fileName);

		System.out.println("\n ----------------RESULT------------------ \n");
		if (emailActual.equals("nashtech@gmail.com")) {
			System.out.println("Email test result: Passed");
		} else {
			System.out.println("Email test result: Failed");
		}
		if (firstNameActual.equals("NASH TECH")) {
			System.out.println("Firstname test result: Passed");
		} else {
			System.out.println("Firstname test result: Failed");
		}
		if (fileName.equals("UploadFile.jpg")) {
			System.out.println("File name test result: Passed");
		} else {
			System.out.println("File name test result: Failed");
		}
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
