public class Person {
    private String name;
    private int id;

    public Person(String name,int id){
        this.name=name;
        this.id=id;

    }

    public Person() {

    }

    public void setName(String name){
        this.name=name;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }

    public static void main(String args[]){
        Person S1=new Person();
        S1.setName("tamjid");
        S1.setId(5542);
        System.out.println(S1.getName());
        System.out.println(S1.getId());

    }
}
