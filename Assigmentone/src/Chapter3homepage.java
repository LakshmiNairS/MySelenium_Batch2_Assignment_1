import org.openqa.selenium.By;

public class Chapter3homepage {
	public By title = By.xpath("//div[@class='mainheading']");
	public By Indexlink= By.xpath("//div[@id='name']//parent::div");
	public By vigrotext= By.xpath("//div[@id='name']//following-sibling::div[@id='divinthecenter']");
	public By fooltext=By.xpath("//div[@id='name']//following-sibling::div[@id='leftdiv']");
	public By Datetext=By.xpath("//div[@id='name']//following-sibling::div[@id='centerdiv']");
	
	

}
