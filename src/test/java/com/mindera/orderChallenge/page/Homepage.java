package com.mindera.orderChallenge.page;


import com.mindera.orderChallenge.component.ListComponent;

public class Homepage extends BasePage {

    private final ListComponent listComponent;


    Homepage() {
        this.listComponent = new ListComponent();
    }

    @Override
    public void assertIntegrity() {
        super.assertIntegrity();
    }

    public ListComponent getListComponent() {
        return listComponent;
    }
}
