package main;

public class MyMath {

    public int sum(int[] numbers) {
        int result = 0;
        for (int number: numbers) {
            result += number;
        }
        return result;
    }

}
