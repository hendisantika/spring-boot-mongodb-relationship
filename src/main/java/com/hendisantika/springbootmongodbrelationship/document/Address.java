package com.hendisantika.springbootmongodbrelationship.document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-mongodb-relationship
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-01-15
 * Time: 03:53
 * To change this template use File | Settings | File Templates.
 */
@Getter
@Setter
@ToString
public class Address {

    private String addressLineOne;
    private String addressLineTwo;
    private String city;
    private String country;

    public Address(
            final String addressLineOne,
            final String addressLineTwo,
            final String city,
            final String country) {
        this.addressLineOne = addressLineOne;
        this.addressLineTwo = addressLineTwo;
        this.city = city;
        this.country = country;
    }
}