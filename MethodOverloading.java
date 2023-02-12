public class MethodOverloading {

    void display(double h,double w,double l){
        System.out.println("Height: "+h +"\nWidth: "+w+"\nLength: "+l);


    }
    static double area(double h,double w){

        return h*w;
    }
    static double area(double h,double w,double l){
        return h*w*l;
    }

    public static void main(String [] args){

        double h=10.0,w=20.0,l=30.0;
        MethodOverloading obj=new MethodOverloading();

        obj.display(h,w,l);
        System.out.println("\nArea: "+area(h, w));
        System.out.println("\n Volume: "+area(h, w, l));

        
    }
}
