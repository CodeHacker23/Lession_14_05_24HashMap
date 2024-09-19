package org.example;

import java.time.LocalDate;
import java.util.Objects;

public class Bank {
    private String name;
    private double Capital;
    private LocalDate date;
    private int employeesNum;

    public Bank(String name, double capital, LocalDate date, int employeesNum) {
        this.name = name;
        Capital = capital;
        this.date = date;
        this.employeesNum = employeesNum;
    }

    public String getName() {
        return name;
    }

    public double getCapital() {
        return Capital;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getEmployeesNum() {
        return employeesNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapital(double capital) {
        Capital = capital;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setEmployeesNum(int employeesNum) {
        this.employeesNum = employeesNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return Double.compare(Capital, bank.Capital) == 0 && employeesNum == bank.employeesNum && Objects.equals(name, bank.name) && Objects.equals(date, bank.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Capital, date, employeesNum);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", Capital=" + Capital +
                ", date=" + date +
                ", employeesNum=" + employeesNum +
                '}';
    }
}
