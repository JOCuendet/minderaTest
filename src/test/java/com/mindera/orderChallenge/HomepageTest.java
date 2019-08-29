package com.mindera.orderChallenge;

import com.mindera.orderChallenge.component.ListComponent;
import com.mindera.orderChallenge.page.Homepage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class HomepageTest extends BaseConfig {

    public static final String HOME = "http://localhost:3000";


    @Test(groups = {"smoke", "regression"})
    public void integrityChecks() {
        Homepage homepage = open(HOME, Homepage.class);
        homepage.assertIntegrity();
        ListComponent listComponent = open(HOME, ListComponent.class);
        listComponent.assertIntegrity();

    }


    @Test(groups = {"smoke", "regression"})
    public void checkOrdering() {
        ListComponent listComponent = open(HOME, ListComponent.class);
        listComponent.dragTest();
    }
}
