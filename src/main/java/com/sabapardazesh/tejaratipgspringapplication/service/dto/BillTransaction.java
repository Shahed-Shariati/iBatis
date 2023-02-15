package com.sabapardazesh.tejaratipgspringapplication.service.dto;

/**
 * @author <a href="mailto:kamran.azizzadeh@avanoc.com">Kamran</a>
 *         <p/>
 *         Date: Sep 27, 2008
 *         Time: 10:28:00 AM
 */
public class BillTransaction extends BaseTransaction {
    private String type;
    private String billNumber;
    private String billPaymentId;
    private String userIP;
    private String merchantId;
    private Integer level ;
    private Integer Status;
    private String description;
    private String shetabControlCode;
    private String p48;
    private Boolean isGroupBill = false;
    private String p98;

    public String getShetabControlCode() {
        return shetabControlCode;
    }

    public void setShetabControlCode(String shetabControlCode) {
        this.shetabControlCode = shetabControlCode;
    }

    public Integer getIsoResultCode() {
        return super.getResultCode();
    }

    public void setIsoResultCode(Integer isoResultCode) {
        super.setResultCode(isoResultCode);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }

    public String getBillPaymentId() {
        return billPaymentId;
    }

    public void setBillPaymentId(String billPaymentId) {
        this.billPaymentId = billPaymentId;
    }

    public String getUserIP() {
        return userIP;
    }

    public void setUserIP(String userIP) {
        this.userIP = userIP;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer status) {
        Status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getP48() {
        return p48;
    }

    public void setP48(String p48) {
        this.p48 = p48;
    }

    public Boolean getGroupBill() {
        return isGroupBill;
    }

    public void setGroupBill(Boolean groupBill) {
        isGroupBill = groupBill;
    }

    public String getP98() {
        return p98;
    }

    public void setP98(String p98) {
        this.p98 = p98;
    }
}
