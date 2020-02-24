package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest {

  @Test(groups = { "Smoke" }, timeOut = 400)
  public void webLoginCarLoan() throws InterruptedException {
    Thread.sleep(350);
    System.out.println("weblogin");
  }

  @Parameters({ "URL" })
  @Test(groups = { "Smoke" }, dependsOnMethods = { "webLoginCarLoan" }, enabled = true)
  public void mobileLoginCarLoan(String urlName) {
    System.out.println("mobileLogin " + urlName);
  }

  @Test(groups = { "Smoke" }, dataProvider = "getData")
  public void loginAPICarLoan(String username, String password) {
    System.out.println("APIlogin");
    System.out.println("username: " + username);
    System.out.println("username: " + password);
  }

  @DataProvider
  public String[][] getData() {
    String[][] data = new String[2][2];
    data[0][0] = "Enrique";
    data[0][1] = "123";
    data[1][0] = "David";
    data[1][1] = "456";
    return data;
  }

}
