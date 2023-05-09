package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompanyDashboardPage extends BasePage{

    @FindBy(xpath = "//button[text()='Hire']" ) public WebElement btn_hire;
    @FindBy(xpath = "//a[@href='/company/auth?tab=SIGN_UP']") public WebElement btn_SignUpCompany;







}
