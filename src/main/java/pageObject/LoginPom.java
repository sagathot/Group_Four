package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {

@FindBy(how=How.XPATH,using= "//input[@id='email']")
	private WebElement txt_Emailid;

@FindBy(how=How.XPATH,using= "//input[@id='pass']")
private WebElement txt_Pass;

public WebElement getClick_login() {
	return click_login;
}

@FindBy(how=How.XPATH,using= "//button[@name='login']")
private WebElement click_login;

public WebElement getTxt_Emailid() {
	return txt_Emailid;
}

public WebElement getTxt_Pass() {
	return txt_Pass;
}


			
			
		
	
	
}
