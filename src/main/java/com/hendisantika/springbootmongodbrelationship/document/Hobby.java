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
 * Time: 03:54
 * To change this template use File | Settings | File Templates.
 */
@Getter
@Setter
@ToString
public class Hobby {

    private String name;

    public Hobby(final String name) {
        this.name = name;
    }
}