package com.mindera.orderChallenge.component;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.testng.Assert.fail;

public class ListComponent extends BaseComponent {

    public ListComponent() {
        super($(byId("app")));
    }

    @Override
    public void assertIntegrity() {
        this.getComponent().should(Condition.exist);
        $("ul").should(Condition.exist);
        this.getComponent().$$("li").shouldHave(size(6));

    }

    public void dragTest() {


        SelenideElement listItem0 = $(new Selectors.ByText("Item 0"));
        SelenideElement listItem1 = $(new Selectors.ByText("Item 1"));
        SelenideElement listItem2 = $(new Selectors.ByText("Item 2"));
        SelenideElement listItem3 = $(new Selectors.ByText("Item 3"));
        SelenideElement listItem4 = $(new Selectors.ByText("Item 4"));
        SelenideElement listItem5 = $(new Selectors.ByText("Item 5"));

        listItem5.dragAndDropTo($$("li").get(0));
        listItem4.dragAndDropTo($$("li").get(0));
        listItem3.dragAndDropTo($$("li").get(0));
        listItem2.dragAndDropTo($$("li").get(0));
        listItem1.dragAndDropTo($$("li").get(0));
        listItem0.dragAndDropTo($$("li").get(0));


        checkSorting();
    }

    private void checkSorting() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ElementsCollection list = this.getComponent().$$("li");

        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).getText().equals("Item " + i)) {
                fail("not equal position " + i);
            }
        }


    }


}
