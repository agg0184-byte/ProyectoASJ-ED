package test;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import pages.InventoryPage;

public class InventoryTest {
    WebDriver driver;
    InventoryPage inventoryPage;

    @BeforeEach
        //logeo
    void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        LoginPage lp = new LoginPage(driver);
        lp.login("standard_user", "secret_sauce");
        inventoryPage = new InventoryPage(driver);

    }



        @AfterEach//cerrar página
        void tearDown() {
            driver.quit();
        }

}
