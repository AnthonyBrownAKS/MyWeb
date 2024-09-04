package com.anthony.hmweb.pojo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class simplePojo {

    public class Address {
        private String province;
        private String city;
    }

    public class User {
        private String name;
        private Integer age;
        private Address address;

    }

    @RequestMapping("/ComplexPojo")
    public String ComplexPojo(User user){
        System.out.println(user);
        return "OK";
    }


}
