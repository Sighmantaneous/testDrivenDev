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

    public int multiply(int firstNum, int secondNum){
        long result = (long)firstNum * secondNum;
        if(result > Integer.MAX_VALUE){
            throw new UnsupportedOperationException("This result will be bigger than allow int size");
        }
        return(int) result;
    }

}


