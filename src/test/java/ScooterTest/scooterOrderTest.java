package ScooterTest;

/*import io.github.bonigarcia.wdm.WebDriverManager;*/
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.praktikum.yandex.pom.MainPage;
import ru.praktikum.yandex.pom.OrderPage;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertTrue;

public class scooterOrderTest {
    WebDriver driver;

    @Before
    public void setIp(){

        System.setProperty("webdriver.gecko.driver", "C:\\Study\\geckodriver.exe");
        //Для выбора браузера необходимо раскомментировать нужную строку
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    @Test
    public void orderScooter(){
        MainPage mainPage = new MainPage(driver);
        OrderPage orderPage = new OrderPage(driver);

        mainPage.clickCookieButton();
        mainPage.clickOrderButtonUP();
        orderPage.enterName("Марк");
        orderPage.enterSecondName("Аврелий");
        orderPage.enterAddress("Италия, Замок Святого Ангела ");
        orderPage.clickStationField();
        orderPage.clickStation();
        orderPage.enterPhone("88005553535");
        orderPage.clickNextButton();
        orderPage.enterDate("30.01.2023");
        orderPage.clickRentalPeriodField();
        orderPage.clickDayOfRental();
        orderPage.clickColorScooter();
        orderPage.enterComment("А я думала сова");
        orderPage.clickButtonOrderFinal();
        orderPage.clockButtonOrderApprove();
        boolean test = driver.findElement(By.className("Order_ModalHeader__3FDaJ")).isDisplayed();
        assertTrue(test);
    }

    @Test
    public void orderScooter2(){
        MainPage mainPage = new MainPage(driver);
        OrderPage orderPage = new OrderPage(driver);

        mainPage.clickCookieButton();
        mainPage.clickOrderButtonDown();
        orderPage.enterName("Алиса");
        orderPage.enterSecondName("Яндексовна");
        orderPage.enterAddress("Полка под телевизором");
        orderPage.clickStationField();
        orderPage.clickStation2();
        orderPage.enterPhone("+79149495674");
        orderPage.clickNextButton();
        orderPage.enterDate("01.02.2023");
        orderPage.clickRentalPeriodField();
        orderPage.clickDayOfRental2();
        orderPage.clickColorScooter2();
        orderPage.enterComment("А вы точно продюсер?");
        orderPage.clickButtonOrderFinal();
        orderPage.clockButtonOrderApprove();
        boolean test = driver.findElement(By.className("Order_ModalHeader__3FDaJ")).isDisplayed();
        assertTrue(test);
    }

    @After
    public void tearDown(){
    driver.quit();
    }
}
