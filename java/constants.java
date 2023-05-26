interface physicalconstants{
    int C=299792458;
    double G=6.67428*(10^(-11));
    double g=9.80665;
}
public class constants implements physicalconstants {
    double energy(double m){
        double e;
        return e= m*(C^2);
    }
    double force(double m1,double m2,double r){
        double e=G*(m1*m2)/(r*r);
        return e;
    }
    double d(double t){
        double e=0.5*g*t;
        return e;
    }
    public static void main(String[] args) {
        constants a=new constants();
        System.out.println(a.energy(1));
        System.out.println(a.force(1,1,1));
        System.out.println(a.d(1));
    }   
}
