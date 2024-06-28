public class Calculator implements IDivideNum,IMultiplication,ISubtraction,ISumNum {

protected View view;



    @Override
    public int sumNum(int a, int b) {return a + b;}

    @Override
    public int subtractionNum(int a, int b) {
        if (a < b) 
        System.out.println(view.printExeptionSubtraction());
        return a - b;
    }

    @Override
    public int multiplicationNum(int a, int b) {return a * b;}

    @Override
    public int divideNum(int a, int b) {
        if ( a < b )view.printExeptionDivide(); 
        if (b == 0) view.printExeptionDivide0();
        return a / b;
        

    }
    
}
