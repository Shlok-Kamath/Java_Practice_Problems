class Circle{
    int radius;
    Circle(int r){
        radius = r;
    }
    void area(){
        System.out.println("The area of circle is: "+3.14*radius*radius);
    }
}

class Cylinder extends Circle{
    int height;
    Cylinder(int a, int b){
        super(a);
        height = b;
    }
    void volume(){
        System.out.println("The volume of cylinder is: "+3.14*radius*radius*height);
    }
}

class Rectange{
    int length,breadth;
    Rectange(int a, int b){
        length = a;
        this.breadth = b;
    }
    void area(){
        System.out.println("The area of rectangle is: "+length*breadth);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
}

class Cuboid extends Rectange{
    int height;

    Cuboid(int a, int b, int c){
        super(a,b);
        height = c;
    }

    void volume(){
        System.out.println("Volume of cuboid is: "+height*breadth*length);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

public class Main {
    public static void main(String[] args){
        Cylinder c = new Cylinder(4,5);
        Cuboid cuboid = new Cuboid(4,5,6);

        c.volume();
        cuboid.volume();
    }

}
