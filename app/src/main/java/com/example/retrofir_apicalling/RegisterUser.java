package com.example.retrofir_apicalling;


public class RegisterUser {


    private Integer connection;

    private Integer result;

    public Integer getConnection() {
        return connection;
    }

    public void setConnection(Integer connection) {
        this.connection = connection;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "RegisterData{" +
                "connection=" + connection +
                ", result=" + result +
                '}';
    }
}