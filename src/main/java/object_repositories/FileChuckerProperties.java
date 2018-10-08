package object_repositories;

import org.openqa.selenium.By;

public class FileChuckerProperties {
	public static By fileChucker_btnChooseFile = By
			.xpath("//*[contains(@id,'uploadname1')]");
	public static By fileChucker_SelectOption_UploadTo = By
			.xpath("//*[contains(@id,'firstfile')]/..//*[@value='/' and . = '/uploaddemo/files/']");
	public static By fileChucker_txtNewSubFolder = By
			.xpath("//*[contains(@id,'newsubdir1')]");
	public static By fileChucker_txtEmailAddress = By
			.xpath("//*[contains(@id,'formfield-email_address')]");
	public static By fileChucker_txtFirstName = By
			.xpath("//*[contains(@id,'formfield-first_name')]");
	public static By fileChucker_btnUpload = By
			.xpath("//*[contains(@id,'uploadbutton') and contains(@value,'Begin Upload')]");

	public static By fileChuckerCompleted_txtEmailAddress = By
			.xpath("//*[@id='fcuploadsummary']/dd[4]");
	public static By fileChuckerCompleted_txtFirstName = By
			.xpath("//*[@id='fcuploadsummary']/dd[5]");
	public static By fileChuckerCompleted_txtFileName = By
			.xpath("//*[@id='fcuploadsummary']/..//a[contains(@href,'&file=')]");

	public static By getFileChucker_btnChooseFile() {
		return fileChucker_btnChooseFile;
	}

	public static void setFileChucker_btnChooseFile(By fileChucker_btnChooseFile) {
		FileChuckerProperties.fileChucker_btnChooseFile = fileChucker_btnChooseFile;
	}

	public static By getFileChucker_SelectOption_UploadTo() {
		return fileChucker_SelectOption_UploadTo;
	}

	public static void setFileChucker_SelectOption_UploadTo(
			By fileChucker_SelectOption_UploadTo) {
		FileChuckerProperties.fileChucker_SelectOption_UploadTo = fileChucker_SelectOption_UploadTo;
	}

	public static By getFileChucker_txtNewSubFolder() {
		return fileChucker_txtNewSubFolder;
	}

	public static void setFileChucker_txtNewSubFolder(
			By fileChucker_txtNewSubFolder) {
		FileChuckerProperties.fileChucker_txtNewSubFolder = fileChucker_txtNewSubFolder;
	}

	public static By getFileChucker_txtEmailAddress() {
		return fileChucker_txtEmailAddress;
	}

	public static void setFileChucker_txtEmailAddress(
			By fileChucker_txtEmailAddress) {
		FileChuckerProperties.fileChucker_txtEmailAddress = fileChucker_txtEmailAddress;
	}

	public static By getFileChucker_txtFirstName() {
		return fileChucker_txtFirstName;
	}

	public static void setFileChucker_txtFirstName(By fileChucker_txtFirstName) {
		FileChuckerProperties.fileChucker_txtFirstName = fileChucker_txtFirstName;
	}

	public static By getFileChucker_btnUpload() {
		return fileChucker_btnUpload;
	}

	public static void setFileChucker_btnUpload(By fileChucker_btnUpload) {
		FileChuckerProperties.fileChucker_btnUpload = fileChucker_btnUpload;
	}

	public static By getFileChuckerCompleted_txtEmailAddress() {
		return fileChuckerCompleted_txtEmailAddress;
	}

	public static void setFileChuckerCompleted_txtEmailAddress(
			By fileChuckerCompleted_txtEmailAddress) {
		FileChuckerProperties.fileChuckerCompleted_txtEmailAddress = fileChuckerCompleted_txtEmailAddress;
	}

	public static By getFileChuckerCompleted_txtFirstName() {
		return fileChuckerCompleted_txtFirstName;
	}

	public static void setFileChuckerCompleted_txtFirstName(
			By fileChuckerCompleted_txtFirstName) {
		FileChuckerProperties.fileChuckerCompleted_txtFirstName = fileChuckerCompleted_txtFirstName;
	}

	public static By getFileChuckerCompleted_txtFileName() {
		return fileChuckerCompleted_txtFileName;
	}

	public static void setFileChuckerCompleted_txtFileName(
			By fileChuckerCompleted_txtFileName) {
		FileChuckerProperties.fileChuckerCompleted_txtFileName = fileChuckerCompleted_txtFileName;
	}

}
