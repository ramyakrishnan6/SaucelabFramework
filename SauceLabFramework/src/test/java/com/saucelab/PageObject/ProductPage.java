package com.saucelab.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.WebDriver;
public class ProductPage {
WebDriver driver;
public ProductPage (WebDriver driver){
this.driver =driver;
PageFactory.initElements (driver, this);
}
@FindBy(xpath="//div[text()='Sauce Labs Backpack']")
WebElement productLink;

@FindBy(xpath="//button[text()='Add to cart']")
WebElement addToCartButton;
public void clickOnProductLink() {
productLink.click();
}
public void clickOnAddToCartButton() {
addToCartButton.click();
}
}
