package com.hkizilbulak.springaoparound.service;

import org.springframework.stereotype.Service;

@Service
public class BankService {

    public void displayBalance(String accNum) {
        System.out.println("Inside method displayBalance()");

        if(accNum == null) {
            System.out.println("The account not found");
        } else {
            System.out.println("Total balance of the account: 100 TL");
        }

    }
}
