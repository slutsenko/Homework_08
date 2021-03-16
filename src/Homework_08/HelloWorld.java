package Homework_08;


public class HelloWorld {
    public static void main(String[] args) {
        helloWorld();
    }

    private static void helloWorld() {
        for (int i = 1; i <= 100; i++) {
            if ((i % 5 != 0) && (i % 3 != 0)) {
                System.out.print(i + " ");
            } else if ((i % 5 == 0) && (i % 3 == 0)) {
                System.out.print("HelloWorld" + " ");
            } else if (i % 5 == 0) {
                System.out.print("World" + " ");
            } else {
                System.out.print("Hello" + " ");
            }
        }
    }
}



