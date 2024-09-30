package com.maven.test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class guru99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
 
		
		driver.findElement(By.name("cusid")).sendKeys("12345");
		
		
		
		
		
		
		driver.findElement(By.name("submit")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();	
		Alert alert1 = driver.switchTo().alert();
	
		alert.accept();	
		
		
		
		
	}

	}

