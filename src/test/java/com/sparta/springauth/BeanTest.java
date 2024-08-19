package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {

    // Food 인터페이스의 구현체가 Bean에 하나 이상 등록되어있어서 원하는 구현체를 명시해줘야함
    // food X
    // pizza O
    // chicken O
    @Autowired
    Food pizza;

    @Autowired
    Food chicken;

    @Test
    @DisplayName("test")
    void test1() {
        food.eat();
    }

    // Primary annotation 이 적용된 구현체
    @Autowired
    Food food;

    @Test
    @DisplayName("test")
    void test2() {
        food.eat();
    }

    @Autowired
    @Qualifier("pizza")
    Food food1;

    @Test
    @DisplayName("test")
    void test3() {
        food1.eat();
    }
}
