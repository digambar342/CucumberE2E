package stepDefinations;

import io.cucumber.java.en.Given;

public class StepDefinations {

    @Given("user enters correct userName {string}")
    public void user_enters_correct_user_name(String userName) {
        System.out.println("Enter correct userName "+userName);
    }
    @Given("user enters correct password {string}")
    public void user_enters_correct_password(String password) {
        System.out.println("Enter correct password "+password);
    }

}
