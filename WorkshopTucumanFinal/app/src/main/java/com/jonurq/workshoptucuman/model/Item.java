package com.jonurq.workshoptucuman.model;

import java.io.Serializable;

public class Item implements Serializable {
    private String title;
    private String amount;

    public Item(String title, String amount) {
        this.title = title;
        this.amount = amount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
