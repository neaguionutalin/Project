package com.m3c.ane;

public interface Client {
    int getClientId();
    void sendOrder(Object o);
    void setBalance(double balance);
    double getBalance(int clientId);
    void cancelOrder(Object o);
}
