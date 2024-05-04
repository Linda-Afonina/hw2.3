package pro.sky.springdemocalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.springdemocalculator.service.CalculateService;
import pro.sky.springdemocalculator.service.HelloService;

@RestController
@RequestMapping("calculator")
public class CalculatorController {
    private final HelloService helloService;
    private final CalculateService calculateService;

    public CalculatorController(HelloService helloService, CalculateService calculateService) {
        this.helloService = helloService;
        this.calculateService = calculateService;
    }

    @GetMapping
    public String helloInCalculator() {
        return helloService.helloInCalculator();
    }

    @RequestMapping(path = "/plus")
    public String getSum(@RequestParam(value = "num1", required = false) Integer userNum1,
                         @RequestParam(value = "num2", required = false) Integer userNum2) {
        return calculateService.getSum(userNum1, userNum2);
    }

    @RequestMapping(path = "minus")
    public String getDifference(@RequestParam(value = "num1", required = false) Integer userNum1,
                                @RequestParam(value = "num2", required = false) Integer userNum2) {
        return calculateService.getDifference(userNum1, userNum2);
    }

    @RequestMapping("/multiply")
    public String getMultiplication(@RequestParam(value = "num1", required = false) Integer userNum1,
                                    @RequestParam(value = "num2", required = false) Integer userNum2) {
        return calculateService.getMultiplication(userNum1, userNum2);
    }

    @RequestMapping("divide")
    public String getDivision(@RequestParam(value = "num1", required = false) Integer userNum1,
                              @RequestParam(value = "num2", required = false) Integer userNum2) {
        return calculateService.getDivision(userNum1, userNum2);
    }
}
