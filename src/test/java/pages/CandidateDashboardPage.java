package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CandidateDashboardPage extends BasePage{

    @FindBy(xpath = "//span[text()='Your Profile']") public WebElement btn_yourProfile;
}
