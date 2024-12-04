package org.login;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sam.BaseClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class loginpage extends BaseClass{
	@BeforeTest
	public void launch() {
		ExtentSparkReporter extent;
		ExtentSparkReporter test;
		launchBrowser(); 
		windowMaximize();
		launchUrl("http://103.102.234.198:5005/admin/login");
		System.out.println("open the whistle admin wensite in chrome browser");
	}
	@Test(priority = -1)
	public void login() throws InterruptedException, IOException {
		Thread.sleep(5000);
		WebElement email = driver.findElement(By.xpath("//input[@placeholder ='Username']"));
		email.sendKeys("virtualtech1210@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@type ='password']"));
		pass.sendKeys("123");
		WebElement butt = driver.findElement(By.xpath("//button[@type ='submit']"));
		butt.click(); 
		Thread.sleep(3000);
		WebElement ok = driver.findElement(By.xpath("//button[text() ='Done']"));
		ok.click();
		Thread.sleep(3000);
		WebElement nav = driver.findElement(By.xpath("//button[@class ='nav-btn-angle-icon']"));
		nav.click();
		System.out.println("login successfull");

}
	@Test(priority = 2)
	public void master() throws InterruptedException {
		Thread.sleep(2000);
	      WebElement master = driver.findElement(By.xpath("//span[text() ='Master']"));
	      master.click();
	      Thread.sleep(2000);
	      WebElement vegatable = driver.findElement(By.xpath("//div[text() ='Vegetables']"));
	      vegatable.click();
	      Thread.sleep(2000);
	      WebElement add = driver.findElement(By.xpath("//button[text() ='+ Add']"));
	      add.click();
	      Thread.sleep(2000);
	      WebElement drop = driver.findElement(By.xpath("//div[@class =' css-1xc3v61-indicatorContainer']"));
	      drop.click();
	      Thread.sleep(2000);
	      WebElement dress = driver.findElement(By.xpath("//div[text() ='Dress']"));
	      dress.click();
	      Thread.sleep(2000);
	      WebElement name = driver.findElement(By.xpath("//input[@placeholder ='Enter Subcategory Name']"));
	      name.sendKeys("pants");
	      Thread.sleep(2000);
	      WebElement addsubbutton = driver.findElement(By.xpath("//button[text() ='Add Subcategory']"));
	      addsubbutton.click();
	      Thread.sleep(2000);
	      WebElement back = driver.findElement(By.xpath("//ins[text() ='Back']"));
	      back.click();
	      WebElement nav = driver.findElement(By.xpath("//button[@class ='nav-btn-angle-icon']"));
			nav.click();
			System.out.println("master vegetables add category is successfull");


	}
	@Test(priority = 3)
	public void authorizedvendor() throws InterruptedException {
		Thread.sleep(2000);
	      WebElement vendor = driver.findElement(By.xpath("//span[text() ='Vendors']"));
	      vendor.click();
	      Thread.sleep(2000);
	      WebElement avendor = driver.findElement(By.xpath("//span[text() ='Authorized Vendor']"));
	      avendor.click();
	      Thread.sleep(2000);
	      WebElement vegatable = driver.findElement(By.xpath("//div[text() ='Vegetables']"));
	      vegatable.click();
	      Thread.sleep(2000);
	      WebElement view = driver.findElement(By.xpath("//button[text() ='View']"));
	      view.click();
	      Thread.sleep(2000);
	      WebElement back = driver.findElement(By.xpath("//*[local-name()='svg' and @class='back-option']"));
	      back.click();
	      WebElement nav = driver.findElement(By.xpath("//button[@class ='nav-btn-angle-icon']"));
			nav.click();
			System.out.println("user can be viewed in authorized vendor vegatables page");
		

	}
	@Test(priority = 4)
	public void unauthorizedvendor() throws InterruptedException {
		Thread.sleep(2000);
	      WebElement vendor = driver.findElement(By.xpath("//span[text() ='Vendors']"));
	      vendor.click();
	      Thread.sleep(2000);
	      WebElement avendor = driver.findElement(By.xpath("//span[text() ='UnAuthorized Vendor']"));
	      avendor.click();
	      Thread.sleep(2000);
	      WebElement vegatable = driver.findElement(By.xpath("//div[text() ='Vegetables']"));
	      vegatable.click();
	      Thread.sleep(2000);
	      WebElement view = driver.findElement(By.xpath("//button[text() ='View']"));
	      view.click();
	      Thread.sleep(2000);
	      WebElement back = driver.findElement(By.xpath("//*[local-name()='svg' and @class='back-option']"));
	      back.click();
	      WebElement nav = driver.findElement(By.xpath("//button[@class ='nav-btn-angle-icon']"));
			nav.click();
			System.out.println("user can be viewed in unauthorized vendor vegatables page");
		

	}
	@Test(priority = 5)
	public void users() throws InterruptedException {
		Thread.sleep(2000);
	      WebElement user = driver.findElement(By.xpath("//span[text() ='Users']"));
	      user.click();
	      Thread.sleep(2000);
	      WebElement item1 = driver.findElement(By.xpath("//span[text() ='Item 1']"));
	      item1.click();
	      System.out.println("user can be viewed in item page is not open");
		
	}
	@Test(priority = 6)
	public void item2() throws InterruptedException {
		Thread.sleep(2000);
	      
	      WebElement item2 = driver.findElement(By.xpath("//span[text() ='Item 2']"));
	      item2.click();
	      System.out.println("user can be viewed in item page is not open");

		
	}
	@Test(priority = 7)
	public void logout() throws InterruptedException {
		Thread.sleep(2000);
	      WebElement user = driver.findElement(By.xpath("//span[text() ='Logout']"));
	      user.click();
	      System.out.println("user can be navigate in login page successfully");

		
	}
	@AfterTest
	public void close() {
		closeEntireBrowser();
		System.out.println("close the browser");
		
	}
}

