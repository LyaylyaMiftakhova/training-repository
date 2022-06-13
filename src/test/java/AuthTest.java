import com.codeborne.selenide.Condition;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class AuthTest {

    @Owner("LyaylyaMiftakhova")
    @Feature("Авторизация")
    public class AuthTest {

        @BeforeEach
        public void setup(){
            open("https://github.com/");
            TestPages.mainPage.mainSingInButton()
                    .click();
        }



    }
