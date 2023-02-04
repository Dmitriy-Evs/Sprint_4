package ScooterTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.praktikum.yandex.pom.MainPage;
import ru.praktikum.yandex.pom.OrderPage;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class ScooterOrderTest {
    WebDriver driver;

    private final String button;
    private final String name;
    private final String surname;
    private final String address;
    private final String station;
    private final String number;
    private final String date;
    private final String period;
    private final String color;
    private final String comment;

    public ScooterOrderTest(String button, String name, String surname, String address, String station, String number, String date, String period, String color, String comment) {
        this.button = button;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.station = station;
        this.number = number;
        this.date = date;
        this.period = period;
        this.color = color;
        this.comment = comment;
    }


    @Before
    public void setIp(){

        //Для выбора браузера необходимо раскомментировать нужную строку
        //driver = new ChromeDriver();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }
    @Parameterized.Parameters // добавили аннотацию
    public static  Object[][] getInput() {
        return new Object[][]{
                {"Верхня кнопка", "Марк", "Аврелий", "Италия, Замок Святого Ангела", "Бульвар Рокоссовского", "88005553535", "30.01.2023", "2 суток", "черный жемчуг","А я думала сова"},
                {"Нижняя кнопка","Алиса", "Макаровна", "Красноярск", "Преображенская площадь", "89129345687", "10.02.2023", "3 суток", "серая безысходность", "Люблю скорость"},
        };
        }

    @Test
    public void orderScooter(){
        MainPage mainPage = new MainPage(driver);
        OrderPage orderPage = new OrderPage(driver);


        mainPage.clickCookieButton();
        mainPage.clickOrderButton(button);
        orderPage.enterName(name);
        orderPage.enterSecondName(surname);
        orderPage.enterAddress(address);
        orderPage.clickStationField();
        orderPage.clickStation(station);
        orderPage.enterPhone(number);
        orderPage.clickNextButton();
        orderPage.enterDate(date);
        orderPage.clickRentalPeriodField();
        orderPage.clickRentalPeriod(period);
        orderPage.clickColorScooterField(color);
        orderPage.enterComment(comment);
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
