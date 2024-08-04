package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.utility.SeleniumUtility;

public class SetupTextSteps extends SeleniumUtility {

    @Given( "Open browser and navigate to the retail app" )

    public void openBrowserAndNavigate(){

        setupBrowser();
    }
    @Then( "Validate top left corner is TEKSCHOOL")

    public void validateTopLefLogo(){

        String topLeftCornerText = getElementText( By.className( "top-nav__logo") );

        Assert.assertEquals( "TEKSCHOOL" , topLeftCornerText );
    }
    @Then( "Close the browser" )

    public void closeBrowser(){

        quitBrowser();
    }
}
