package com.tws.refactoring;

public class Police {
    private final int lowestLegalAge = 18;
    public boolean checkDriverAgeIsLegal(Driver driver) {

        if(driver.getAge() >= lowestLegalAge) return true;
        else return false;
    }

}
