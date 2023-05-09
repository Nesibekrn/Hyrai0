package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static stepdefinitions.Hooks.driver;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(driver, this);
    }

    private FrequentlyAskedQuestionsPage frequentlyAskedQuestionsPage;
    private CandidateDashboardPage candidateDashboardPage;
    private CandidateSignInPage candidateSignInPage;
    private CandidateHomePage candidateHomePage;
    private CandidateSignUpPage candidateSignUpPage;
    private CompanySignUpPage companySignUpPage;
    private CompanySignInPage companySignInPage;
    private CompanyDashboardPage companyDashboardPage;
    private CompanyHomePage companyHomePage;
    private ForCompanyRequestDemoPage forCompanyRequestDemoPage;


    public CandidateDashboardPage getCandidateDashboardPage() {
        if (candidateDashboardPage == null) {
            candidateDashboardPage = new CandidateDashboardPage();
        }
        return candidateDashboardPage;
    }

    public CandidateSignUpPage getCandidateSignUpPage() {
        if (candidateSignUpPage == null) {
            candidateSignUpPage = new CandidateSignUpPage();
        }
        return candidateSignUpPage;
    }

    public CandidateSignInPage getCandidateSignInPage() {
        if (candidateSignInPage == null) {
            candidateSignInPage = new CandidateSignInPage();
        }
        return candidateSignInPage;
    }

    public CandidateHomePage getCandidateHomePage() {
        if (candidateHomePage == null) {
            candidateHomePage = new CandidateHomePage();
        }
        return candidateHomePage;
    }

    public CompanyHomePage getCompanyHomePage() {
        if (companyHomePage == null) {
            companyHomePage = new CompanyHomePage();
        }
        return companyHomePage;
    }

    public CompanyDashboardPage getCompanyDashboardPage() {
        if (companyDashboardPage == null) {
            companyDashboardPage = new CompanyDashboardPage();
        }
        return companyDashboardPage;
    }

    public CompanySignUpPage getCompanySignUpPage() {
        if (companySignUpPage == null) {
            companySignUpPage = new CompanySignUpPage();
        }
        return companySignUpPage;
    }

    public CompanySignInPage getCompanySignInPage() {
        if (companySignInPage == null) {
            companySignInPage = new CompanySignInPage();
        }
        return companySignInPage;
    }
    public ForCompanyRequestDemoPage getForCompanyRequestDemoPage() {
        if (forCompanyRequestDemoPage == null) {
            forCompanyRequestDemoPage = new ForCompanyRequestDemoPage();
        }
        return forCompanyRequestDemoPage;

    }

    public FrequentlyAskedQuestionsPage getFrequentlyAskedQuestionsPage() {
        if (frequentlyAskedQuestionsPage== null) {
            frequentlyAskedQuestionsPage= new FrequentlyAskedQuestionsPage();
        }
        return frequentlyAskedQuestionsPage;
    }
}
