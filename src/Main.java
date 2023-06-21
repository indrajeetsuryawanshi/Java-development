

import java.util.Scanner;
class Persondetails{


    String fname;
    String lname;
    int age;
    String gender;

    public void printDetails(){
        System.out.println("details of person1");
        System.out.println( "fname:"+this.fname);
        System.out.println( "lname:"+this.lname);
        System.out.println( "age:"+this.age);
        System.out.println( "gender:"+this.gender);

//        System.out.println("details of person2");
//        System.out.println( "fname:"+this.fname);
//        System.out.println( "lname:"+this.lname);
//        System.out.println( "age:"+this.age);
//        System.out.println( "gender:"+this.gender);

    }

}


public class Main {
    public static void main (String [] arg){
        Persondetails ps1=new Persondetails();
        Persondetails ps2=new Persondetails();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
          ps1.fname=sc.nextLine();
        System.out.println("enter your lname");
        ps1.lname=sc.nextLine();

        System.out.println("enter your age");
        ps1.age=sc.nextInt();
        sc.nextLine();
        System.out.println("enter your gender");
        ps1.gender=sc.nextLine();

//        System.out.println("enter your name");
//        ps2.fname=sc.nextLine();
//        System.out.println("enter your lname");
//        ps2.lname=sc.nextLine();
//
//        System.out.println("enter your age");
//        ps2.age=sc.nextInt();
//        sc.nextLine();
//        System.out.println("enter your gender");
//        ps2.gender=sc.nextLine();
//hej
//

        ps1.printDetails();
//        ps2.printDetails();


    }

}

