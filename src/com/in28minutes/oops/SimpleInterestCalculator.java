package com.in28minutes.oops;

import java.math.BigDecimal;

public class SimpleInterestCalculator {

    private BigDecimal principal;
    private BigDecimal interest;

    public SimpleInterestCalculator(String principal, String interest) {
        this.principal = new BigDecimal(principal);
        this.interest = new BigDecimal(interest);
    }

    public BigDecimal calculateTotalValue(int years){
        BigDecimal totalValue =
                principal.add(principal).add(principal.multiply(interest).multiply(BigDecimal.valueOf(years)));
        return totalValue;
    }
}
