package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CandidateHomePage extends BasePage{

    @FindBy(xpath = "(//a/span)[1]") public WebElement companyLogo;

    @FindBy(xpath = "//span[@class='text__StyledText-sc-1s1i12s-0 btYVzu']") public WebElement companyMotto;

    @FindBy(xpath = "//*[@class='navbar_homeLogo__3VNoR']") public WebElement btn_home;

    @FindBy(xpath = "//span[text()='About']") public WebElement btn_about;

    @FindBy(xpath = "//span[text()='Contact Us']") public WebElement btn_contactUs;

    @FindBy(xpath = "//a[@href='/company']") public WebElement btn_forCompanies;

    @FindBy(xpath = "//a[@href='/auth?tab=SIGN_UP']") public WebElement btn_signUp;

    @FindBy(xpath = "//a[@href='/auth?tab=SIGN_IN']") public WebElement btn_login;

    @FindBy(xpath = "//span[@class='text__StyledText-sc-1s1i12s-0 iKmpUY']") public WebElement btn_signUpBelow;

    @FindBy(xpath = "(//*[@href='https://www.facebook.com/Hyrai-100747998806269'])[1]") public WebElement facebookLogo;

    @FindBy(xpath = "(//*[@href='https://twitter.com/Hyrai7'])[1]") public WebElement twitterLogo;

    @FindBy(xpath = "(//*[@href='https://www.linkedin.com/company/hyraicorp/'])[1]") public WebElement linkedInLogo;

    @FindBy(xpath = "//*[text()='Data Scientist']") public WebElement dataScientist;

    @FindBy(xpath = "(//*[@class='candidate-box_arrow__1m9jr'])[2]") public WebElement mlEngineer;

    @FindBy(xpath = "(//*[@class='candidate-box_arrow__1m9jr'])[3]") public WebElement dataEngineer;

    @FindBy(xpath = "(//*[@class='candidate-box_arrow__1m9jr'])[4]") public WebElement dataAnalyst;

    @FindBy(xpath = "(//*[@class='candidate-box_arrow__1m9jr'])[5]") public WebElement businessAnalyst;

    @FindBy(xpath = "(//*[@class='candidate-box_arrow__1m9jr'])[6]") public WebElement bigDataEngineer;

    @FindBy(xpath = "//*[@class='button__StyledButton-sc-914rhs-0 gxWQEJ']") public WebElement signUp;


    @FindBy(xpath = "//*[@class='text__Text-sc-1j50qoj-0 chaPRs']")  public List<WebElement>contactSections;

    @FindBy(xpath = "//*[@class='candidate-box_arrow__1m9jr']") public List<WebElement> titlesName;

    @FindBy(xpath = "//span[text()='Hyrai']") public WebElement wordHyrai;

    @FindBy(css = ".text__Text-sc-1j50qoj-0.CDTmU")
    public List<WebElement> navbarList;

    @FindBy(xpath = "//span[.='Learn More']") public WebElement btn_learnMore;



    @FindBy(xpath = "//*[@class='navbar_navbar__3t8Ba']//a")
    public List<WebElement> navbarList2;







    }
