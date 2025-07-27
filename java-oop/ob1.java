class student {
    int roll;
    String name;
    float marks;
    student(){
        this.name="Mrittika";
        this.roll=28;
        this.marks=99;


    }
    void greet(){
        System.out.println("hi i am "+name);
    }
}
public class ob1{
    
    public static void main(String[] args){
        student ku = new student();
        // ku.roll=9;
        // ku.marks=80.6f;
        // ku.name="Marcus Lee";
    
        System.out.println(ku.roll);
        System.out.println(ku.name);
        System.out.println(ku.marks);
        ku.greet();
    }
}
