package page.classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by olewc on 24/08/2017.
 */
public class HomePage {

    @FindBy(id="tab-flight-tab")
    WebElement flightTab;

    @FindBy(id="flight-type-roundtrip-label")
    WebElement roundTrip;

    @FindBy(id="flight-type-multidest-label")
    WebElement multipleDestination;

    public void clickFlightTab(){
        flightTab.click();
    }

    public void clickRoundTrip(){
        roundTrip.click();
    }

    public void clickMultipleDestination(){
        multipleDestination.click();
    }
}
