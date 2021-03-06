import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println ("Введите число для проверки, является ли оно степенью двойки или нет: ");
        Scanner in = new Scanner (System.in);
        int x = in.nextInt();


        if ((x > 0) && (( x & ( x - 1 )) == 0)) {
            System.out.println ("Число является степенью двойки");
        } else {
            System.out.println ("Число не является степенью двойки");
        }

        // Принцип реализации программы, которая будет выполнять проверку – является
        // ли указанное число степенью двойки или нет, заключается в том, что в числе 2
        // в степени x, расматривая его побитовое отображение представляется как 1
        // и остальные биты 0. А число перед ним в побитовом отображении выглядят как 0 и
        // далее идут 1. Если к таким числам применить побитовую операцию И ( & ),
        // то результат должен получиться 0. Рассмотрим пример, возмем два числа: число
        // 64 является степенью двойки, в битовом состоянии выглядит как 1000000 и число
        // 63 в битовом состоянии выглядит как 0111111. В итоге получаем следующее
        // выражение (( 64 & ( 64 - 1 )) далее (( 64 & ( 63 )) == 0))далее видим знак (&)-
        // означающий побитовую операцию ( & - И )в побитовом виде
        // ((1000000 & 0111111) == 0) на выходе получаем (0000000 = 0), далее если
        // после выполнения побитового выражения И (&) будет (0000000 = 0) условие будет (true) о число
        // и число будет является степенью двойки, если же не равно 0, то (false) и число
        // не будет является степенью двойки.
    }
}
