package pro.sky.springdemocalculator;

import org.springframework.stereotype.Service;

@Service
public class HelloService implements IHelloService {

    public String hello() {
        return "Это калькулятор";
    }

    public String helloInCalculator() {
        return "Добро пожаловать в калькулятор";
    }
}
