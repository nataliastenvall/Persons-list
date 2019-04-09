package ru.geekbrains.lesson_5;

import javax.naming.Name;

public class Person {
    private String name;
    private String phoneNumber;
    private String email;
    private int salary;
    private int age;
    private int i;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void

    public void TheList(){
        System.out.println("Данные сотрудников: ФИО " + name + "Телефон " + phoneNumber + "Эл.почта " + email + "Оклад " + salary +
                "Возраст " + age);
    }


    }
}
