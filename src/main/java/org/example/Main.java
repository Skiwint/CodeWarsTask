package org.example;

import java.util.*;

import static java.util.Arrays.stream;

public class Main {

    public static void main(String[] args) {




                for(int i = 0; i <= 1000; i++){
            if(i % 3 == 0 && i % 5 != 0){
                String test = String.valueOf(i);
                char[] Arrval = test.toCharArray();
                int test2 = 0;
                for(int j = 0 ; j < test.length(); j++){
                    test2 += Character.getNumericValue(Arrval[j]);
                }
                if(test2 < 10){
                    System.out.println(i);
                }
            }
        }
    }

    public static boolean bingoValue(int[] arrayValue){
        int val1 = 0;
        int val2 = 0;

        for(int i = 0; i < (arrayValue.length / 2); i++){
            int test = arrayValue.length;
            val1+=arrayValue[i];
            val2+=arrayValue[test - 1 - i];
        }
        if(val1 == val2)
            return true;
        return false;
    }


    public static int readInput() {
        int n = 0;

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            n = Integer.parseInt(scanner.nextLine());
        }
        scanner.close();

        return n;
    }


    public String calculate(String input) {
        double perimeter = 0;
        double area = 0;

        String[] test = input.split(" ");
        double valueTest = 1.0;

        if (test.length > 1) {
            valueTest = Double.parseDouble(test[1]);
        }

        switch (test[0]){
            case "квадрат":{
                area = valueTest * valueTest;
                perimeter = 4 * valueTest;
                break;
            }
            case "круг":{
                area = Math.PI * valueTest * valueTest;
                perimeter = 2 * Math.PI * valueTest;
                break;
            }
            default: break;
        }

        return String.format("%.2f", area) + " " + String.format("%.2f", perimeter);
    }

    public String processLine(String line) {
        // Ваш код
        return "";
    }

    public String calculateStats(String input) {
        String[] arrayString = input.split(" ");

        int positive = 0;
        int negative = 0;
        int zero = 0;

        // Подсчет чисел по категориям
        for (String numStr : arrayString) {
            int num = Integer.parseInt(numStr);
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        return "выше нуля: "+positive+", ниже нуля: "+negative+", равна нулю: "+ zero;
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

    //Two Sum
    public int[] twoSum(int[] nums, int target) {



        return null;
    }

    public static int solveSuperMarketQueue(int[] customers, int n) {

        int[] tills = new int[n];



        return 0;
    }

}
