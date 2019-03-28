class FirstClass {

    public  static void main (String [] args){
        SecondClass o = new SecondClass(1,3);
        int i, j;
        for (i = 1; i <= 8; i++) {
            for(j = 1; j <= 8; j++) {
                o.setI(i);
                o.setJ(j);
                System.out.print(o.plus());
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}

class SecondClass {
    private int i;
    private int j;

    public SecondClass(int i,int j){
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
    public int plus(){
        return i+j;
    }

}