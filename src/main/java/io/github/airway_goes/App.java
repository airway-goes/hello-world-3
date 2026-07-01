package io.github.airway_goes;

/**
 * Main class.
 */
public class App {

    /**
     * Constructor.
     */
    public App() {
        // empty constructor just to satisfy javadoc plugin
    }

    /**
     * Main method.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    /**
     * Add two numbers.
     *
     * @param a 1st number
     * @param b 2nd number
     *
     * @return sum of two numbers
     */
    public int add(int a, int b) {
        return a + b;
    }
}
