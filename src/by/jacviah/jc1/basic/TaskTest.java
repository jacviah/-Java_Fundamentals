package by.jacviah.jc1.basic;

import java.util.Scanner;

public class TaskTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    out:    while (true) {
            System.out.print("Enter task number (0 - exit): ");
            while (!sc.hasNext()) {
                System.out.println("Enter task number:");
                sc.next();
            }
            String number = sc.next();

            switch (number) {
                case "0":
                    System.out.println("Exit");
                    break out;
                case "l8":
                    by.jacviah.jc1.basic.Lineal8.calculate();
                    break;
                case "l10":
                    Lineal10.calculate();
                    break;
                case "l13":
                    Lineal13.calculate();
                    break;
                case "l16":
                    Lineal16.calculate();
                    break;
                case "l17":
                    Lineal17.calculate();
                    break;
                case "l21":
                    Lineal21.calculate();
                    break;
                case "l22":
                    Lineal22.calculate();
                    break;
                case "l37":
                    Lineal37.calculate();
                    break;
                case "b28":
                    Branch28.calculate();
                    break;
                case "b29":
                    Branch29.calculate();
                    break;
                case "b31":
                    Branch31.calculate();
                    break;
                case "lo8":
                    Loop8.calculate();
                    break;
                case "lo10":
                    Loop10.calculate();
                    break;
                case "lo12":
                    Loop12.calculate();
                    break;
                case "lo18":
                    Loop18.calculate();
                    break;
                case "lo23":
                    Loop23.calculate();
                    break;
                case "lo24":
                    Loop24.calculate();
                    break;
                case "lo26":
                    Loop26.calculate();
                    break;
                case "lo27":
                    Loop27.calculate();
                    break;
                case "lo28":
                    Loop28.calculate();
                    break;
                case "lo29":
                    Loop29.calculate();
                    break;
                case "lo30":
                    Loop30.calculate();
                    break;
                case "lo31":
                    Loop31.calculate();
                    break;
                case "lo32":
                    Loop32.calculate();
                    break;
                case "lo36":
                    Loop36.calculate();
                    break;
                case "lo37":
                    Loop37.calculate();
                    break;
                case "lo38":
                    Loop38.calculate();
                    break;
                case "lo39":
                    Loop39.calculate();
                    break;
                case "lo40":
                    Loop40.calculate();
                    break;
                case "dec1":
                    Dec1.calculate();
                    break;
                case "dec2":
                    Dec2.calculate();
                    break;
                case "dec3":
                    Dec3.calculate();
                    break;
                case "dec4":
                    Dec4.calculate();
                    break;
                case "dec5":
                    Dec5.calculate();
                    break;
                case "dec6":
                    Dec6.calculate();
                    break;
                case "dec7":
                    Dec7.calculate();
                    break;
                case "dec8":
                    Dec8.calculate();
                    break;
                case "dec9":
                    Dec9.calculate();
                    break;
                case "dec10":
                    Dec10.calculate();
                    break;
                case "dec11":
                    Dec11.calculate();
                    break;
                case "dec12":
                    Dec12.calculate();
                    break;
                case "dec13":
                    Dec13.calculate();
                    break;
                case "dec14":
                    Dec14.calculate();
                    break;
                case "dec15":
                    Dec15.calculate();
                    break;
                case "dec16":
                    Dec16.calculate();
                    break;
                case "dec17":
                    Dec17.calculate();
                    break;
                case "dec18":
                    Dec18.calculate();
                    break;
                case "dec19":
                    Dec19.calculate();
                    break;
                case "dec20":
                    Dec20.calculate();
                    break;
                case "arr9":
                    Arr9.calculate();
                    break;
                case "arr12":
                    Arr12.calculate();
                    break;
                case "arr13":
                    Arr13.calculate();
                    break;
                case "arr16":
                    Arr16.calculate();
                    break;
                case "arr17":
                    Arr17.calculate();
                    break;
                case "arr18":
                    Arr18.calculate();
                    break;
                case "arr19":
                    Arr19.calculate();
                    break;
                case "arr20":
                    Arr20.calculate();
                    break;
                case "arr2_1":
                    Arr2_1.calculate();
                    break;
                case "arr2_2":
                    Arr2_2.calculate();
                    break;
                case "arr2_3":
                    Arr2_3.calculate();
                    break;
                case "arr2_4":
                    Arr2_4.calculate();
                    break;
                case "arr2_6":
                    Arr2_6.calculate();
                    break;
                case "arr2_7":
                    Arr2_7.calculate();
                    break;
                case "arr2_8":
                    Arr2_8.calculate();
                    break;
                case "arrArr11":
                    ArrArr11.calculate();
                    break;
                case "arrArr14":
                    ArrArr14.calculate();
                    break;
                case "arrArr15":
                    ArrArr15.calculate();
                    break;
                case "arrArr16":
                    ArrArr16.calculate();
                    break;
                case "arrArr17":
                    ArrArr17.calculate();
                    break;
                case "arrArr18":
                    ArrArr18.calculate();
                    break;
                case "arrArr19":
                    ArrArr19.calculate();
                    break;
                case "arrArr20":
                    ArrArr20.calculate();
                    break;
                case "arrArr21":
                    ArrArr21.calculate();
                    break;
                case "arrArr22":
                    ArrArr22.calculate();
                    break;
                case "arrArr26":
                    ArrArr26.calculate();
                    break;
                case "arrArr29":
                    ArrArr29.calculate();
                    break;
                case "arrArr30":
                    ArrArr30.calculate();
                    break;
                case "arrArr31":
                    ArrArr31.calculate();
                    break;
                case "arrArr34":
                    ArrArr34.calculate();
                    break;
                case "arrArr36":
                    ArrArr36.calculate();
                    break;
                case "arrArr37":
                    ArrArr37.calculate();
                    break;
                case "arrArr39":
                    ArrArr39.calculate();
                    break;
                case "arrArr40":
                    ArrArr40.calculate();
                    break;
                default:
                    System.out.println("Task is not resolved");
                    break;
            }
        }

    }
}
