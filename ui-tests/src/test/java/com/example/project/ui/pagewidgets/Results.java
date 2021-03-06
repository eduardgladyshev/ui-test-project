package com.example.project.ui.pagewidgets;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Results {
    public SelenideElement sortDropdown = $(".sort-menu-container");
    public SelenideElement sortList = $("#SortMenu");
    public SelenideElement resultCountDropdown = $("#cbBtmElem .sel");
    public SelenideElement resultCountList = $("#cbBtmElem .lyr");
    public ElementsCollection resultList = $$("#ListViewInner>li");

    public void changeResultsCount(String num){
        resultCountDropdown.click();
        resultCountList.shouldBe(visible);
        $(byText(num)).click();
    }
}
