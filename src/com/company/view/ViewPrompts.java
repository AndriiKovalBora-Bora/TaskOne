package com.company.view;

import java.sql.SQLTransactionRollbackException;

public interface ViewPrompts {
    String OUR_DERIVATIVE = "our.derivative";
    String TOTAL_PRICE = "total.price";
    String SORTED_BY_INCREASING_RISK = "sorted.by.increasing.risk";
    String ENTER_PAYMENT_FROM = "enter.payment.from";
    String ENTER_PAYMENT_TO = "enter.payment.to";
    String ENTER_COMPENSATION_FROM = "enter.compensation.from";
    String ENTER_COMPENSATION_TO = "enter.compensation.to";
    String TOTAL_PAYMENT = "total.payment";
    String INPUT_NUMBER = "input.number";
    String WRONG_INPUT_NUMBER = "wrong.input.your.date.is.not.a.integer.number.please.try.again";
    String NUMBER_OUT_OF_BOUNDS = "wrong.input";
    String TO = "to";
    String YOUR_REQUEST = "your.request";
}
