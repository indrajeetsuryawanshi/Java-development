 class Pen{
   String color;
   String type;

 public  void createPen(){
     System.out.println("pen is created");
 }
 public void  printColor(){
     System.out.println(this.color);
 }

 }
 public class Hello {
    public static void main (String []arg){
     Pen pen1=new Pen();
     pen1.color="red";
     pen1.type="gelpen";
    pen1.createPen();


     Pen pen2=new Pen();
     pen2.color="black";
     pen2.type="ballpen";
    pen2.createPen();
 }
}

// constructor======

//class Student{
//    String name;
//    int age;
//
//    public void printName(){
//        System.out.println(this.name);
//        System.out.println(this.age);
//    }
//    Student(String name, int age){
//        this.name=name;
//        this.age=age;
//    }
//}
//
//
//public class Hello{
//    public static void main (String [] arg){
//
//        Student st=new Student( "sanket",34);
//// st.name="sanket";
//// st.age=23;
//
//        st.printName();
//
//    }
//}