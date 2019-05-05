package com.hello.springbootproject.model;

/******
 *Name: Account
 *User: Administrator
 *Date: 2019/5/5
 **/
public class Account {

    private String id;
    private String username;
    private String password;

    public Account() {
    }

    public Account(String id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Account account = (Account)o;

        if (id != null ? !id.equals(account.id) : account.id != null)
            return false;
        if (username != null ? !username.equals(account.username) : account.username != null)
            return false;
        return password != null ? password.equals(account.password) : account.password == null;
    }

    @Override public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
