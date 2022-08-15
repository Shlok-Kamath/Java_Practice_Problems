class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public void setName(String a){
        name = a;
    }

    public String getName(){
        return name;
    }
}

class Cellphone{
    public void ringing(){
        System.out.println("Your mobile is ringing");
    }
    public void vibrating(){
        System.out.println("Your mobile is vibrating");
    }
}


class Square{

    int side;

    public void setSide(int a){
        side = a;
    }

    public int perimeter(){
        return 4*side;
    }

    public int area(){
        return side*side;
    }
}

class Rectangle{

    int length;
    int breadth;

    public void setSide(int a,int b){
        length = a;
        breadth = b;
    }

    public int perimeter(){
        return 2*(length+breadth);
    }

    public int area(){
        return length*breadth;
    }
}

class TommyVecetti{

    public void hitting(){
        System.out.println("Hitting");
    }

    public void running(){
        System.out.println("Running");
    }

    public void firing(){
        System.out.println("Firing");
    }
}

class Circle{

    int r;

    public void setR(int a){
        r=a;
    }

    public float area(){
        return 3.14f*r*r;
    }

    public float perimeter(){
        return 6.28f*r;
    }
}

public class Practice_Problems {

    public static void main(String args[]){

        Employee employee = new Employee();
        employee.salary = 1_00_000;
        employee.setName("Ramesh");
        System.out.println(employee.getSalary());
        System.out.println(employee.getName());

        Cellphone cellphone = new Cellphone();
        cellphone.ringing();
        cellphone.vibrating();

        Square square = new Square();
        square.setSide(4);
        System.out.println("The perimeter of square is: "+square.perimeter());
        System.out.println("The area of square is: "+square.area());

        Rectangle rectangle = new Rectangle();
        rectangle.setSide(4,5);
        System.out.println("The perimeter of rectangle is: "+rectangle.perimeter());
        System.out.println("The area of rectangle is: "+rectangle.area());

        TommyVecetti tommyVecetti = new TommyVecetti();
        tommyVecetti.hitting();
        tommyVecetti.running();
        tommyVecetti.firing();

        Circle circle = new Circle();
        circle.setR(5);
        System.out.println("The perimeter of circle is: "+circle.perimeter());
        System.out.println("The area of circle is: "+circle.area());
    }
}
