package com.symbion.shop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopAddingProductsToCart extends ShopTestBase{
	
	@FindBy(id="ctl00_cplMain_rptProduct_txtOrderQuantity_5")
	WebElement productQty1;
	
	@FindBy(id="ctl00_cplMain_rptProduct_txtOrderQuantity_4")
	WebElement productQty2;
	
	@FindBy(id="btnAddToCart")
	WebElement addToCartBtn;
		
	public ShopAddingProductsToCart() {
		PageFactory.initElements(driver, this);
	}
	
	public shoppingCartMiniWindowPage addProductsToCart() throws InterruptedException {
		productQty1.sendKeys("5");
		Thread.sleep(5000);
		productQty2.sendKeys("2");
		Thread.sleep(5000);
		addToCartBtn.click();
		Thread.sleep(5000);
		return new shoppingCartMiniWindowPage();
	}


}
