package com.symbion.shop.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.symbion.shop.pages.ShopAddingProductsToCart;
import com.symbion.shop.pages.ShopHomePage;
import com.symbion.shop.pages.ShopLoginPage;
import com.symbion.shop.pages.ShopProductOrderingPage;
import com.symbion.shop.pages.ShopTestBase;
import com.symbion.shop.pages.orderStatusPage;
import com.symbion.shop.pages.shoppingCartMiniWindowPage;
import com.symbion.shop.pages.shoppingCartPage;
import com.symbion.shop.pages.submitOrderConfirmationPage;

public class orderStatusTest extends ShopTestBase{

	ShopLoginPage loginPage;
	ShopHomePage homePage;
	ShopProductOrderingPage productOrderingPage;
	ShopAddingProductsToCart addingProducts;
	shoppingCartMiniWindowPage cartMiniWindow;
	shoppingCartPage placeOrderItem;
	submitOrderConfirmationPage confirmationPage;
	orderStatusPage statusConfirmation;
	
	public orderStatusTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
		Home_Page_Launch();
		loginPage = new ShopLoginPage();
		homePage = loginPage.login(("shop.qa"), ("password"));
		productOrderingPage = new ShopProductOrderingPage();
		addingProducts = new ShopAddingProductsToCart();
		cartMiniWindow = new shoppingCartMiniWindowPage();
		placeOrderItem = new shoppingCartPage();
		confirmationPage = new submitOrderConfirmationPage();
		statusConfirmation = new orderStatusPage();
}
		
	@Test
	public void orderStatusConfirmation() throws InterruptedException {
		homePage.OrderingMenuSelect();
		Thread.sleep(5000);
		productOrderingPage.searchProducts();
		Thread.sleep(5000);
		addingProducts.addProductsToCart();
		Thread.sleep(5000);
		cartMiniWindow.viewBtnClick();
		Thread.sleep(5000);
		placeOrderItem.placeOrder();
		Thread.sleep(5000);
		confirmationPage.ordConfirmation();
		Thread.sleep(5000);
		statusConfirmation.orderStatus();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
		
	}


	
}
