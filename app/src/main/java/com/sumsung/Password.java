package com.sumsung;

import android.util.Log;

public class Password {
    public Boolean isNumbers;
    public Boolean isCaps;
    public Boolean isSimb;
    public String result = "";

    public static String numbers = "1234567890";
    public static String simbls = "!@#$%^&*()+-";

    public Password(Boolean isNumbers, Boolean isCaps, Boolean isSimb) {
        this.isNumbers = isNumbers;
        this.isCaps = isCaps;
        this.isSimb = isSimb;
    }

    public String generate() {
        /*
        Log.d(""+(isNumbers && isCaps && isSimb),
                "");
        System.out.println(isNumbers && isCaps && isSimb);
        */
        if (isNumbers && isCaps && isSimb) {
            int[] s = new int[8];
            for (int i = 0; i < 8; i++) {
                s[i] = (int) (Math.random() * 3);
            }
            for (int i = 0; i < 8; i++) {

                if (s[i] == 0) {
                    String a = "" + numbers.charAt((int) (Math.random() * 10));
                    result += a;
                } else if (s[i] == 1) {
                    char a = (char) ('A' + (int) (Math.random() * 27));
                    result += a;
                } else {
                    char a = simbls.charAt((int) (Math.random() * 10));
                    result += a;
                }
            }

        }
        else if (isNumbers && isCaps) {
            int[] s = new int[8];
            for (int i = 0; i < 8; i++) {
                s[i] = (int) (Math.random() * 2);
            }
            for (int i = 0; i < 8; i++) {
                if (s[i] == 0) {
                    String a = "" + numbers.charAt((int) (Math.random() * 10));
                    result += a;
                } else if (s[i] == 1) {
                    char a = (char) ('A' + (int) (Math.random() * 27));
                    result += a;
                }
            }
        }
        else if (isCaps && isSimb) {
            int[] s = new int[8];
            for (int i = 0; i < 8; i++) {
                s[i] = (int) (Math.random() * 2);
            }
            for (int i = 0; i < 8; i++) {
                if (s[i] == 0) {
                    char a = (char) ('A' + (int) (Math.random() * 27));
                    result += a;
                } else {
                    char a = simbls.charAt((int) (Math.random() * 10));
                    result += a;
                }
            }
        }
        else if (isNumbers && isSimb) {
            int[] s = new int[8];
            for (int i = 0; i < 8; i++) {
                s[i] = (int) (Math.random() * 3);
            }
            for (int i = 0; i < 8; i++) {

                if (s[i] == 0) {
                    String a = "" + numbers.charAt((int) (Math.random() * 10));
                    result += a;
                } else {
                    char a = simbls.charAt((int) (Math.random() * 10));
                    result += a;
                }
            }

        }
        else if (isNumbers) {
            for (int i = 0; i < 8; i++) {
                String a = "" + numbers.charAt((int) (Math.random() * 10));
                result += a;
            }
        }
        else if (isCaps) {
            for (int i = 0; i < 8; i++) {
                char a = (char) ('A' + (int) (Math.random() * 27));
                result += a;

            }
        }
        else if(isSimb){
            for (int i = 0; i < 8; i++) {
                char a = simbls.charAt((int) (Math.random() * 10));
                result += a;
            }
        }

        return "                    " + result;
    }
}
