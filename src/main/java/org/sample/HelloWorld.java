package org.sample;

public class HelloWorld {
    private boolean foo = false;
    public static void main(String[] args) {
        String msg = "Hello World!";
        String nullString = null;
        System.out.println(nullString.toString());
    }

    public boolean getFoo() {
        return foo;
    }
}
