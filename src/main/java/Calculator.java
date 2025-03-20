public class Calculator {

    public int add(int firstNum, int secondNum)
    {
        long result = (long) firstNum + secondNum;
        if(result > Integer.MAX_VALUE)
        {
            throw new IllegalArgumentException("This value is too big");
        }
        return (int) result;
    }

    public int divide(int firstNum, int secondNum){

        if(secondNum == 0){
            throw new ArithmeticException("/ by zero not allowed");
        }
        int result = firstNum / secondNum;


        return result;
    }

}


