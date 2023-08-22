package com.sonarsource.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DataUtils {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public String getAddress(String name) {
        String addr;
        System.out.println("Name parameter: \"" + name + "\"");
        addr = jdbcTemplate.queryForObject("SELECT address FROM people WHERE name = '" + name + "'",
                String.class);
        return addr;
    }
}