package com.mycompany.money;

public class Sum implements Expression{
    Money augend;
    Money addend;
    Sum(Money augend, Money addend){
        this.augend = augend;
        this.addend = addend;
    }
    public Money reduce(Bank bank, String to){
        int amount = augend.reduce(bank, to).amount + addend.reduce(bank, to).amount;
        return new Money(amount, to);
    }
}
