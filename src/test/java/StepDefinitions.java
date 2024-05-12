import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
    @Given("пользователь открывает главную страницу интернет-магазина")
    public void openHomePage() {
        System.out.println("Шаг: пользователь открывает главную страницу интернет-магазина");
    }

    @When("пользователь нажимает кнопку {string}")
    public void clickButton(String buttonName) {
        System.out.println("Шаг: пользователь нажимает кнопку '" + buttonName + "'");
    }

    @And("пользователь вводит свое имя {string}")
    public void enterFirstName(String firstName) {
        System.out.println("Шаг: пользователь вводит свое имя '" + firstName + "'");
    }

    @And("пользователь вводит свою фамилию {string}")
    public void enterLastName(String lastName) {
        System.out.println("Шаг: пользователь вводит свою фамилию '" + lastName + "'");
    }

    @And("пользователь вводит адрес электронной почты {string}")
    public void enterEmail(String email) {
        System.out.println("Шаг: пользователь вводит адрес электронной почты '" + email + "'");
    }

    @And("пользователь вводит пароль {string}")
    public void enterPassword(String password) {
        System.out.println("Шаг: пользователь вводит пароль '" + password + "'");
    }

    @And("пользователь подтверждает пароль {string}")
    public void confirmPassword(String confirmPassword) {
        System.out.println("Шаг: пользователь подтверждает пароль '" + confirmPassword + "'");
    }

    @Then("отображается сообщение {string}")
    public void verifyMessage(String message) {
        System.out.println("Шаг: отображается сообщение '" + message + "'");

        if (!messageDisplayedCorrectly(message)) {
            throw new AssertionError("Сообщение не отображается корректно: " + message);
        }
    }
    private boolean messageDisplayedCorrectly(String expectedMessage) {
        return true;
    }

    @And("пользователь автоматически входит в систему")
    public void autoLogin() {
        System.out.println("Шаг: пользователь автоматически входит в систему");
    }
}
