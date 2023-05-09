package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CandidateSignInPage extends BasePage{

    @FindBy(xpath = "//input[@name='email']") public WebElement txt_email;

    @FindBy(xpath = "//input[@name='password']") public WebElement txt_password;

    @FindBy(xpath = "//button[@type='submit']") public WebElement btn_signIn;

    @FindBy(xpath = "//span[text()='Invalid e-mail']") public WebElement msg_invalidEmail;

    @FindBy(xpath = "//div[text()='Wrong Credentials!']") public WebElement msg_wrongCredentials;

}
