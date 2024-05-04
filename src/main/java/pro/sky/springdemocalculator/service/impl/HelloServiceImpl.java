package pro.sky.springdemocalculator.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.springdemocalculator.service.HelloService;

@Service
public class HelloServiceImpl implements HelloService {

    public String helloInCalculator() {
        return "Добро пожаловать в калькулятор";
    }
}
