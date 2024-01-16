package com.ohgiraffers.section04.constructor;

import java.util.Date;

public class User {

        private String id;
        private String pwd;
        private String name;
        private java.util.Date enrollDate;

    public User(String id, String pwd, String name, Date enrollDate) {
            this.id = id;
            this.pwd = pwd;
            this.name = name;
            this.enrollDate = enrollDate;
    }

    public User() {

    }

    public String forInformation(){
            return this.id + ", " + this.pwd + ", " + this.name + ", " + this.enrollDate;
        }
}
