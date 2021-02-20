import org.openqa.selenium.By;

public class Chapter4homepage {
	public By title = By.xpath("//div[@class='mainheading']");
	public By Indexlink= By.xpath("//div[@id='name']//parent::div"); 
	public By indextestbox= By.xpath("//input[@id='dateInput']");
	public By dropdown = By.id("selecttype");
	public By Loadbutton= By.id("//input[@id='selectLoad']");
	public By Loadbuttondropdown =By.xpath("//input[@id='selectLoad']/following-sibling::select[@id='ajaxLoad']");
	public By highestbid =By.xpath("//div[@class='belowcenter']//descendant::p[1]");
	public By highestbidtext =By.xpath("//div[@class='belowcenter']//descendant::p/input[@type='text']");
	public By MouseOverText= By.xpath("//input[@id='selectLoad']/parent::p//following-sibling::p/input[@id='blurry']");
	public By MouseOverthis =By.xpath("//div[@id='datediv']//following-sibling::div[@id='hoverOver']");
	
	
	

}
