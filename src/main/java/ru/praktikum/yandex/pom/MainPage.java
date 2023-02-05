package ru.praktikum.yandex.pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {



    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    private final WebDriver webDriver;

    //Локатор для принятия кук
    private By cookieButton = By.className("App_CookieButton__3cvqF");
    // Метод для принятия кук
    public void clickCookieButton() {
        webDriver.findElement(cookieButton).click();
    }



    //Локатор для вопросов-выпадашек
    private By coastQuestion = By.className("accordion__item");


    //Метод для клика по выпадашке
    public void clickFaqButton(int index) {
        webDriver.findElements(coastQuestion).get(index).click();
    }

    //Методы для получения текста ответа
    public String faqAnswer(int elementIndex) {
        return webDriver.findElement(By.xpath(".//div[@id = 'accordion__panel-" + elementIndex + "']")).getText();
    }


    //Локатор Кнопка Заказать наверху
    private By orderUp = By.className("Button_Button__ra12g");
    //Локатор Кнопка Заказать внизу
    private By orderDown = By.xpath("/html/body/div/div/div/div[4]/div[2]/div[5]/button");


    //Метода для клика по кнопке заказать
    public String clickOrderButton(String button){
        if
        (button == "Верхняя кнопка")
            webDriver.findElement(orderUp).click();
        else
            webDriver.findElement(orderDown).click();
        return button;
    }


}