package one.terenin.basics;

public class MethodContainer2 {

    public int generateSums(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
        //example
        // generateString(5) -> 1 2 3 4 5;
    }

    public int generateSums() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        return sum;
        //example
        // generateString(5) -> 1 2 3 4 5;
    }

}
