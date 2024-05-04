package pro.sky.springdemocalculator.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.springdemocalculator.service.CalculateService;

@Service
public class CalculateServiceImpl implements CalculateService {

    public String getSum(Integer userNum1, Integer userNum2) {
        if (userNum1 == null || userNum2 == null) {
            return "Введите данные!";
        } else {
            return userNum1 + " + " + userNum2 + " = " + (userNum1 + userNum2);
        }
    }

    public String getDifference(Integer userNum1, Integer userNum2) {
        if (userNum1 == null || userNum2 == null) {
            return "Введите данные!";
        } else {
            return userNum1 + " - " + userNum2 + " = " + (userNum1 - userNum2);
        }
    }

    public String getMultiplication(Integer userNum1, Integer userNum2) {
        if (userNum1 == null || userNum2 == null) {
            return "Введите данные!";
        } else {
            return userNum1 + " * " + userNum2 + " = " + (userNum1 * userNum2);
        }
    }

    public String getDivision(Integer userNum1, Integer userNum2) {
        if (userNum1 == null || userNum2 == null) {
            return "Введите данные!";
        }
        if (userNum2 == 0) {
            return "На ноль делить нельзя!";
        } else {
            return userNum1 + " : " + userNum2 + " = " + (userNum1 / userNum2);
        }
    }
}
