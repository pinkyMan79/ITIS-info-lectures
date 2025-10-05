package one.terenin.basics;

public class Lesson2 {

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = i + j;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    // extens => inheritance
    // access modifiers => encapsulation
    // polymorphism => interfaces, parent-child classes

}
