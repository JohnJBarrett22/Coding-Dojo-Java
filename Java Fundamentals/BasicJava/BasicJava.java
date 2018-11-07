import java.util.ArrayList;
import java.util.Collections;

public class BasicJava{
    public void print1To255(){
        for(int i = 1; i < 256; i++){
            System.out.println(i);
        }
    }

    public void printOdd1To255(){
        for(int i = 1; i < 256; i+=2){
            System.out.println(i);
        }
    }

    public void printSum(){
        int total = 0;
        for(int i = 0; i < 256; i++){
            total += i;
            System.out.println("New number: " + i + " Sum: " + total);
        }
    }

    public void iterateArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public void findMax(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public void getAverage(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum/arr.length);
    }

    public void arrayOddNumbers(){
        ArrayList<Integer> y = new ArrayList<Integer>();
        for(int i = 1; i < 256; i+=2){
            y.add(i);
        }
        System.out.println(y);
    }

    public void greaterThanY(int[] arr, int y){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > y){
                count++;
            }
        }
        System.out.println(count);
    }

    public void squareTheValues(int[] x){
        ArrayList<Integer> z = new ArrayList<Integer>();
        for(int i = 0; i < x.length; i++){
            x[i] = x[i] * x[i];
            z.add(x[i]);
        }
        System.out.println(z);
    }

    public void eliminateNegativeNumbers(int[] x){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for(int i = 0; i < x.length; i++){
            if(x[i] < 0){
                x[i] = 0;
            }
            newArray.add(x[i]);
        }
        System.out.println(newArray);
    }

    public void maxMinAvg(int[] x){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        int min = x[0];
        int max = x[0];
        int sum = 0;
        for(int i = 0; i < x.length; i++){
            if(x[i] > max){
                max = x[i];
            }
            if(x[i] < min){
                min = x[i];
            }
            sum += x[i];
        }
        int avg = sum/x.length;
        Collections.addAll(newArray, min, max, avg);
        System.out.println(newArray);
    }

    public void shiftingValues(int[] x){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for(int i = 0; i < x.length; i++){
            if(i == x.length - 1){
                newArray.add(0);
            }
            else{
                newArray.add(x[i+1]);
            }
        }
        System.out.println(newArray);
    }
}