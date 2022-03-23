package pages;

public class GooglePage extends BasePage{

    private String searchButton = "//center/input[@value='Buscar con Google']";
    private String searchTextField = "//div/input[@class='gLFyf gsfi']";

    public GooglePage() {
        super(driver);
    }

    public void navigateToGoogle() {
        navigateTo("https://www.google.com");
    }

    public void clickGoogleSearch(){
        clickElement(searchButton);
    }

    public void enterSearchCriteria(String criteria){
        sendKeysElement(searchTextField, criteria);
    }
}
