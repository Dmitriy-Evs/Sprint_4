package ru.praktikum.yandex.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class OrderPage {

    private final WebDriver webDriver;

    public OrderPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    //Локатор для поля ИМя
    private By nameField = By.xpath(".//input[@placeholder = '* Имя']");

    //Метод для заполнения поля Имя
    public void enterName(String number) {
        webDriver.findElement(nameField).sendKeys(number);
    }

    //Локатор для поля Фамилия
    private By secondNameField = By.xpath(".//input[@placeholder = '* Фамилия']");

    //Метод для заполнения поля Фамилия
    public void enterSecondName(String number) {
        webDriver.findElement(secondNameField).sendKeys(number);
    }

    //Локатор для поля Адрес
    private By addressField = By.xpath(".//input[@placeholder = '* Адрес: куда привезти заказ']");

    //Метод для заполнения поля Адрес
    public void enterAddress(String number) {
        webDriver.findElement(addressField).sendKeys(number);
    }

    //Локатор для поля станция
    private By stationField = By.xpath(".//input[@placeholder = '* Станция метро']");

    //Метод для клика по полю
    public void clickStationField() {
        webDriver.findElement(stationField).click();
    }


    //Локатор для конкретной станции
    private By stationChoose = By.className("select-search__row");

    //Метод для заполнения поля Станция
    public void clickStation() {
        webDriver.findElement(stationChoose).click();
    }

    //Локатор для конкретной станции второй вариант
    private By stationChoose2 = By.xpath(".//button[@value=\"3\"]");

    //Метод для заполнения поля Станция второй вариант
    public void clickStation2() {
        webDriver.findElement(stationChoose2).click();
    }

    //Локатор для поля Телефон
    private By phoneField = By.xpath(".//input[@placeholder = '* Телефон: на него позвонит курьер']");

    //Метод для заполнения поля Телефон
    public void enterPhone(String number) {
        webDriver.findElement(phoneField).sendKeys(number);
    }

    //Локатор для кнопки Далее
    private By nextButton = By.xpath(".//button[text()='Далее']");

    //Метод для клика по кнопке Далее
    public void clickNextButton() {
        webDriver.findElement(nextButton).click();
    }

    //Локатор для Календаря
    private By calendarField = By.xpath(".//input[@placeholder = '* Когда привезти самокат']");


    public void enterDate(String number) {
        webDriver.findElement(calendarField).sendKeys(number);
        webDriver.findElement(calendarField).sendKeys(Keys.ENTER);
    }


    //Локатор для кнопки Срок аренды
    private By rentalPeriodField = By.className("Dropdown-placeholder");
    //Метод для клика по полю срока
    public void clickRentalPeriodField() {
        webDriver.findElement(rentalPeriodField).click();
    }

    //Локатор для срока аренды
    private By dayOfRental = By.className("Dropdown-option");
    //Метод для клика по количеству суток аренды
    public void clickDayOfRental() {
        webDriver.findElements(dayOfRental).get(1).click();
    }

    //Метод для клика по количеству суток аренды второй вариант
    public void clickDayOfRental2() {
        webDriver.findElements(dayOfRental).get(2).click();
    }

    //Локатор для выбора цвета
    private By colorScooter = By.xpath("//*[.='чёрный жемчуг']");
    //Метод для клика по выбору цвета
    public void clickColorScooter() {
        webDriver.findElement(colorScooter).click();
    }

    //Локатор для выбора цвета второй вариант
    private By colorScooter2 = By.xpath("//*[.='серая безысходность']");
    //Метод для клика по выбору цвета
    public void clickColorScooter2() {
        webDriver.findElement(colorScooter2).click();
    }


    //Локатор для поля Комментарий курьеру
    private By comment = By.xpath(".//input[@placeholder = 'Комментарий для курьера']");

    //Метод для заполнения поля Комментарий курьеру
    public void enterComment(String number) {
        webDriver.findElement(comment).sendKeys(number);
    }

    //Локатор для кнопки заказать после оформления
    private By buttonOrderFinal = By.xpath("/html/body/div/div/div[2]/div[3]/button[2]");
    //Метод для клика по кнопке заказать после оформления
    public void clickButtonOrderFinal() {
        webDriver.findElement(buttonOrderFinal).click();
    }

    //Локатор для подтверждения заказа
    private By buttonOrderApprove = By.xpath(".//button[text()='Да']");
    //Метод для клика по кнопке заказать после оформления
    public void clockButtonOrderApprove() {
        webDriver.findElement(buttonOrderApprove).click();
    }



}
