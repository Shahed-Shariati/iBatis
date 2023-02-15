package com.sabapardazesh.tejaratipgspringapplication.service.dto;

import java.text.DecimalFormat;

/**
 * @author <a href="mailto:kamran.azizzadeh@avanoc.com">Kamran</a>
 * Date: May 14, 2009 Time: 11:44:59 AM
 */
public class BaseTransaction extends BaseObject {

    private String cardNumber;
    private String cvv2;
    private String pin2;
    private Long paymentId;
    private String p12;
    private String p13;
    private Long amount;
    private String expDate;
    private Long referenceNumber;
    DecimalFormat p12Format = new DecimalFormat("000000");
    DecimalFormat p13Format = new DecimalFormat("0000");
    private boolean billMerchant = false;
    private String emailAddress;
    private Integer resultCode;
    private int errorCode;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardBankCode() {
        return this.cardNumber.substring(0, 6);
    }

    public String getCvv2() {
        return cvv2;
    }

    public void setCvv2(String cvv2) {
        this.cvv2 = cvv2;
    }

    public String getPin2() {
        return pin2;
    }

    public void setPin2(String pin2) {
        this.pin2 = pin2;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public String getP12() {
        return p12Format.format(Integer.parseInt(this.p12));
    }

    public void setP12(String p12) {
        this.p12 = p12;
    }

    public String getP13() {
        return p13Format.format(Integer.parseInt(this.p13));
    }

    public void setP13(String p13) {
        this.p13 = p13;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public Long getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(Long referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public boolean isBillMerchant() {
        return billMerchant;
    }

    public void setBillMerchant(boolean billMerchant) {
        this.billMerchant = billMerchant;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

}
