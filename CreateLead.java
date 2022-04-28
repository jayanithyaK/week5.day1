package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {
	@Test
	public void createLead() throws InterruptedException {

			
	Thread.sleep(2000);
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jayanithya");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
driver.findElement(By.id("createLeadForm_description")).sendKeys("welcome to IT");
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("nithya@gmail.com");

WebElement eleDropdown=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
Select dd=new Select(eleDropdown);
dd.selectByVisibleText("New York");

driver.findElement(By.name("submitButton")).click();

String title=driver.getTitle();
System.out.println(title);
	}

}
