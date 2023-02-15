package com.sabapardazesh.tejaratipgspringapplication.service.dto;

public class Account {
    private String account;
    private Boolean isDefault;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }
}
