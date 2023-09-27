package Unit1;
//the property by which one class can acquire the properties of another class 
class Person{
    private String name;
    private String gender;
    private String phone;
    //constructor 
    public Person (String name, String gender, String phone){
        this.name=name;
        this.gender=gender;
        this.phone=phone;
    }
    //method 
    public void displayPerson(){
            System.out.println("Name is "+ this.name);
            System.out.println("gender is "+this.gender);
            System.out.println("phone is "+ this.phone);
}
}
class Student extends Person{
    private int roll;
    private String faculty;
    private String grade;
    //to call constructor of class super keywords should be used
    public Student(int roll, String faculty, String grade, String name, String gender, String phone){
        //calling constuctor of super class
        super(name, gender,phone);//takes control to super class constructor
        this.roll=roll;
        this.faculty=faculty;
        this.grade=grade;
    }
    public void displayStudent(){
        System.out.println("roll is "+this.roll);
        System.out.println("faculty is "+this.faculty);
        System.out.println("grade is "+this.grade);
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Student s1= new Student(1,"CSIT","A","Ram","male", "506660");
        s1.displayStudent();
        s1.displayPerson();
    }
    
}
