package com.example;

public class ReverseString {
    int i;
    int reverse;


    public void reverseString(String string){
        char[] charArray = string.toCharArray();
        for(i = charArray.length-1; i>=0; i--){
            //reverse = reverse+charArray[i];
            System.out.println(charArray[i]);
        }
        System.out.println(reverse);
    }
}
