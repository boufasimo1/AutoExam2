package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import pages.HomePage;
import util.BrowserFactory;

public class ExamTest {

	WebDriver driver ;
	@Test
	public void addCategoryTest () {
		
		driver = BrowserFactory.init();
		
		HomePage page = PageFactory.initElements(driver, HomePage.class);
	
	page.addCategory("boufa2112");
	page.clickOnAddCategoryButton();
	page.fileDataSize();
}
}


