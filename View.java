public class View {
    public String printExeptionSubtraction(){
        return "Ошибка: Вы из меньшего вычитаете большее.";
    }

    public String printExeptionDivide(){
        return "Ошибка: Вы меньшее делите на большее.";
    }
    public String printExeptionDivide0(){
        return "Ошибка: На ноль делить нельзя.";
    }

    public void  printOperation(){
        System.out.println( "Выберите операцию: +,-,/,* ");

    }
    
    public String enterNum(){
        return "Введите число: ";
    }

    public String tryAgain(){
        return "Повторите попытку.";
    }
    
}
