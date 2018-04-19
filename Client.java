package com.m3c.ane;

public interface Client {
    int getClientId();
    void sendClientOrder(Object o);
    void setClientBalance(double balance);
    double getclientBalance(int clientId);
    void cancelClientOrder(Object o);
}
