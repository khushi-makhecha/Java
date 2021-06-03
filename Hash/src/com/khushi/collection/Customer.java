package com.khushi.collection;

public class Customer implements Comparable<Customer>{
    private String name;
    private String eMail;

    public Customer(String name, String eMail) {
        this.name = name;
        this.eMail = eMail;
    }

    @Override
    public int compareTo(Customer o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString(){
        return name;
    }

    public String getEmail() {
        return eMail;
    }
}
