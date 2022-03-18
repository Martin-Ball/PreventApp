package com.martin.preventapp.ui.orders_sent.fragment_orders;

public class InfoOrders {

    // variables for our course
    // name and description.
    private String company;
    private String client;
    private String dateAndHour;

    // creating constructor for our variables.
    public InfoOrders(String company, String client, String dateAndHour) {
        this.company = company;
        this.client = client;
        this.dateAndHour = dateAndHour;
    }

    // creating getter and setter methods.
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getDateAndHour(){
        return dateAndHour;
    }

    public void setDateAndHour(String dateAndHour) {
        this.dateAndHour = dateAndHour;
    }
}
