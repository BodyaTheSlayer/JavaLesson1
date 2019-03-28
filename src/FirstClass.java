import FirstPackage.*;

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

