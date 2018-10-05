package test;

import java.Providers;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import object_repositories.FileChuckerProperties;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class FileChuckerPageTest extends Providers {
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod(WebDriver driver) {
		driver = setupDriver();
	}

	@Test()
	public void scenariosTest() throws InterruptedException {
		driver.get(URL);

		// Actions
		// Choose upload file
		By fileChucker_btnChooseFile = FileChuckerProperties
				.getFileChucker_btnChooseFile();
		driver.findElement(fileChucker_btnChooseFile).click();
		uploadFileRobot(uploadFileLocation);

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

		// Verify results

		// Email adress
		By fileChuckerCompleted_txtEmailAddress = FileChuckerProperties
				.getFileChuckerCompleted_txtEmailAddress();
		String email = driver.findElement(fileChuckerCompleted_txtEmailAddress)
				.getText();
		String emailActual = email.substring(email.indexOf("Email Address: "),
				email.length());

		// Firstname
		By fileChuckerCompleted_txtFirstName = FileChuckerProperties
				.getFileChuckerCompleted_txtFirstName();
		String firstName = driver
				.findElement(fileChuckerCompleted_txtFirstName).getText();
		String firstNameActual = firstName.substring(
				firstName.indexOf("First Name: "), firstName.length());

		// Filename
		By fileChuckerCompleted_txtFileName = FileChuckerProperties
				.getFileChuckerCompleted_txtFileName();
		String fileName = driver.findElement(fileChuckerCompleted_txtFileName)
				.getText();
		String fileNameActual = fileName.substring(
				fileName.indexOf("File 1 of 2: "), fileName.length());

		if (emailActual.equals("nashtech@gmail.com")) {
			System.out.println("Email test result: Passed");
		}
		if (firstNameActual.equals("NASH TECH")) {
			System.out.println("Firstname test result: Passed");
		}
		if (fileName.equals("UploadFile.jpg")) {
			System.out.println("Upload file name test result: Passed");
		}
	}

	@AfterMethod
	public void afterMethod(WebDriver driver) {
		driver.close();
	}

}
