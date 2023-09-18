package test.functioninterface_test;

public class BiClass {
    private String a;

    @Override
    public boolean equals(Object o) {
        return ((BiClass) o).getA().equals(this.getA());
    }

    @Override
    public int hashCode() {
        return Integer.parseInt(a);
    }

    @Override
    public String toString() {
        return "BiClass{" +
                "a='" + a + '\'' +
                ", b=" + b +
                '}';
    }

    private int b;

    public BiClass(String a, int b) {
        this.a = a;
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
