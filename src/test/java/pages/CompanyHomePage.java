package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://hyrai.com/company

public class CompanyHomePage extends BasePage {

    @FindBy(xpath = "//a[@href='/company/auth?tab=SIGN_IN']")
    public WebElement btn_login;

    @FindBy( xpath = "//input[@name='name']")
    public WebElement input_name;

    @FindBy( xpath = "//input[@name='companyName']")
    public WebElement input_companyName;

    @FindBy( xpath = "//input[@name='title']")
    public WebElement input_title;

    @FindBy( xpath = "//input[@name='phone']")
    public WebElement input_phoneNumber;

    @FindBy( xpath = "//input[@name='email']")
    public WebElement input_email;

    @FindBy( xpath = "//span[.='Request a Demo']")
    public WebElement btn_requestADemo;

    @FindBy( xpath = "//span[contains(.,'This field is required')]")
    public List<WebElement> txt_thisFieldIsRequiredMessages;

    @FindBy( xpath = "//h1[contains(.,'Your request has been submit')]")
    public WebElement txt_requestSubmitMessage;

    @FindBy( xpath = "//span[contains(.,'Must be at least 2 characters')]")
    public WebElement txt_mustBeAtLeastMessage1;

    @FindBy( xpath = "//span[contains(.,'Must be at least 10 characters')]")
    public WebElement txt_mustBeAtLeastMessage2;

    @FindBy( xpath = "//span[contains(.,'Invalid e-mail')]")
    public WebElement txt_invalidEmail;

    @FindBy(xpath = "//span[@class='text__Text-sc-1j50qoj-0 jlCBqz']")
    public WebElement section_txt;

    //@FindBy(xpath = "//div[@class='section2_price__P6vkH']//button") public List<WebElement> subscribers;
    @FindBy(xpath = "//span[@class='text__Text-sc-1j50qoj-0 ijNIOS']")
    public WebElement btn_sub1;
    @FindBy(xpath = "//span[@class='text__Text-sc-1j50qoj-0 ijNIOS']")
    public WebElement btn_sub2;
    @FindBy(xpath = "//span[@class='text__Text-sc-1j50qoj-0 ijNIOS']")
    public WebElement btn_sub3;
    @FindBy(xpath = "//span[@class='text__Text-sc-1j50qoj-0 ijNIOS']")
    public WebElement btn_contact;

    //public List<WebElement> subscribers2 = new ArrayList<>(Arrays.asList(btn_sub1, btn_sub2, btn_sub3, btn_contact));

    @FindBy(xpath = "//span[@class='text__Text-sc-1j50qoj-0 eluQeq']")
    public WebElement btn_requestDemo1;

    @FindBy(xpath = "//button[@class='button__Button-sc-1m6iuh2-0 iEmDLV']")
    public WebElement btn_requestDemo2;


    @FindBy(xpath = "(//span[@class='text__Text-sc-1j50qoj-0 CDTmU'])[3]")
    public WebElement btn_signUp;

    @FindBy(xpath = "//span[@class='text__Text-sc-1j50qoj-0 eTpgnv']")
    public WebElement header_frequentlyAskedQuestions;

    @FindBy(xpath = "//span[text()='For Candidate']")
    public WebElement btn_forCandidates;
    @FindBy(xpath = "//span[@class='text__StyledText-sc-1s1i12s-0 TTbWn']")
    public WebElement address;
    @FindBy(xpath = "(//span[@class='text__StyledText-sc-1s1i12s-0 dcwTaJ'])[1]")
    public WebElement phone;
    @FindBy(xpath = "(//span[@class='text__StyledText-sc-1s1i12s-0 dcwTaJ'])[2]")
    public WebElement email1;
    @FindBy(css = "[name='firstName']")
    public WebElement firstName;
    @FindBy(css = "[name='lastName']")
    public WebElement lastName;
    @FindBy(css = "[name='email']")
    public WebElement email;
    @FindBy(css = "[name='subject']")
    public WebElement subject;
    @FindBy(css = "[name='message']")
    public WebElement message;
    @FindBy(css = "[type='submit']")
    public WebElement sendMessage;
    @FindBy(xpath = "//span[@color='#E03724']")
    public List<WebElement> alertMessages;
    @FindBy(css = ".Toastify__toast-body")
    public WebElement toastMessage;
    @FindBy(xpath = "//span[text()='Contact']")
    public WebElement contactFooter;
}
