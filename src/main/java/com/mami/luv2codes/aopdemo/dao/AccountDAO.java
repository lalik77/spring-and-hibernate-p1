package com.mami.luv2codes.aopdemo.dao;

import com.mami.luv2codes.aopdemo.Account;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountDAO {

    private String name;
    private String serviceCode;



    public List<Account> findAccounts () {


        List<Account> myAccounts = new ArrayList<>();
        Account temp1 = new Account("M","Plat");
        Account temp2 = new Account("L","Gld");
        Account temp3 = new Account("J","Slvr");

        myAccounts.add(temp1);
        myAccounts.add(temp2);
        myAccounts.add(temp3);

        return myAccounts;
    }

    public void addAccount (Account theAccount,boolean vipFlag) {

        System.out.println(getClass() + ": DOING MY DB WORK : ADDING ACCOUNT");
    }


    public String getName() {

        System.out.println(getClass() + ": in getName");
        return name;
    }

    public void setName(String name) {
        System.out.println(getClass() + ": in setName");
        this.name = name;
    }

    public String getServiceCode() {
        System.out.println(getClass() + ": in getServiceCode");
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        System.out.println(getClass() + ": in setServiceCode");
        this.serviceCode = serviceCode;
    }
}
