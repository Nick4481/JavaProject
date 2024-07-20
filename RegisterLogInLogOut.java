import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegisterLogInLogOut {
@Test

public void loginTest(){

// REGISTER
    String url = "https://parabank.parasoft.com/parabank/index.htm";
    WebDriver driver = new EdgeDriver();
    driver.get(url);
    driver.manage().window().maximize();


WebElement registerUser = driver.findElement(By.linkText("Register"));
registerUser.click();

    WebElement firstName = driver.findElement(By.name("customer.firstName"));
    firstName.sendKeys("test123");

    WebElement lastName = driver.findElement(By.name("customer.lastName"));
    lastName.sendKeys("test");

    WebElement address = driver.findElement(By.id("customer.address.street"));
    address.sendKeys("District 1");

    WebElement city = driver.findElement(By.name("customer.address.city"));
    city.sendKeys("Freljord");

    WebElement state = driver.findElement(By.id("customer.address.state"));
    state.sendKeys("state1");

    WebElement zipCode = driver.findElement(By.name("customer.address.zipCode"));
    zipCode.sendKeys("3412412");

    WebElement phoneNumber = driver.findElement(By.id("customer.phoneNumber"));
    phoneNumber.sendKeys("0752123289");

    WebElement socialNumber = driver.findElement(By.name("customer.ssn"));
    socialNumber.sendKeys("8881881");

    WebElement username = driver.findElement(By.name("customer.username"));
    username.sendKeys("testUsername123");

    WebElement password = driver.findElement(By.name("customer.password"));
    password.sendKeys("password123");

    WebElement confirmPassword = driver.findElement(By.name("repeatedPassword"));
    confirmPassword.sendKeys("password123");



    //LOGIN TEST








}
}
