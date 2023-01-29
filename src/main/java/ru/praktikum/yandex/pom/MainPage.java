package ru.praktikum.yandex.pom;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {



    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    private final WebDriver webDriver;

    //Метод для открытия главной страницы
    public void openMainPage(){
        webDriver.get("https://qa-scooter.praktikum-services.ru/");
    }


    //Локатор для принятия кук
    private By cookieButton = By.className("App_CookieButton__3cvqF");
    // Метод для принятия кук
    public void clickCookieButton() {
        webDriver.findElement(cookieButton).click();
    }



    //Локатор для вопросов-выпадашек
    private By coastQuestion = By.className("accordion__item");



    //Метод для клика по выпадашке "Сколько стоит"
    public void clickFaqButton1() {
        webDriver.findElements(coastQuestion).get(0).click();
    }
    //Метод для клика по выпадашке "Несколько самокатов"
    public void clickFaqButton2() {
        webDriver.findElements(coastQuestion).get(1).click();
    }
    //Метод для клика по выпадашке "Время аренды"
    public void clickFaqButton3() {
        webDriver.findElements(coastQuestion).get(2).click();
    }
    //Метод для клика по выпадашке "Заказ на сегодня"
    public void clickFaqButton4() {
        webDriver.findElements(coastQuestion).get(3).click();
    }
    //Метод для клика по выпадашке "Продление заказа"
    public void clickFaqButton5() {
        webDriver.findElements(coastQuestion).get(4).click();
    }
    //Метод для клика по выпадашке "Зарядка с самокатом"
    public void clickFaqButton6() {
        webDriver.findElements(coastQuestion).get(5).click();
    }
    //Метод для клика по выпадашке "Отмена заказа"
    public void clickFaqButton7() {
        webDriver.findElements(coastQuestion).get(6).click();
    }
    //Метод для клика по выпадашке "Далеко живу"
    public void clickFaqButton8() {
        webDriver.findElements(coastQuestion).get(7).click();
    }



    //Методы для получения текста ответа
    public String faqAnswer1() {
        return webDriver.findElement(coastAnswer).getText();
    }
    public String faqAnswer2() {
        return webDriver.findElement(manyScooterAnswer).getText();
    }
    public String faqAnswer3() {
        return webDriver.findElement(timingCoastAnswer).getText();
    }
    public String faqAnswer4() {
        return webDriver.findElement(todayOrderAnswer).getText();
    }
    public String faqAnswer5() {
        return webDriver.findElement(moreOrLessTimeAnswer).getText();
    }
    public String faqAnswer6() {
        return webDriver.findElement(chargeForScooterAnswer).getText();
    }
    public String faqAnswer7() {
        return webDriver.findElement(cancelOrderAnswer).getText();
    }
    public String faqAnswer8() {
        return webDriver.findElement(liveFarAwayAnswer).getText();
    }


    //Выпадашка-ответ стоимость аренды
    private By coastAnswer = By.xpath(".//div[@id = 'accordion__panel-0']");
    //Выпадашка-ответ взять несколько скутеров в аренду
    private By manyScooterAnswer = By.xpath(".//div[@id = 'accordion__panel-1']");
    //Выпадашка-ответ расчет времени аренды
    private By timingCoastAnswer = By.xpath(".//div[@id = 'accordion__panel-2']");
    //Выпадашка-ответ возможность взять самокат сегодня
    private By todayOrderAnswer = By.xpath(".//div[@id = 'accordion__panel-3']");
    //Выпадашка-ответ сдать раньше или позже времени
    private By moreOrLessTimeAnswer = By.xpath(".//div[@id = 'accordion__panel-4']");
    //Выпадашка-ответ зарядка скутера
    private By chargeForScooterAnswer = By.xpath(".//div[@id = 'accordion__panel-5']");
    //Выпадашка-ответ отмена заказа
    private By cancelOrderAnswer = By.xpath(".//div[@id = 'accordion__panel-6']");
    //Выпадашка-ответ если я живу в области
    private By liveFarAwayAnswer = By.xpath(".//div[@id = 'accordion__panel-7']");




    //Локатор Кнопка Заказать наверху
    private By orderUp = By.className("Button_Button__ra12g");
    //Локатор Кнопка Заказать внизу
    private By orderDown = By.xpath("/html/body/div/div/div/div[4]/div[2]/div[5]/button");

    //Клик по кнопке заказать наверху
    public void clickOrderButtonUP(){
        webDriver.findElement(orderUp).click();
    }
    //Клик по кнопке заказать внизу
    public void clickOrderButtonDown(){
        webDriver.findElement(orderDown).click();
    }


}
