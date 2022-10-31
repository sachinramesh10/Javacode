package seleniumTasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Sachin");
		driver.findElement(By.name("lastname")).sendKeys("Ramesh");
		driver.findElement(By.name("reg_email__")).sendKeys("7402023722");
		driver.findElement(By.id("password_step_input")).sendKeys("Hi@123");
		WebElement selectDay= driver.findElement(By.id("day"));
		Select obj1 = new Select(selectDay);
		obj1.selectByValue("28");
		WebElement selectMonth= driver.findElement(By.id("month"));
		Select obj2Select = new Select(selectMonth);
		obj2Select.selectByVisibleText("Jun");
		WebElement selectYear= driver.findElement(By.id("year"));
		Select obj3Select = new Select(selectYear);
		obj3Select.selectByIndex(28);
		driver.findElement(By.className("_8esa")).click();
		
	}

}
