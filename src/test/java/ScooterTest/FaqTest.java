package ScooterTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.praktikum.yandex.pom.MainPage;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;

public class FaqTest {

    WebDriver driver;


    @Before
    public void setIp(){

        //Для выбора браузера необходимо раскомментировать нужную строку
        // driver = new ChromeDriver();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    @Test
    public void checkFaq(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickCookieButton();

        new WebDriverWait(driver, Duration.ofSeconds(1));

        mainPage.clickFaqButton(0);
        String answer1 = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        String newAnswer1 = mainPage.faqAnswer(".//div[@id = 'accordion__panel-0']");
        assertEquals("Ответ на первый вопрос неверен", answer1, newAnswer1);

        new WebDriverWait(driver, Duration.ofSeconds(1));

        mainPage.clickFaqButton(1);
        String answer2 = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        String newAnswer2 = mainPage.faqAnswer(".//div[@id = 'accordion__panel-1']");
        assertEquals("Ответ на второй вопрос неверен", answer2, newAnswer2);

        new WebDriverWait(driver, Duration.ofSeconds(1));

        mainPage.clickFaqButton(2);
        String answer3 = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        String newAnswer3 = mainPage.faqAnswer(".//div[@id = 'accordion__panel-2']");
        assertEquals("Ответ на первый вопрос неверен", answer3, newAnswer3);

        new WebDriverWait(driver, Duration.ofSeconds(1));

        mainPage.clickFaqButton(3);
        String answer4 = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        String newAnswer4 = mainPage.faqAnswer(".//div[@id = 'accordion__panel-3']");
        assertEquals("Ответ на первый вопрос неверен", answer4, newAnswer4);

        new WebDriverWait(driver, Duration.ofSeconds(1));

        mainPage.clickFaqButton(4);
        String answer5 = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        String newAnswer5 = mainPage.faqAnswer(".//div[@id = 'accordion__panel-4']");
        assertEquals("Ответ на первый вопрос неверен", answer5, newAnswer5);

        new WebDriverWait(driver, Duration.ofSeconds(1));

        mainPage.clickFaqButton(5);
        String answer6 = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        String newAnswer6 = mainPage.faqAnswer(".//div[@id = 'accordion__panel-5']");
        assertEquals("Ответ на первый вопрос неверен", answer6, newAnswer6);

        new WebDriverWait(driver, Duration.ofSeconds(1));

        mainPage.clickFaqButton(6);
        String answer7 = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        String newAnswer7 = mainPage.faqAnswer(".//div[@id = 'accordion__panel-6']");
        assertEquals("Ответ на первый вопрос неверен", answer7, newAnswer7);

        new WebDriverWait(driver, Duration.ofSeconds(1));

        mainPage.clickFaqButton(7);
        String answer8 = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        String newAnswer8 = mainPage.faqAnswer(".//div[@id = 'accordion__panel-7']");
        assertEquals("Ответ на первый вопрос неверен", answer8, newAnswer8);

    }


    @After
    public void tearDown(){
        driver.quit();
    }
}
