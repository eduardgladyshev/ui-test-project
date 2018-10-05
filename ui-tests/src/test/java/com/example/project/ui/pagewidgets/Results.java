package com.example.project.ui.pagewidgets;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Results {
    public SelenideElement sortDropdown = $(".sort-menu-container");
    public SelenideElement sortList = $("#SortMenu");
    public ElementsCollection resultList = $$("#ListViewInner>li");
}
