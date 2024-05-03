package pro.sky.springdemocalculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final IHelloService helloService;
    private final CalculateService calculateService;

    public HelloController(IHelloService helloService, CalculateService calculateService) {
        this.helloService = helloService;
        this.calculateService = calculateService;
    }

    @RequestMapping()
    public String hello() {
        return helloService.hello();
    }

    @RequestMapping(path = "/calculator")
    public String helloInCalculator() {
        return helloService.helloInCalculator();
    }

    @RequestMapping(path = "/calculator/plus")
    public String getSum(@RequestParam(value = "num1", required = false) Integer userNum1,
                         @RequestParam(value = "num2", required = false) Integer userNum2) {
        return calculateService.getSum(userNum1, userNum2);
    }

    @RequestMapping(path = "/calculator/minus")
    public String getDifference(@RequestParam(value = "num1", required = false) Integer userNum1,
                                @RequestParam(value = "num2", required = false) Integer userNum2) {
        return calculateService.getDifference(userNum1, userNum2);
    }

    @RequestMapping(path = "/calculator/multiply")
    public String getMultiplication(@RequestParam(value = "num1", required = false) Integer userNum1,
                                    @RequestParam(value = "num2", required = false) Integer userNum2) {
        return calculateService.getMultiplication(userNum1, userNum2);
    }

    @RequestMapping(path = "/calculator/divide")
    public String getDivision(@RequestParam(value = "num1", required = false) Integer userNum1,
                              @RequestParam(value = "num2", required = false) Integer userNum2) {
        return calculateService.getDivision(userNum1, userNum2);
    }
}
