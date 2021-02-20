import org.openqa.selenium.By;

public class Chapter1homepage {
	public By Title = By.xpath("//div[@class='mainheading']");
	public By Text= By.xpath("//div[@class='mainbody']/descendant::p[1]");
	public By Radiobutton = By.xpath("//input[@type='radio'or @id='radiobutton' or text()=' radio button']");
	public By dropdown = By.xpath("//div[@class='mainbody']//descendant::select[@id='selecttype']");/*using descendant( which fetches child and grandchild of the currentnode*/
	public By dropdowncheckbox =By.xpath("//input[@type='checkbox']");
	public By homepagelink = By.linkText("Home Page"); /*linktext*/
	public By Asserttext =By.xpath("//div[@class='mainbody']//following-sibling::div[text()='Assert that this text is on the page']"); /* using following-sibling (which fetches the siblings of current node)*/
	public By verifybutton= By.id("verifybutton");
	public By textbox= By.className("belowcenter");
	public By textmessage1= By.xpath("//div[@class='multiplewindow']");
	public By textmessage2 = By.xpath("//div[@class='multiplewindow2']");
	public By Button = By.xpath("//input[@value='load text to the page']");
	public By inputbox=By.xpath("//input[@value='load text to the page']//parent::div");
	
	
	

}
