package com.ironyard.data;

/**
 * Created by jasonskipper on 1/11/17.
 */
public class Person {
    private String firstName;
    private String lastName;
    private int investAmount;
    private int investReturn;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String aFirst) {
        this.firstName = aFirst;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getInvestAmount() {
        return investAmount;
    }

    public void setInvestAmount(int xyz) {
        this.investAmount = xyz;
    }
    public int getInvestReturn() {
        return investReturn;
    }
    public void setInvestReturn (int abc) {
        this.investReturn = abc;
    }
}