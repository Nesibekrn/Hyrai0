package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForCompanyRequestDemoPage extends BasePage {


    @FindBy(xpath = "//a[@href='/company']") public WebElement forCompaniesButton;

    @FindBy(xpath = "(//span[@class='text__Text-sc-1j50qoj-0 eluQeq'])[1]") public WebElement requestADemo1Link;

    @FindBy(xpath = "(//button[@class='button__Button-sc-1m6iuh2-0 iEmDLV']") public WebElement requestaDemo2Link;

    @FindBy(xpath = "//span[@class='text__Text-sc-1j50qoj-0 jlCBqz']") public WebElement sourceQualifiedCandidates;

    @FindBy(xpath = "(//button[@type='submit'])[1]") public WebElement requestDemoButton;

    @FindBy(xpath = "(//span[@class='text__Text-sc-1j50qoj-0 ijNIOS'][normalize-space()='Subscribe now'])[1]")
    public WebElement subcribeNowLink;

    @FindBy(xpath = "/html/body/div[2]/div/main/div[7]/div[1]/div[3]/div/from/div/input[1]") public static WebElement companyNameBox;

    @FindBy(xpath = "(//input[@placeholder='Work Email'])") public WebElement workEmailLink;

    @FindBy(xpath = "(//span[normalize-space()='Continue'])[1]") public WebElement continueLink;

    @FindBy(xpath = "(//input[@type='checkbox'])[1]") public WebElement termsConditionsCheckbox;

    @FindBy(xpath = "(//button[@class='ant-btn'])[1]") public WebElement termsConditions_Submit;

    @FindBy(xpath = "(//input[@id='email'])[1]") public WebElement PayPalEmailLink;

    @FindBy(xpath = "(//button[normalize-space()='Next'])[1]") public WebElement PayPalEmail_NextButton;

    @FindBy(xpath = "//b[@class='ng-binding']") public WebElement PayPalPage;

    //****************PayPal Information*********************

    @FindBy(xpath = "//select[@id='countrySelector']") public WebElement payPalCountryBox;

    @FindBy(xpath = "//option[normalize-space()='Card type']") public WebElement cardTypeBox;

    @FindBy(xpath = "//option[@value='VISA']") public WebElement VisaOption;

    @FindBy(xpath = "//div[@class='inputField confidential cardNumber creditCardField ng-scope floatingLabel']")
    public WebElement CardNumberBox;

    @FindBy(xpath = "//div[@class='inputField floatingLabel']") public WebElement ExpiryDateBox;

    @FindBy(xpath = "//input[@id='cvv']") public WebElement SecurityCodeBox;

    @FindBy(xpath = "//input[@id='firstName']") public WebElement payPalFirstNameBox;

    @FindBy(xpath = "//input[@id='lastName']") public WebElement payPalLastNameBox;

    @FindBy(xpath = "//input[@id='billingLine1']") public WebElement AddressLine1Box;

    @FindBy(xpath = "//input[@id='billingLine2']") public WebElement AddressLine2Box;

    @FindBy(xpath = "//select[@id='billingState']") public WebElement AddressTownCityBox;

    @FindBy(xpath = "//input[@id='billingPostalCode']") public WebElement PayPalPostcodeBox;

    @FindBy(xpath = "//select[@id='phoneType']") public WebElement phoneTypeBox;

    @FindBy(xpath = "//option[@value='Mobile']") public WebElement phoneTypeMobileBox;

    @FindBy(xpath = "//div[@id='phoneNumberContainer']") public WebElement phoneNumberContainer;

    @FindBy(xpath = "//input[@id='email']") public WebElement TextEmailBox;

    @FindBy(xpath = "//label[@for='guestSignup1']") public WebElement PayPalAccountYesBox;

    @FindBy(xpath = "//input[@id='password']") public WebElement PayPalAccountPasswordBox;

    @FindBy(xpath = "//div[@class='dualInputElements clearfix']") public WebElement PayPalAccountDateBox;

    @FindBy(xpath = "//select[@id='nationality']") public WebElement PayPalAccountNationalityBox;

    @FindBy(xpath = "//option[@value='string:AL']") public WebElement PayPalAccountAlbaniaBox;

    @FindBy(xpath = "(//span[@class='bgImg'])[1]") public WebElement PayPalAccountBox1;

    @FindBy(xpath = "//div[@class='row-fluid checkbox legal marketingOptin ng-scope']")
    public WebElement PayPalAccountBox2;

    @FindBy(xpath = "//label[@for='guestSignup2']") public WebElement PayPalAccountNoBox;

    @FindBy(xpath = "(//button[normalize-space()='Create Account & Subscribe'])[1]")
    public WebElement PayPalSubcribeBox;



}
