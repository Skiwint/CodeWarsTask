package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static java.util.Arrays.stream;

public class Main {

    public static void main(String[] args) {

        int n = 493193;
        String test = String.valueOf(digital_root(n));
        System.out.println(test);

    }




    //Sum of Digits / Digital Root
    public static int digital_root(int n) {
        int ans = n;
        boolean status = true;
        while (status){
            int[] newDigit = digRoot(ans);
            ans = summDigit(newDigit);
            if(String.valueOf(ans).length() == 1)
                status = false;
        }
        return ans;
    }
    public static int summDigit(int[] newDigit){
        int ans = 0;
        for (int i = 0; i < newDigit.length; i++){
            ans+=newDigit[i];
        }
        return ans;
    }
    public static int[] digRoot(int n){
        return String.valueOf(n)
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }


    //CamelCase Method
    public static String camelCase(String str) {
        if (str.equals(""))
            return "";
        String[] arr = str.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            ans.append(arr[i].substring(0, 1).toUpperCase()).append(arr[i].substring(1));
        }
        return ans.toString();
    }

}
