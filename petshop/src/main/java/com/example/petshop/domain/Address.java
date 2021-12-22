// 13주차 마지막 과정
package com.example.petshop.domain;

import javax.persistence.Embeddable;

// Value Object
@Embeddable
public class Address {

    String detail;
    String zipcode;

    public String getDetail() {
        return detail;
    }
    public void setDetail(String detail) {
        this.detail = detail;
    }
    public String getZipcode() {
        return zipcode;
    }
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
