package com.hendisantika.springbootmongodbrelationship.repository;

import com.hendisantika.springbootmongodbrelationship.document.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-mongodb-relationship
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-01-15
 * Time: 03:55
 * To change this template use File | Settings | File Templates.
 */
public interface PersonRepository extends MongoRepository<Person, String> {

    List<Person> findByFirstName(final String firstName);

    @Query("{'address.country': ?0}")
    List<Person> findByCountry(final String country);
}