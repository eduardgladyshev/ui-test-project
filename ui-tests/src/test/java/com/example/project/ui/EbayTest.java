package com.example.project.ui;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Selenide.*;

import com.example.project.ui.pagewidgets.SearchMenu;
import com.example.project.ui.pagewidgets.Results;

/**
 * Simple Selenide Test with PageObjects
 */

public class EbayTest {
    @Test
    public void searchForSelenide() {
        // Arrange
        open("https://ebay.com/");
        new SearchMenu().simpleSearch("korg electribe 2");
        Results results = new Results();

        results.sortDropdown.shouldHave(text("по наилучшему соответствию"));
        results.sortDropdown.hover();
        results.sortList.shouldBe(visible);
        results.resultList.shouldHaveSize(50);
        results.resultCountDropdown.scrollTo();
        results.changeResultsCount("100");
        results.resultList.shouldHaveSize(100);
    }
}
