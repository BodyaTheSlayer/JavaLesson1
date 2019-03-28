package FirstPackage;

public class SecondClass {
    private int i;
    private int j;

    public SecondClass(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public int plus() {
        return i + j;
    }

}