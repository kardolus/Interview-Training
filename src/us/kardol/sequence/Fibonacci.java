package us.kardol.sequence;

public class Fibonacci {
    private int[] fibonacci;

    public Fibonacci(int size){
        fibonacci = new int[size];
        this.init();
    }

    private void init() {
        fibonacci[0] = 0;
        fibonacci[1] = 1;
    }

    public int[] sequence() {
        for(int i = 2; i < fibonacci.length; i++){
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }
}
