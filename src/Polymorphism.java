//function overloading

class Student{
    String name;
    int age;
    public void printName(String name){
        System.out.println(name);
    }
    public void printName(int age){
        System.out.println(age);
    }
    public void printName(String name,int age){
        System.out.println(name+" "+ age);
    }
}
public class Polymorphism {
    public static void main (String [] arg){
        Student st=new Student();
//                st.name="sanket";
//                st.age=23;
                st.printName("ganesh",23);
    }
}

//inheritance
//single levele inheritance


//class Shape{
//    String color;
//    public void area(){
//        System.out.println("the area is display");
//    }
//}
//class Triangle extends Shape{
//    public void area(int l,int h){
//        System.out.println(1/2*l*h);
//    }
//}
////multilevel
//
//class Equilateraltraingle extends Triangle{
//    public void area(int l,int h){
//        System.out.println(1/2*l*h);
//    }
//
//}
////hierrchial inheritance
//class Circle extends Shape{
//    public void area(int r){
//        System.out.println((3.14)*r*r);
//    }
//}
//public class Polymorphism {
//    public static void main(String[] arg){
//         Shape sh=new Shape();
//       Triangle tr=new Triangle();
//       Equilateraltraingle eq=new Equilateraltraingle();
//
//       sh.area();
//        tr.area(4,5);
//        eq.area(4,5);
//    }
//}

//Abstraction------------------------
// Book.java
// Person.java
