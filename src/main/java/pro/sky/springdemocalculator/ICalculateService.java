package pro.sky.springdemocalculator;

public interface ICalculateService {
    String getSum(Integer userNum1, Integer userNum2);

    String getDifference(Integer userNum1, Integer userNum2);

    String getMultiplication(Integer userNum1, Integer userNum2);

    String getDivision(Integer userNum1, Integer userNum2);
}
