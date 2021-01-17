public class Quadratic{
    private static int a;
    private static int b;
    private static int c;
    private double root;
    public Quadratic(int a1, int b1, int c1){
        a=a1;
        b=b1;
        c=c1;
    }
    public double rootCalculation(){
        double calc=(double)((b*b)-4*a*c);
        root=(double)((-b+Math.sqrt(calc))/2*a);
        return root;
    }
    public void result(){
        System.out.println("The result is " +rootCalculation());
    }
    public void equation(){
        System.out.println(a+"x2"+b+"x"+"+"+c);
    }
}