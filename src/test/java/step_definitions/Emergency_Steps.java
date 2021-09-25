
package step_definitions;

import Utilities.Config;
import Utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Emergency_Page;
import pages.MyInfo_Page;

public class Emergency_Steps {

    Emergency_Page emergency_page = new Emergency_Page();
    MyInfo_Page myInfo1 = new MyInfo_Page();
    Faker faker = new Faker();

  // @Given("I am in the main page")
  //  public void i_am_in_the_main_page() {
   // Driver.getDriver().get(Config.getProperty("OrangehrmUrl"));
 // }



    @When("clicked on the  My info text")
    public void clicked_on_the_my_info_text() {
       myInfo1.MyInfo.click();


    }

    @When("I navigate back and click Emergency Contact")
    public void i_navigate_back_and_click_emergency_contact() {
      emergency_page.EmergencyCont.click();
    }


    @When("Navigate to Add button and click")
    public void navigate_to_add_button_and_click() {
       emergency_page.AddBtn.click();
    }

    @When("I navigate back and click Name")
    public void i_navigate_back_and_click_name() {
      emergency_page.Name.sendKeys(faker.name().firstName());
    }

    @When("I navigate back and click Relationship")
    public void i_navigate_back_and_click_relationship() {
      emergency_page.Relationship.sendKeys("spouse");
    }

    @When("I navigate back and click Home Telepone")
    public void i_navigate_back_and_click_home_telepone() {
       emergency_page.HomeTelephone.sendKeys(faker.phoneNumber().cellPhone());
    }

    @When("I navigate back and enter Mobile")
    public void i_navigate_back_and_enter_mobile() {
        emergency_page.MobileNumber.sendKeys(faker.phoneNumber().cellPhone());
    }

    @When("I navigate back and enter Work Telephone")
    public void i_navigate_back_and_enter_work_telephone() {
       emergency_page.WorkTelephoneNum.sendKeys(faker.phoneNumber().phoneNumber());
    }

    @Then("Press the save button")
    public void press_the_save_button() {
     emergency_page.SaveButton.click();
    }



}





