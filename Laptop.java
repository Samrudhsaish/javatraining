import java.util.Objects;

public class Laptop {
    String brand, color;
    int displaySize;
    String operatingS;//"windows";
    String specialFeature;//"Anti Glare Coating"

    /*int ram=16;
    long sizeKb=ram/1000;
    long sizeMb=kb/1000;
    long sizeGb=mb/1000;
    System.out.println("System RAM = " +sizeGb+ "gb");*/
    //Default constructor
    public Laptop(){
      System.out.println("I am creating object");
    }
    public Laptop(String br, String c, int dpS, String oS, String sF) {
        this.brand = br;
        this.color = c;
        this.displaySize = dpS;
        this.operatingS = oS;
        this.specialFeature = sF;
    }

    public void openLaptop() {
        System.out.println("you can see the display");
    }

    public void closeLaptop() {
        System.out.println("you can not  see the display");
    }

    @Override
    public boolean equals(Object anotherL) {
        Laptop l = (Laptop) anotherL;
        return this.brand == l.brand && this.operatingS == l.operatingS &&
                this.color == l.color && this.specialFeature == l.specialFeature;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, color, displaySize, operatingS, specialFeature);

    }

     public static void main(String[]  args){
        Laptop dell=new Laptop();
         dell.brand="Dell";
         dell.color="blue";
         dell.specialFeature="Anti glaring coating";
         dell.operatingS="windows";
         dell.displaySize=14;
         dell.openLaptop();
         dell.closeLaptop();


        Laptop acer=new Laptop();
         acer.brand="Acer";
         acer.color="grey";
         acer.specialFeature="Amazon Alex";
         acer.operatingS="linux";
         acer.displaySize=19;
         acer.openLaptop();
         acer.closeLaptop();
         System.out.println(dell.equals(acer));






         System.out.println(dell.hashCode() + "===" + acer.hashCode());



     }
    }
