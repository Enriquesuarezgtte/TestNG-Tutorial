package test;

import org.testng.annotations.Test;

public class LoginTest {
	
	@Test(groups= {"Smoke"}, timeOut = 400)
	public void webLoginCarLoan() throws InterruptedException {
	  Thread.sleep(350);
		System.out.println("weblogin");
	}
	
	@Test(groups= {"Smoke"}, dependsOnMethods = {"webLoginCarLoan"}, enabled = true)
	public void mobileLoginCarLoan(){
		System.out.println("mobileLogin");
	}
	
	@Test
	public void loginAPICarLoan() {
		System.out.println("APIlogin");
	}

}
