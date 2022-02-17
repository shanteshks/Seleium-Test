import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Website {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Desktop\\Eclipse\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://staging.eduvanz.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[contains(text(),'SIGN IN')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'APPLICANT')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Login via Email')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("shantesh.nadkarni12@eduvanz.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		driver.findElement(By.xpath("//button[contains(text(),'LOGIN')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'START NEW APPLICATION')]")).click();
		Thread.sleep(1000);
		//Basic Details
		driver.findElement(By.xpath("//label[contains(text(),'Working professional')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Myself')]")).click();
		Select s= new Select(driver.findElement(By.id("loan_type")));
		s.selectByValue("3");
		driver.findElement(By.xpath("//label[contains(text(),'Salaried')]")).click();
		driver.findElement(By.cssSelector("#basicDetailsBtn")).click();
		//Personal details
		Thread.sleep(1000);
		driver.findElement(By.id("panScanFileUpload")).sendKeys("C:\\Users\\Shantesh\\Downloads\\20201105181356_2_1780_Ocr_Pan.jpg");
		//driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver,120);
		Thread.sleep(60000);
		//WebElement pincode
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='kyc_financialCurrentAddressPincode']")).getText().equalsIgnoreCase("400615"));
		//pincode.isSelected("True");
		driver.findElement(By.xpath("//select[@id='financialMaritalStatus']")).sendKeys("Married");
		driver.findElement(By.xpath("//input[@id='both_address_type']")).click();
		driver.findElement(By.xpath("//button[@id='personalDetailsBtn']")).click();
		//Course details
		
		driver.findElement(By.xpath("//input[@id='showInput']")).sendKeys("Imarticus learning");
		driver.findElement(By.xpath("//input[@id='showInputinstituteCity']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//input[@id='showInputCourseName']")).sendKeys("CIBOP");
		driver.findElement(By.xpath("//input[@id='loan_amount']")).sendKeys("80000");
		driver.findElement(By.xpath("//button[@id='courseDetailsBtn']")).click();
		
		//Loan Approval
		
		driver.findElement(By.xpath("//tbody/tr[@id='tr_0']/td[3]")).click();
		driver.findElement(By.xpath("//button[@id='loanApprovalSaveBtn']")).click();
		
		//Section 2 Address details
		
		driver.findElement(By.xpath("//body/div[@id='timeline_section']/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]")).click();
		Select Own= new Select(driver.findElement(By.id("rentedBy")));
		Own.selectByValue("0");
		Select Duration= new Select(driver.findElement(By.id("durationOfStay")));
		Duration.selectByValue("2");
		driver.findElement(By.xpath("//button[@id='recedentialDetailsBtn']")).click();
		
		//Work Details
		
		driver.findElement(By.xpath("//input[@id='companyName']")).sendKeys("Eduvanz");
		Select employer= new Select(driver.findElement(By.id("employerType")));
		employer.selectByValue("0");
		driver.findElement(By.xpath("//input[@id='annualIncome']")).sendKeys("560000");
		Select dur= new Select(driver.findElement(By.id("durationOfWork")));
		dur.selectByValue("0");
		driver.findElement(By.xpath("//input[@id='employerEmail']")).sendKeys("test@trest.com");
		driver.findElement(By.xpath("//input[@id='workAddress1']")).sendKeys("tsets");
		driver.findElement(By.xpath("//input[@id='workPincode']")).sendKeys("400059");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='workDetailsBtn']")).click();
		//banking details
		
		Select bank= new Select(driver.findElement(By.id("bankName")));
		bank.selectByValue("67");
		driver.findElement(By.xpath("//input[@id='accountNumber']")).sendKeys("320102010444923");
		driver.findElement(By.xpath("//input[@id='ifscCode']")).sendKeys("UBIN0532011");
		Select TOA= new Select(driver.findElement(By.id("accountType")));
		TOA.selectByValue("1");
		// Section 3 Document Upload
		driver.findElement(By.id("photoKYCdoc")).sendKeys("C:\\Users\\Shantesh\\Downloads\\Shivshankar_Pandarge.jpg");
		driver.findElement(By.id("addressProofError")).sendKeys("C:\\Users\\Shantesh\\Downloads\\Aadhar+Card_1780_1604580855.jpg");
		Select Bankdoc= new Select(driver.findElement(By.id("other-doc1")));
		Bankdoc.selectByValue("38");
		driver.findElement(By.id("other-dynamic-pending-document1")).sendKeys("C:\\Users\\Shantesh\\Downloads\\DL back.jpg");
		
	}

}
