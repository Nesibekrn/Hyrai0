package pages;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CompanySignInPage extends BasePage{
    @FindBy(xpath = "//input[@name='email']")
    public WebElement txt_email;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement txt_password;

    @FindBy(xpath = "//span[.='Forgot Password']")
    public WebElement link_forget_password;

    //@FindBy(xpath = "//button[@type='submit']")
    //@FindBy(css = ".button__Button-sc-1m6iuh2-0.jhxrcL.sign-in_button__x3hrZ")
   @FindBy(xpath="(//span[@class='text__Text-sc-1j50qoj-0 eikqEd'])[3]")
    //@FindBy(xpath ="(//*[text()=‘Sign In’])[3]" )
    public WebElement btn_signin;

    @FindBy(xpath = "//span[.='Please verify your Email']")
    public WebElement please_verify_your_email;

    @FindBy(xpath = "//input[@class='input__Input-sc-98umss-0 djJXEC']")
    public WebElement verify_email_box;

    @FindBy(xpath= "//button[.='Verify Email']")
    public WebElement btn_verify_email;

    @FindBy(xpath="//span[.='Email verification was successful, please check your e-mail address.']")
    public WebElement email_verification_was_successful;
    @FindBy(xpath="//*[@class='auth-form-card_tab__3PfAP']/button[text()='Sign Up']")
    public WebElement tab_signUp;
    @FindBy(xpath="//*[@class='auth-form-card_tab__3PfAP']/button[text()='Sign In']")
    public WebElement tab_signIn;
    @FindBy(xpath = "//*[@class='social-connect_svg__fhSeI']")
    public List<WebElement> socialMediaIcons;


    @FindBy(xpath="//a[@href='/company/auth?tab=SIGN_IN']")
    public WebElement company_login;

    @FindBy(xpath="//button[@class='button__Button-sc-1m6iuh2-0 gqNKBg navbar_for_companies__33Vhr']")
    public WebElement forCompany_button;

    @FindBy(xpath="//button[@class='text__Text-sc-1j50qoj-0 rrMtr']")
    public WebElement Company_buttonFirefox;

@FindBy(xpath="//*[text()='Email or password is not valid!']")
    public WebElement txt_not_valid;

@FindBy(xpath="//*[text()='Wrong credentials! Are you trying to login as a company?']")
public WebElement wrongCredential;
//@FindBy(xpath="//span[@class='text__Text-sc-1j50qoj-0 qBTWA']")



    @FindBy(xpath = "(//span[@class='text__Text-sc-1j50qoj-0 rrMtr'])[1]")
    public WebElement btn_forCompanies;
    @FindBy(xpath = "(//span[@class='text__Text-sc-1j50qoj-0 rrMtr'])[3]")
    public WebElement btn_login;
    @FindBy(xpath = "//input[@placeholder='Email']")
    public WebElement txt_email2;
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement txt_password2;
    @FindBy(xpath = "(//*[text()='Sign In'])[3]")
    public WebElement btn_signIn;
}

