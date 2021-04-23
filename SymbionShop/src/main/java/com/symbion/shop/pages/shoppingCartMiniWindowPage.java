package com.symbion.shop.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class shoppingCartMiniWindowPage extends ShopTestBase{
	
	@FindBy(id="ctl00_cplMain_btnViewShoppingCart")
	WebElement cartViewBtn;
	
				
	public shoppingCartMiniWindowPage() {
		PageFactory.initElements(driver, this);
	}
	
	public shoppingCartPage viewBtnClick() throws InterruptedException {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(5000);
		cartViewBtn.click();
		Thread.sleep(5000);
		return new shoppingCartPage();
	}


}
