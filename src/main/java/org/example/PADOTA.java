package org.example;

public class PADOTA {
    private String surname;
    private String name;
    private String lastname;
    private String phoneNumber;
    private String orders;
    private String orderss;
    private String ordersss;
    private String ordersssss;

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOrders() {
        return this.orders;
    }
    public void setOrders(String orders) {
        this.orders = orders;
    }

    public void setOrderss(String orderss) {
        this.orderss = orderss;
    }
    public String getOrderss() {
        return this.orderss;
    }
    public String getOrdersss() {
        return this.ordersss;
    }
    public void setOrdersss(String ordersss) { this.ordersss = ordersss;}
    public String getOrdersssss() {
        return this.ordersssss;
    }
    public void setOrdersssss(String ordersssss) {
        this.ordersssss = ordersssss;
    }





    public PADOTA(String surname, String name, String lastname, String phoneNumber, String orders, String orderss, String ordersss, String ordersssss) {
        this.surname = surname;
        this.name = name;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
        this.orders = orders;
        this.orderss = orderss;
        this.ordersss = ordersss;
        this.ordersssss = ordersssss;
    }

    public PADOTA() {
    }

    public static boolean phoneCorrect(String phoneNumber) {
        return phoneNumber.matches("(\\+*)\\d{11}");
    }

    public static boolean textCorrect(String text) {
        return text.matches("[А-Я][а-я]{2,15}");
    }

    public String toString() {
        return "профессия: " + this.name + "\nобразование: " + this.surname + "\nместо и должность последней работы: " + this.lastname + "\nпричина увольнения: " + this.phoneNumber + "\nсемейное положение: " + this.orders + "\n"+ "жилищные условия: " + this.orderss + "\n"+ "контактные координаты: " + this.ordersss + "\n"+ "требования к будущей работе: " + this.ordersssss + "\n";
    }
}
