/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo Pereira Kurpel
 */
public class Junit {

    public static String multiplo(int n) {
        String s = "";

        if (n % 3 == 0 && n % 5 == 0) {
            s = "JUnit";
        } else if (n % 5 == 0) {
            s = "Unit";
        } else if (n % 3 == 0) {
            s = "J";
        } else {
            s = String.valueOf(n);
        }
        return s;
    }

    public static String multiploDe3(int n) {
        String s = String.valueOf(n);
        if (n % 3 == 0) {
            s = "J";
        }
        return s;
    }

    public static String multiploDe5(int n) {
        String s = String.valueOf(n);
        if (n % 5 == 0) {
            s = "Unit";
        }
        return s;
    }

    public static String multiploDe3Y5(int n) {
        String s = String.valueOf(n);
        if (n % 3 == 0 && n % 5 == 0) {
            s = "JUnit";
        }
        return s;
    }

}
