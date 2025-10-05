package one.terenin.basics;

public class MethodContainer1 {

    public final int countOfCharsInString = 10;

    public String generateString() {
        String line = "";
        for (int i = 0; i < countOfCharsInString - 1; i++) {
            line += i + " ";
        }
        return line;
        //example
        // generateString(5) -> 1 2 3 4 5;
    }

}
