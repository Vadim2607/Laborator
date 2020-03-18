package Task4;

import java.util.Random;

public class PasswordMaker {
    public static void main(String[] args) {
        int MAGIC_NUMBER = 0; //numeric alphabet
        String MAGIC_STRING ="ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //literral alphabet
        String ramdomStrGen = ""; // results
        int strLength = 7; // password length in string

        MAGIC_NUMBER = new Random().nextInt(100);



        Random strRand = new Random();
        char[] text = new char[strLength];
        for (int i= 0; i < strLength; i++){
            text[i] = MAGIC_STRING.charAt(strRand.nextInt(MAGIC_STRING.length()));
        }
        for (int i = 0; i < text.length; i++){
            ramdomStrGen += text[i];
        }
        System.out.println(ramdomStrGen + MAGIC_NUMBER);

    }
}
