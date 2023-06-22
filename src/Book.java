import java.util.Scanner;
class Bookdetails{
    private String name;
    private String author;
    private int price;
    private int yop;

    public void bookStore(){

    }

    public void setName(String name){
        this.name=name;

    }

    public String getName(){
        return  this.name;

    }
    public void setAuthor(String author){
        this.author=author;

    }

    public String getAuthor(){
        return  this.author;

    }public void setPrice(int price){
        this.price=price;

    }

    public  int getPrice(){
        return  this.price;

    }
    public void setYop(int yop){
        this.yop=yop;

    }

    public int getYop(){
        return  this.yop;

    }

}



public class Book {
    public static void main (String [] arg){
        Bookdetails[]bk=new Bookdetails[2];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<bk.length;i++){

            bk[i]=new Bookdetails();
            System.out.println("\nBook " + (i + 1));
            System.out.print("name :");
            bk[i].setName(sc.nextLine());
            System.out.print("author :");
            bk[i].setAuthor(sc.nextLine());
            System.out.print("price :");
            bk[i].setPrice(sc.nextInt());
            System.out.print("yop :");
            bk[i].setYop(sc.nextInt());
            sc.nextLine();

        }
        for (int x=0;x<bk.length;x++){
//           String display=String.format(bk[x].getName(),bk[x].getAuthor(),bk[x].getPrice(),bk[x].getYearOfPublishing());
            System.out.println("Book "+(x+1)+" details");
            System.out.println( "name: " + bk[x].getName());
            System.out.println( "author: " +bk[x].getAuthor());
            System.out.println( "price: " +bk[x].getPrice());
            System.out.println( "yop: " +bk[x].getYop());
        }
    }
}
