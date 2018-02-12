public class Main {

    public static void main(String args[]){

    BagOfNames g1 = new BagOfNames();

    g1.isKnown("Spike");
    g1.sameLength("Adrian");

        System.out.println("=================");

    BagOfNames g2 = new BagOfNames();

    g2.isKnown("John");
    g1.sameLength("Stephanie");


    }
}
