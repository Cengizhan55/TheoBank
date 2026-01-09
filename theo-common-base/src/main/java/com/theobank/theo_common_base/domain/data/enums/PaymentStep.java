package com.theobank.theo_common_base.domain.data.enums;

public enum PaymentStep {
    INITIATED,
    FRAUD_CHECK_STARTED,
    FRAUD_CHECK_PASSED,
    FRAUD_CHECK_FAILED,
    BALANCE_CHECK_STARTED,
    BALANCE_CHECK_OK,
    BALANCE_CHECK_FAILED,
    PAYMENT_STARTED,
    PAYMENT_COMPLETED,
    PAYMENT_FAILED
}

