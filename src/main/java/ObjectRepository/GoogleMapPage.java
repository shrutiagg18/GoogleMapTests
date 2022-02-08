package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ObjectRepository.CommonMethods;

public class GoogleMapPage 
{
	public WebDriver driver;
	public GoogleMapPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Xpaths
	By consent = By.xpath("//span[text()='I agree']");
	By search= By.xpath("//input[@class='tactile-searchbox-input']");
	By searchbutton = By.xpath("//button[@id='searchbox-searchbutton']");
	By directionbutton = By.xpath("(//span[@class='DVeyrd gm2-hairline-border section-action-chip-button'])[1]");
	By DestinationCity = By.xpath("(//input[@class='tactile-searchbox-input'])[5]");
	
	
	/**
	 * Description: Click on Consent
	 */
	public void consent() throws Throwable 
	{
		CommonMethods commonmethod = new CommonMethods(driver);
		commonmethod.click(consent);
	}
	
	/**
	 * Description: Enter text into search bar
	 */
	public void searchbar(String SearchString) throws Throwable
	{	
		driver.findElement(search).sendKeys(SearchString);
		
	}
	
	/**
	 * Description: Clicks on Search button
	 */
	public void clicksearchbutton() throws Throwable
	{
		CommonMethods commonmethod = new CommonMethods(driver);
		commonmethod.click(searchbutton);
	}
	
	/**
	 * Description: Clicks on Direction 
	 */
	public void clickdirectionbutton() throws Throwable
	{
		CommonMethods commonmethod = new CommonMethods(driver);
		commonmethod.click(directionbutton);
	}
	
	/**
	 * Description: Verify Searched city is present in Destination
	 */
	public void verifydestinationcity(String SearchedCity)
	{
		CommonMethods commonmethod = new CommonMethods(driver);
		commonmethod.AssertIfPresentinDestination(DestinationCity,"aria-label", SearchedCity);
	}
	
}
