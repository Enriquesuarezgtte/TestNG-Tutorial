package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basics {

  @BeforeClass
  public void beforeClass() {
    System.out.println("Before class ");
  }
  
  @AfterClass
  public void afterClass() {
    System.out.println("After class ");
  }

  @Test
  public void Demo() {
    System.out.println("Hello world");
  }

  @Test
  public void Demo2() {
    System.out.println("hello again");
  }

  @BeforeTest
  public void cleanData() {
    System.out.println("Before Test");
  }

  @BeforeSuite
  public void cleanDataSuite() {
    System.out.println("Before suite");
  }

  @AfterSuite
  public void cleanDataSuiteAfter() {
    System.out.println("After suite");
  }

  @AfterTest
  public void cleanAfter() {
    System.out.println("After Test");
  }

  @BeforeMethod
  public void beforeMethod() {
    System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
    System.out.println("After Method");
  }

  @Test(groups= {"Smoke"})
  public void NoDemo2() {
    System.out.println("hello again");
  }

}
