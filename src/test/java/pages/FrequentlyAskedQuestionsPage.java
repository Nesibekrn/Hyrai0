package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FrequentlyAskedQuestionsPage extends BasePage {


    @FindBy(xpath = "(//*[@class='text__Text-sc-1j50qoj-0 Nogiz'])[1]") public WebElement btn_firstQuestion;

    @FindBy(xpath = "(//*[@class='text__Text-sc-1j50qoj-0 Nogiz'])[2]") public WebElement btn_secondQuestion;

    @FindBy(xpath = "(//*[@class='text__Text-sc-1j50qoj-0 Nogiz'])[3]") public WebElement btn_thirdQuestion;

    @FindBy(xpath = "(//*[@class='text__Text-sc-1j50qoj-0 Nogiz'])[4]") public WebElement btn_fourthQuestion;

    @FindBy(xpath = "(//*[@class=\"text__Text-sc-1j50qoj-0 cXDNYY\"])[1]") public WebElement lbl_firstAnswer;

    @FindBy(xpath = "(//*[@class='text__Text-sc-1j50qoj-0 cXDNYY'])[2]") public WebElement lbl_secondAnswer;

    @FindBy(xpath = "(//*[@class='text__Text-sc-1j50qoj-0 cXDNYY'])[3]") public WebElement lbl_thirdAnswer;

    @FindBy(xpath = "(//*[@class='text__Text-sc-1j50qoj-0 cXDNYY'])[4]") public WebElement lbl_fourthAnswer;



}