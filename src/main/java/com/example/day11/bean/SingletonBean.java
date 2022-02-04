package com.example.day11.bean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
@Scope(value="prototype")
public class SingletonBean {
    private int num1;
    private int num2;
}
