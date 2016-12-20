package com.stockholm.api.login;

public class ResetPwdReq {

    private String phoneNumber;
    private String password;

    public ResetPwdReq(String phoneNumber, String password) {
        setPhoneNumber(phoneNumber);
        setPassword(password);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
