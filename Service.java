import java.util.Scanner;

public class Service {
    protected View view;
    private Scanner scanner = new Scanner(System.in);
    private String result = " ";
    private int num1;
    private int num2;
    protected Calculator calculator;

    public void upProgram(){
        view.printOperation();
        result = scanner.nextLine();
        if (result == "+") {
           view.enterNum();
           num1 = scanner.nextInt();
           view.enterNum();
           num2 = scanner.nextInt();
           calculator.sumNum(num2, num1);
        }else 
        view.tryAgain();
        upProgram();

        if (result == "-") {
            view.enterNum();
            num1 = scanner.nextInt();
            view.enterNum();
            num2 = scanner.nextInt();
            calculator.subtractionNum(num2, num1);
         }else 
         view.tryAgain();
         upProgram();

         if (result == "/") {
            view.enterNum();
            num1 = scanner.nextInt();
            view.enterNum();
            num2 = scanner.nextInt();
            calculator.divideNum(num2, num1);
         }else 
         view.tryAgain();
         upProgram();

         if (result == "*") {
            view.enterNum();
            num1 = scanner.nextInt();
            view.enterNum();
            num2 = scanner.nextInt();
            calculator.multiplicationNum(num2, num1);
         }else 
         view.tryAgain();
         upProgram();


    }
}
