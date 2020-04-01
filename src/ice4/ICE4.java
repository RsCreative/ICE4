/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ice4;

/**
 *
 * @author rajvindersandhu
 */
public class ICE4 {
    char search = 'p';
    char[] letter = new char[5];

    /**
     * @param args the command line arguments
     */
    public void main(String[] args) {
        int x = charCount(search);
        System.out.println(x);

        char y = ascii();
        System.out.println(y);

    }

    public int charCount(char search) {
        String word = "pineapple";
        int x = 0;
        char ch = word.charAt(0);

        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);
            if (ch == search) {
                x++;
            }

        }
        return x;
    }

    public char ascii() {

        letter[0] = 'r';
        letter[1] = 'z';
        letter[2] = 't';
        letter[3] = 'a';

        int max = 0;
        int temp = 0;
        char maxletter;

        for (int i = 0; i < letter.length; i++) {

            temp = (int) letter[i];
            if (temp > max) {
                max = temp;

            }

        }

        maxletter = (char) max;

        return maxletter;

    }

    public boolean checkletter(char search) {
        String word = "pineapple Juice";
        int x = 0;
        char ch = word.charAt(0);

        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);
            if (ch == search) {
                x++;
            }

        }
        if (x > 0) {
            return true;
        }
        return false;
    }

}
