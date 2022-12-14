package com.uottawa.seg2105.group10.backend;

import java.util.Map;

public class Client extends User {

    private String address, ccNumber, ccHolderName, expiryDate, cvc;

    /**
     * Constructor for Firebase access.
     * Do not use locally unless you want an empty client user.
     */
    public Client() {
        super("Client Class", "", "", "", "", "Client", "");
    }

    public Client(Map<String, String> data) {
        super("Client Class",
                data.get("firstName"),
                data.get("lastName"),
                data.get("email"),
                data.get("password"),
                "Client",
                data.get("uid"));
        setCC(data.get("ccNum"),
                data.get("nameOnCard"),
                data.get("expDate"),
                data.get("cvcField"));
    }

    // Setter method for Credit Card information
    public void setCC(String num, String name, String expiry, String cvc) {
        if (num == null || name == null || expiry == null || cvc == null) return;
        ccNumber = num;
        ccHolderName = name;
        expiryDate = expiry;
        this.cvc = cvc;
        //this.updateFireStore();
    }

    // Getter methods for testing purposes :)
    public String getCcNumber() {
        return ccNumber;
    }

    public String getCcHolderName() {
        return ccHolderName;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getCvc() {
        return cvc;
    }


}
