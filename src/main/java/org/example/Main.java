package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;

import static javax.swing.UIManager.put;

public class Main {

    private static Map<String, Bank> banks = new HashMap<String, Bank>();

    public static void main(String[] args) throws InterruptedException {
        Bank bank1 = new Bank("ВТБ", 12345990000.90, LocalDate.of(2000, Month.APRIL, 20), 14000);
        Bank bank2 = new Bank("Тинькофф", 100000000.22,LocalDate.of(2024,Month.MAY, 14) , 100);
        Bank bank3 = new Bank("Сбербанк", 236000000000000234.99, LocalDate.of(1980, Month.AUGUST, 15), 7500000);

        banks.put("ВТБ",bank1);
        banks.put("Тинькофф",bank2);
        banks.put("Сбербанк",bank3);

        addNewBank("Альфабанк", 106000000.00, LocalDate.of(2006, Month.SEPTEMBER, 10), 7450);
        getBankInfo("Альфабанк");

        System.out.println(LocalDateTime.now());
        Thread.sleep(1000);
        System.out.println(LocalDateTime.now());
        Thread.sleep(2000);
        System.out.println(LocalDateTime.now());

    }

    public static void  addNewBank(String bankName, double capital, LocalDate date, int employeesNum) {
        Bank bank = new Bank(bankName, capital,date,employeesNum);
         banks.put( bankName,bank );

    }

    public static void deleteBank(String bankName) {
        banks.remove(bankName);

    }
    public static void getBankInfo(String bankName){
        System.out.println(banks.get(bankName));
    }

}
