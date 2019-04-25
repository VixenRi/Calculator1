import java.util.Scanner;

public class Kalkylator {
    static Scanner scaner = new Scanner(System.in);

    public static void main(String[]args){
        int nam1 = getInt();
        int nam2 = getInt();
        char simvol = getOperation();
        int ravno = calc(nam1,nam2,simvol);
        System.out.println("Мой ответ: "+ ravno);
    }
    public static int getInt(){
        System.out.println("Введите число: ");
        int nam;
        if (scaner.hasNextInt()){//hasNextInt() — метод проверяет, является ли следующая порция введенных данных числом, или нет (возвращает, соответственно, true или false).
           nam = scaner.nextInt(); //Метод nextInt() считывает и возвращает введенное число. В нашей программе он используется для того, чтобы присвоить значение переменной nam
        } else {
            System.out.println("Вы допустили ошибку. Не переживайте. Попробуйте еще раз.");
            scaner.next();// next()перемещает scaner ниже, в командной строке
            nam = getInt(); // Начинает этот метод заново
        }
        return nam;
    }
    public static char getOperation(){
        System.out.println("Введите операцию: ");
        char simvol;
        if (scaner.hasNext()){
            simvol = scaner.next().charAt(0);// charAt возвращает символ из массива строки по указанному индексу.
            } else {
            System.out.println("Вы допустили ошибку. Не переживайте. Попробуйте еще раз.");
            scaner.next();
            simvol = getOperation();
        }
        return simvol;
    }
    public static int calc(int nam1, int nam2, char simvol){
        int result;
        switch (simvol) {//Подобие точки входа, только в кейс(проверяет по определенному типу)
            case '+':
                result = nam1 + nam2;
                break;
            case '-':
                result = nam1 - nam2;
                break;
            default: // Что нужно делать если символ не верный
                System.out.println("Операция не может быть выполнена.Попробуйте ввести заново:");
                result = calc(nam1,nam2,simvol);
        }
        return result;
    }


}
