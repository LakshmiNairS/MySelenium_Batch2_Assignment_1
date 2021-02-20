import org.openqa.selenium.By;

public class Chapter2homepage {

	public By title = By.xpath("//div[@class='mainheading']");
	public By indextitle=By.xpath("//a[text()='Index']");
	public By text= By.xpath("//div[text()='This item div has the id of find']");
	public By text1 =By.xpath("//div[@id='find']//br[1]");
	public By text2= By.xpath("//div[@id='find']//br[2]");
	public By button = By.name("but2");
	public By random = By.xpath("//input[@id='random']");
	public By elementidtext = By.xpath("//div[text()='This element has a ID that changes every time the page is loaded']");
	public By verifybutton = By.xpath("//input[@name='verifybutton']");
	public By chocolate =By.xpath("//input[@value='chocolate']");
	public By buttonID= By.xpath("//input[@value='Button with ID']");
	public By siblingButton = By.xpath("//input[@value='Button with ID']//following-sibling::br");
	
}
	
	
	
