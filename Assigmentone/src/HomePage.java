import org.openqa.selenium.By;

public class HomePage {
	
	
	public By Title = By.xpath("//div[text()='Selenium: Beginners Guide']");

	public By Body = By.xpath("//div[@class='mainbody']");/*relative xpath*/
	public By Chapter1 = By.xpath("//a[text()='Chapter1']");/*relative xpath*/
	public By Chapter2 = By.xpath("//a[text()='Chapter2']");/*relative xpath*/
	public By Chapter3 = By.xpath("//html/body/div/ul/li[3]/a[@href='/chapter3' or text()='Chapter3']");	/*Absolute  xpath*/
	public By Chapter4 = By.xpath("//a[@href='/chapter4']");/*relative xpath*/
	public By Chapter8 = By.xpath("//li[5]/a[text()='Chapter8']");
		
	
}
