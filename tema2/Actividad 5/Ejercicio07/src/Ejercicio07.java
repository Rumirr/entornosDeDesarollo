
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author horabaixa
 */
public class Ejercicio07 {

    // De dicimal a nńumeros romanos
    public String Romanos(int num) {
        int x;
        int mil, cent, dece, unid;
        mil = (num / 1000);
        x = num % 1000;
        cent = x / 100;
        x = num % 100;
        dece = x / 10;
        unid = num % 10;
        String numRomano = "";
        switch (mil) {
            case 1:
                numRomano = numRomano + "M";
                break;
            case 2:
                numRomano = numRomano + "MM";
                break;
            case 3:
                numRomano = numRomano + "MMM";
                break;
        }
        switch (cent) {
            case 1:
                numRomano = numRomano + "C";
                break;
            case 2:
                numRomano = numRomano + "CC";
                break;
            case 3:
                numRomano = numRomano + "CCC";
                break;
            case 4:
                numRomano = numRomano + "CD";
                break;
            case 5:
                numRomano = numRomano + "D";
                break;
            case 6:
                numRomano = numRomano + "DC";
                break;
            case 7:
                numRomano = numRomano + "DCC";
                break;
            case 8:
                numRomano = numRomano + "DCCC";
                break;
            case 9:
                numRomano = numRomano + "CM";
                break;
        }
        switch (dece) {
            case 1:
                numRomano = numRomano + "X";
                break;
            case 2:
                numRomano = numRomano + "XX";
                break;
            case 3:
                numRomano = numRomano + "XXX";
                break;
            case 4:
                numRomano = numRomano + "XL";
                break;
            case 5:
                numRomano = numRomano + "L";
                break;
            case 6:
                numRomano = numRomano + "LX";
                break;
            case 7:
                numRomano = numRomano + "LXX";
                break;
            case 8:
                numRomano = numRomano + "LXXX";
            case 9:
                numRomano = numRomano + "XC";
                break;
        }
        switch (unid) {
            case 1:
                numRomano = numRomano + "I";
                break;
            case 2:
                numRomano = numRomano + "II";
                break;
            case 3:
                numRomano = numRomano + "III";
                break;
            case 4:
                numRomano = numRomano + "IV";
                break;
            case 5:
                numRomano = numRomano + "V";
                break;
            case 6:
                numRomano = numRomano + "VI";
                break;
            case 7:
                numRomano = numRomano + "VII";
                break;
            case 8:
                numRomano = numRomano + "VIII";
                break;
            case 9:
                numRomano = numRomano + "IX";
                break;
        }
        return numRomano;
    }

    // de números romanos a números decimales
    public int numEntero(String numRomano) {
        if (numRomano == null || numRomano.length() == 0) {
            return 0;
        }

        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int length = numRomano.length();
        int result = romanValues.get(numRomano.charAt(length - 1));

        for (int i = length - 2; i >= 0; i--) {
            if (romanValues.get(numRomano.charAt(i)) >= romanValues.get(numRomano.charAt(i + 1))) {
                result += romanValues.get(numRomano.charAt(i));
            } else {
                result -= romanValues.get(numRomano.charAt(i));
            }
        }

        return result;
    }

    // de euros a dolares
    public float dolar(float euro) {
        return euro * 1.14F;
    }

    // de dolar a euro
    public float euro(float dolar) {
        return dolar * 0.88F;
    }

}
