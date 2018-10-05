package com.example.project.ui.pagewidgets;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SearchMenu {
    SelenideElement input = $("#gh-ac");
    SelenideElement searchButton = $("#gh-btn");

    public void simpleSearch(String text){
        input.setValue(text);
        searchButton.click();
    }
}

