package com.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static void main(String[]args) {
WebDriver  driver=new ChromeDriver();
driver.manage().window().maximize();
Properties properties=new Properties();
properties.getProperty("weburl");

driver.get(properties.getProperty("weburl"));

		


}
}