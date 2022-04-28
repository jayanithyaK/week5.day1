package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class EditLead extends BaseClass {
	@ Test
	public void Edit() {

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
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.id("updateLeadForm_description")).clear();
	driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("This is important document");
	driver.findElement(By.name("submitButton")).click();

	String title=driver.getTitle();
	System.out.println(title);
		

}

}
