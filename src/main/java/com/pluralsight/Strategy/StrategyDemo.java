package com.pluralsight.Strategy;

public class StrategyDemo {

    public static void main(String[] args) {
        CreditCard amexCard = new CreditCard(new AmexStrategy());

        amexCard.setNumber("379185883464283");
        amexCard.setDate("04/2020");
        amexCard.setCvv("123");

        System.out.println("Is amex valid: " + amexCard.isValid());

        CreditCard visaCard = new CreditCard(new VisaStrategy());

        visaCard.setNumber("4791858834642833");
        visaCard.setDate("05/2020");
        visaCard.setCvv("123");

        System.out.println("Is visa valid: " + visaCard.isValid());

    }
}
