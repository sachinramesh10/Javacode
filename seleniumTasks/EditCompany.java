package seleniumTasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditCompany {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.getTitle();
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("Democsr2");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("TCS");
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Prince");
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Jr");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).clear();
		String companyname = "DELL";		
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys(companyname);
		System.out.println(companyname);
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String EditComp = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		System.out.println(EditComp);
		if(companyname.contains("DELL")) {
			System.out.println("New company is updated");	
		}
		else {
			System.out.println("New company is not updated");
		}

	}
}
