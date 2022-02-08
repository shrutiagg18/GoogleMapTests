package stepDefinitions;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import ObjectRepository.CommonMethods;
import ObjectRepository.GoogleMapPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import resources.base;

@RunWith(Cucumber.class)
public class StepDefinitons extends base {
	public WebDriver driver;

	@Given("^Initialise Driver$")
	public void Initialise_Driver() throws Throwable {
		System.out.println("*******TEST EXECUTION STARTED*******");
		Thread.sleep(3000);
		driver = initializeDriver();
		driver.manage().window().maximize();
	}

	@When("^Navigate to WebSite$")
	public void navigate_to_BBC_Site() throws Throwable
	{
		GoogleMapPage GoogleMapPage = new GoogleMapPage(driver);
		driver.get("https://www.google.com/maps");
		GoogleMapPage.consent();
		CommonMethods commonmethods = new CommonMethods(driver);
		commonmethods.AssertCurrentURL("https://www.google.com/maps");
	}

	@And("^Enter \"([^\"]*)\" in the search box$")
	public void enter_text_in_the_search_box(String CitytoSearch) throws Throwable
	{
		GoogleMapPage GoogleMapPage = new GoogleMapPage(driver);
		GoogleMapPage.searchbar(CitytoSearch);
	}
	
	@And("^Click on Search$")
	public void click_on_search() throws Throwable
	{
		GoogleMapPage GoogleMapPage = new GoogleMapPage(driver);
		GoogleMapPage.clicksearchbutton();
	}
	
	@Then("^Verify left panel has \"([^\"]*)\" as a headline text$")
	public void verify_left_panel_has_searched_city_as_headline_text(String SearchedCity)
	{
		CommonMethods commonmethods = new CommonMethods(driver);
		commonmethods.AssertIfTextPresentOnPage(SearchedCity);
	}

	@When("^Click Directions Icon$")
	public void click_directions_icon() throws Throwable
	{
		GoogleMapPage GoogleMapPage = new GoogleMapPage(driver);
		GoogleMapPage.clickdirectionbutton();
	}
	
	@Then("^Verify Destination field is \"([^\"]*)\"$")
	public void verify_destination_field_is_searched_city(String SearchedCity)
	{
		GoogleMapPage GoogleMapPage = new GoogleMapPage(driver);
		GoogleMapPage.verifydestinationcity(SearchedCity);
	}
	
	@And("^Close the browser$")
	public void close_the_browser() throws InterruptedException
	{
		Thread.sleep(7000L);
		System.out.println("*******CLOSING THE BROWSER*******");
		driver.close();
	}

}
