package com.in28minutes.oops;

import java.math.BigDecimal;

public class SimpleInterestCalculator {

    private BigDecimal principal;
    private BigDecimal interest;

    public SimpleInterestCalculator(String principal, String interest) {
        this.principal = new BigDecimal(principal);
        this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
    }

    public BigDecimal calculateTotalValue(int years){
        BigDecimal yearsBigDecimal = new BigDecimal(years);
        return principal.add(principal.multiply(interest).multiply(yearsBigDecimal));
    }
}
