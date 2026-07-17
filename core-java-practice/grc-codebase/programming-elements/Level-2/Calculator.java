class Calculator {
    int a;
    int b;
    int c;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void add() {
        c = a + b;
        System.out.println("Addition = " + c);
    }

    public void subtract() {
        c = a - b;
        System.out.println("Subtraction = " + c);
    }

    public void multiply() {
        c = a * b;
        System.out.println("Multiplication = " + c);
    }

    public void divide() {
        c = a / b;
        System.out.println("Division = " + c);
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator(10, 5);

        cal.add();
        cal.subtract();
        cal.multiply();
        cal.divide();
    }
}