package com.thoughtworks.moveFeature;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTest {
    @Test
    public void should_return_charge_when_not_overdrawn(){
        Account account = new Account();
        account.setDaysOverdrawn(0);
        assertThat(account.bankCharge(),is(4.5));
    }

    @Test
    public void should_return_charge_when_has_overdrawn_with_normal_type(){
        Account account = new Account();
        account.setDaysOverdrawn(1);
        account.setType(new AccountType(false));
        assertThat(account.bankCharge(), is(6.25));
    }
    @Test
    public void should_return_charge_when_has_overdrawn_less_than_7_days_with_premium_type(){
        Account account = new Account();
        account.setDaysOverdrawn(1);
        account.setType(new AccountType(true));
        assertThat(account.bankCharge(), is(14.5));
    }
    @Test
    public void should_return_charge_when_has_overdrawn_greater_than_7_days_with_premium_type(){
        Account account = new Account();
        account.setDaysOverdrawn(8);
        account.setType(new AccountType(true));
        assertThat(account.bankCharge(), is(15.35));
    }
}
