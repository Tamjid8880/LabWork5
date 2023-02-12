/*
 * Static-Non Static type
 * 
 */
public class Main {
    int  a=20;
    static int b=30;


    static void display(){
        System.out.println(b); //static type

    }
    void show(){
        System.out.println(a+b);//Non-static type


    }
    public static void main(String args []){

        Main A= new Main(); // We have to create a new object to call non static type function
        A.show(); //here we call non static type
        Main.display(); // We can directly call static type function


    }
    
    
}
