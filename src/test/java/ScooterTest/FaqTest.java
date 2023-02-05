package ScooterTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.praktikum.yandex.pom.MainPage;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;
@RunWith(Parameterized.class)
public class FaqTest {

    WebDriver driver;
    private final int elementIndex;
    private final String expectedText;

    @Before
    public void setIp(){

        //Для выбора браузера необходимо раскомментировать нужную строку
        // driver = new ChromeDriver();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    public FaqTest(int index, String answerText) {
        this.elementIndex = index;
        this.expectedText = answerText;
    }
    @Parameterized.Parameters()
    public static Object[][] getInput() {
        return new Object[][]{
                {0, "Сутки — 400 рублей. Оплата курьеру — наличными или картой."},
                {1, "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."},
                {2, "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."},
                {3, "Только начиная с завтрашнего дня. Но скоро станем расторопнее."},
                {4, "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."},
                {5, "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."},
                {6, "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."},
                {7, "Да, обязательно. Всем самокатов! И Москве, и Московской области."},
        };
    }

    @Test

    public void checkFaq() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickCookieButton();
        mainPage.clickFaqButton(elementIndex);
        String actualText = mainPage.faqAnswer(elementIndex);
        assertEquals("Ответ на вопрос №" +elementIndex + " неверен", expectedText, actualText);
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
