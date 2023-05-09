package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompanySignUpPage extends BasePage{
   @FindBy(xpath = "//span[@class='text__Text-sc-1j50qoj-0 bpdgOj']")       public List<WebElement> companyLabels;
   @FindBy(xpath = "//input[@class='input__Input-sc-98umss-0 bKkllf']")     public List<WebElement> companyInputBoxes;
   @FindBy(xpath = "(//span[@class='text__Text-sc-1j50qoj-0 qBTWA'])[3]") public WebElement workEmail;
   @FindBy(xpath = "//span[@color='#E03724']")                              public List<WebElement> alertMessages;

   @FindBy(xpath = "//span[@class='text__Text-sc-1j50qoj-0 qBTWA']") public WebElement message;


 @FindBy(xpath = "//*[@name='companyName']") public WebElement boxCompanyName;
    @FindBy(xpath = "//*[@name='companyWebsite']") public WebElement boxCompanyWebsite;
    @FindBy(xpath = "//*[@placeholder='Work Email']") public WebElement boxWorkEmail;

    @FindBy(xpath = "(//*[@class='text__Text-sc-1j50qoj-0 bpdgOj'])[4]") public WebElement boxTextPasseword;
    @FindBy(xpath = "//*[@name='first']") public WebElement boxPassword;
    @FindBy(xpath = "//*[@class='text__Text-sc-1j50qoj-0 qBTWA']") public WebElement msgWarningPassword;

    @FindBy(xpath = "//*[text()='Confirm Password']") public WebElement boxTextConfirmPassword;
    @FindBy(xpath = "//*[@name='second']") public WebElement boxConfirmPassword;

    @FindBy(xpath = "//button[@type='submit']") public WebElement btnSignUpForRegister;
    @FindBy(xpath = "//div[@class='section1_socialIcons__3sY9u']/a")
    public List<WebElement> socialMediaIcons;
    @FindBy(xpath = "(//a[@href='https://www.facebook.com/Hyrai-100747998806269'])[1]")
    public WebElement facebookIcon;
    @FindBy(xpath = "(//a[@href='https://twitter.com/Hyrai7'])[1]")
    public WebElement twitterIcon;
    @FindBy(xpath = "(//a[@href='https://www.linkedin.com/company/hyraicorp/'])[1]")
    public WebElement linkedinIcon;
    public List<WebElement> socialMediaIcons2 = new ArrayList<>(Arrays.asList(facebookIcon, twitterIcon, linkedinIcon));

    @FindBy(xpath = "(//span[@class='text__Text-sc-1j50qoj-0 CDTmU'])[6]") public WebElement btnSignUp;
    @FindBy(xpath = "//span[@class='text__StyledText-sc-1s1i12s-0 ciCPuU']") public WebElement textCompany;

    @FindBy(xpath = "//button[@class='button__StyledButton-sc-914rhs-0 gxWQEJ auth-form-card_active__3Rppm']") public WebElement activeButton;
    @FindBy(xpath = "//button[@class='button__StyledButton-sc-914rhs-0 gxWQEJ']") public WebElement btnSignIn;

   // @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section/div[2]/div[2]/div/div[2]/div/svg[1]") public WebElement btnGmail;
   @FindBy(xpath = "(//*[@class='social-connect_svg__fhSeI'])[1]") public WebElement btnGmail;

   @FindBy(xpath = "(//*[@class='social-connect_svg__fhSeI'])[2]") public WebElement btnGitHub;
   @FindBy(xpath = "(//*[@class='social-connect_svg__fhSeI'])[3]") public WebElement btnLinkendIn;
   @FindBy(xpath = "//*[@class='sign-up_policy__2hyLn']") public WebElement textPolicy;
   @FindBy(xpath = "//button[@type='button']") public WebElement btnSignUpForCandidate;
   @FindBy(xpath = "//*[@class='text__StyledText-sc-1s1i12s-0 ciCPuU']") public WebElement textCandidate;
   @FindBy(xpath = "//button[@type='submit']") public WebElement btnSignUpCompany;
   @FindBy(xpath = "(//*[@class='text__Text-sc-1j50qoj-0 qBTWA'])[1]") public WebElement textThisFieldIsRequired;
}
