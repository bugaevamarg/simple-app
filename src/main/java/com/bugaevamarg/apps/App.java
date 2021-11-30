package com.bugaevamarg.apps;


public class App {
    public static void main(String[] args) {
        replaceSymbolInString("boobooboo", 'o', 'i');
    }

    static String replaceSymbolInString(String input, char from, char to) {
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == from) {
                charArray[i] = to;
            }
        }
        return new String(charArray);
    }
}
