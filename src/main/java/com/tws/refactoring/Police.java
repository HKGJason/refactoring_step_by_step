package com.tws.refactoring;

public class Police {
    private final int lowestAllowedAge = 18;
    public boolean checkDriver(Driver driver) {

        if(driver.getAge() >= lowestAllowedAge) return true;
        else return false;
    }

}
