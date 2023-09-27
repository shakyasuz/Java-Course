
package Unit1;
//creating own class
class Box{
    //instance variable: class variable
    private int length;
    private int bredth;
    private int height;
    //constructor: used to set value of variable
    public Box(int length,int bredth,int height){
        this.length=length;
        this.bredth=bredth;
        this.height=height;
    }
    //method: Used to give some services
    public void displayBox(){
        System.out.println("Length is "+this.length);
        System.out.println("Bredth is "+this.bredth);
        System.out.println("Height is "+this.height);
        
    }
    public int calcVolume(){
        return(this.length*this.bredth*this.height);
    }
}
public class ClassConceptDemo2{
    public static void main(String[] args) {
        //creating object of box
        Box b1=new Box(50,60,40);
        b1.displayBox();
        int vol=b1.calcVolume();
        System.out.println("The volume is "+vol);
        Box b2=new Box(10,10,10);
        b2.displayBox();
        vol=b2.calcVolume();
        System.out.println("The volume is "+vol);
    }
    
}



