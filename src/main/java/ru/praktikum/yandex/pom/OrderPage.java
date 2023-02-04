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
    public String enterName(String name) {
        webDriver.findElement(nameField).sendKeys(name);
        return name;
    }

    //Локатор для поля Фамилия
    private By secondNameField = By.xpath(".//input[@placeholder = '* Фамилия']");

    //Метод для заполнения поля Фамилия
    public String enterSecondName(String surname) {
        webDriver.findElement(secondNameField).sendKeys(surname);
        return surname;
    }

    //Локатор для поля Адрес
    private By addressField = By.xpath(".//input[@placeholder = '* Адрес: куда привезти заказ']");

    //Метод для заполнения поля Адрес
    public String enterAddress(String address) {
        webDriver.findElement(addressField).sendKeys(address);
        return address;
    }

    //Локатор для поля станция
    private By stationField = By.xpath(".//input[@placeholder = '* Станция метро']");

    //Метод для клика по полю
    public void clickStationField() {
        webDriver.findElement(stationField).click();
    }


    //Локатор для конкретной станции
    private By stationChoose = By.className("select-search__row");


    //Локатор для конкретной станции второй вариант
    private By stationChoose2 = By.xpath(".//button[@value=\"3\"]");


    public String clickStation(String station){
        if
        (station == "Бульвар Рокоссовского")
            webDriver.findElement(stationChoose).click();
        else
            webDriver.findElement(stationChoose2).click();
        return station;
    }



    //Локатор для поля Телефон
    private By phoneField = By.xpath(".//input[@placeholder = '* Телефон: на него позвонит курьер']");

    //Метод для заполнения поля Телефон
    public String enterPhone(String number) {
        webDriver.findElement(phoneField).sendKeys(number);
        return number;
    }

    //Локатор для кнопки Далее
    private By nextButton = By.xpath(".//button[text()='Далее']");

    //Метод для клика по кнопке Далее
    public void clickNextButton() {
        webDriver.findElement(nextButton).click();
    }

    //Локатор для Календаря
    private By calendarField = By.xpath(".//input[@placeholder = '* Когда привезти самокат']");


    public String enterDate(String date) {
        webDriver.findElement(calendarField).sendKeys(date);
        webDriver.findElement(calendarField).sendKeys(Keys.ENTER);
        return date;
    }


    //Локатор для кнопки Срок аренды
    private By rentalPeriodField = By.className("Dropdown-placeholder");
    //Метод для клика по полю срока
    public void clickRentalPeriodField() {
        webDriver.findElement(rentalPeriodField).click();
    }

    public String clickRentalPeriod(String period){
        if
        (period == "2 суток")
            clickDayOfRental();
        else
            clickDayOfRental2();
        return period;
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

    public String clickColorScooterField(String color){
        if
        (color == "черный жемчуг")
            clickColorScooter();
        else
            clickColorScooter2();
        return color;
    }



    //Локатор для выбора цвета второй вариант
    private By colorScooter2 = By.xpath("//*[.='серая безысходность']");
    //Метод для клика по выбору цвета
    public void clickColorScooter2() {
        webDriver.findElement(colorScooter2).click();
    }






    //Локатор для поля Комментарий курьеру
    private By commentField = By.xpath(".//input[@placeholder = 'Комментарий для курьера']");

    //Метод для заполнения поля Комментарий курьеру
    public String enterComment(String comment) {
        webDriver.findElement(commentField).sendKeys(comment);
        return comment;
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
