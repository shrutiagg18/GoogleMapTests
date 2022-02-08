package ObjectRepository;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CommonMethods {

	WebDriver driver;
	
	public CommonMethods(WebDriver driver)
	{
		this.driver=driver;
	}

	
	/**
	 * Description: Is Element Loaded Explicit Wait
	 */
	public void isElementLoaded(By elementToBeLoaded) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(elementToBeLoaded));
	}
	
	/**
	 * Description: Click on path provided with Explicit Wait
	 */
	public void click(By path) throws Throwable
	{
		Thread.sleep(200);
		isElementLoaded(path);
		driver.findElement(path).click();
	}

		
	
	
	/**
	 * Description: Validate searched city is present in destination by capturing passed attribute
	 */
	public void AssertIfPresentinDestination(By xpath,String NameOfAttribute,String TextToCheck)
	{
		try
		{
			String ActualText =driver.findElement(xpath).getAttribute(NameOfAttribute).trim().substring(12);	
			Assert.assertEquals(ActualText,TextToCheck);
			//log.info(LinkToCheck + " Link is present on the screen ****PASSED****");
			System.out.println(TextToCheck +" is present");
		}
		catch(NoSuchElementException | AssertionError e)
		{
			//log.error(LinkToCheck + " is not present *******FAILED*******");
			System.out.println(TextToCheck +" is not present");
			Reporter.getCurrentTestResult().setStatus(ITestResult.FAILURE);
		}
		
	}
	
	/**
	 * Description: Capture current URL and verify if correct
	 */
	public void AssertCurrentURL(String LinkToCheck)
	{
		try
		{
			String linkActual=driver.getCurrentUrl();	
			Assert.assertEquals(linkActual,LinkToCheck);
			//log.info(LinkToCheck + " Link is present on the screen ****PASSED****");
			System.out.println(LinkToCheck +" Link is present");
		}
		catch(NoSuchElementException | AssertionError e)
		{
			//log.error(LinkToCheck + " is not present *******FAILED*******");
			System.out.println(LinkToCheck +" Link is not present");
			Reporter.getCurrentTestResult().setStatus(ITestResult.FAILURE);
		}
	}
	
	/**
	 * Description: Verify if Text Present on Page by using assert by Span Tag
	 */
	public void AssertIfTextPresentOnPage(String TextToCheck)
	{
		try
		{
			Boolean TrueOrFalse=driver.findElement(By.xpath("(//span[text()='"+TextToCheck+"'])")).isDisplayed();	
			Assert.assertTrue(TrueOrFalse);
			//log.info(LinkToCheck + " Link is present on the screen ****PASSED****");
			System.out.println(TextToCheck +" is present on the page");
		}
		catch(NoSuchElementException | AssertionError e)
		{
			//log.error(LinkToCheck + " is not present *******FAILED*******");
			System.out.println(TextToCheck +" is not present on the page");
			Reporter.getCurrentTestResult().setStatus(ITestResult.FAILURE);
		}
	}
	 
}