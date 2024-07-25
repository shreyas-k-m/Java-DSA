public class OOPS {

    public static void main(String args[]) {
        //object
        Pen p1 = new Pen(); //created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());

        //access modifier code
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Shreyas";
        myAcc.setPassword("asdfg");

        //constructors code
        Student s1 = new Student();
        //Student s2 = new Student("Shreyas");
        Student s3 = new Student();
        System.out.println(s1.name);

        //copy constructor
        s1.name = "Shreyas";
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 50;
        s1.marks[2] = 90;

        Student s2 = new Student(s1); //copy
        s2.password = "xyz";
        s1.marks[1] = 100;

        for(int i = 0;i < 3;i++) {
            System.out.println(s2.marks[i]);  
        }

        //inheritance code
        Fish shark = new Fish();
        shark.eat();

        //multi level inheritance code
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);

        //method overloading code
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum((float)1.5,(float)2.5));
        System.out.println(calc.sum(1,2,3));

        //method overriding code
        deer d = new deer();
        d.eat();

        //abstract class code
        /*Hores h = new Hores();
        h.eat();
        h.walk();
        System.out.println(h.color); //constructor

        Chicken c = new Chicken();
        c.eat();
        c.walk();*/

        Mustang myHorse = new Mustang();
        //animal -> horse -> mustang

        //interface code
        Queen q = new Queen();
        q.moves();

        //static keyword code
        /*Student s1 = new Student();
        s1.schoolName = "JMV";

        Student s2 = new Student();
        System.out.println(s2.schoolName);

        Student s3 = new Student();
        s1.schoolName = "avm";*/

        //super keyword code
        horsi h = new horsi();
    }
}

//creation of a new class(blue print)
//class
class Pen {
    private String color;
    private int tip;

    String getColor() { //getter
        return this.color;
    }

    int getTip() {
        return this.tip;
    }
    void setColor(String newColor) { //setter
        this.color = newColor;
    }

    void setTip(int Tip) {
        this.tip = Tip;
    }
}

//access modifier(specifier)
    class BankAccount {
        public String username;
        private String password;
        public void setPassword(String pwd) {
            password = pwd;
        }
    }

//constructors
    class Student {
        String name;
        int roll;
        String password;
        int marks[];

        //creation of constructor
        Student() { //non parameterized constructors
            marks = new int[3];
            System.out.println("constructor is called...");
        }
        Student(String name) {  //parameterized constructors
            marks = new int[3];
            this.name = name;
        }
        Student(int roll) {
            marks = new int[3];
            this.roll = roll;
        }

        //copy constructor  //shallow copy
        /*Student(Student s1) {
            marks = new int[3];
            this.name = s1.name;
            this.roll = s1.roll;
            this.marks = s1.marks;
        }*/

        //deep copy constructor
        Student(Student s1) {
            marks = new int[3];
            this.name = s1.name;
            this.roll = s1.roll;
            for(int i = 0;i < marks.length;i++) {
                this.marks[i] = s1.marks[i];
            }
        }
    }

//inheritance 
//base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breath() {
        System.out.println("breaths");
    }
}

//dervied class /subclass
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Swims in water");
    }
}

//multi level inheritance
class Mammels extends Animal{
    int legs;
}

class Dog extends Animal {
    int legs;
}

//hierarchial inheritance
class Mammel extends Animal{
    void walk() {
        System.out.println("Walks");
    }
}

/*class Fish extends Animal {
    void swim() {
        System.out.println("Swim");
    }
}*/

class Bird extends Animal {
    void fly() {
        System.out.println("fly");
    }
}

//polymorphism
//method overloading
class Calculator {
    int sum(int a,int b) {
        return a + b;
    }
    float sum(float a,float b) {
        return a + b;
    }
    int sum(int a,int b,int c) {
        return a + b + c;
    }
}

//method overriding
class Animals {
    void eat() {
        System.out.println("eats anything");
    }
}
class deer extends Animals {
    void eat() {
        System.out.println("eats grass");
    }
}

//abstract class
abstract class Annimal {
    String color;

    Annimal() {  //can have constructor
        System.out.println("animal constructor called");
        color = "brown";
    }
    void eat() {  //non abstract
        System.out.println("animal eats");
    }

    abstract void walk(); //abstract class
}

class Hores extends Annimal {
    Hores() { //constructor
        System.out.println("Horse constructor called");
    }
    void changeColor() {
        color = "dark brown";
    }
    void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Mustang extends Hores {
    Mustang() {
        System.out.println("Mustang constructor called");
    }
}
class Chicken extends Annimal {
    void changeColor() {
        color = "yellow";
    }
    void walk() {
        System.out.println("Walks on 2 legs");
    }
}

//interface
interface ChessPlayer {  //blueprint 
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up,down,left,right,diagonal(in all4 directions)");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up,down,left,right");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("up,down,left,right,diagonal(by 1 side)");
    }
}

//static keyword
/*class Student {
    static int returnPercentage(int math,int phy,int chem) {
        return(math + phy + chem) / 3;
    }
    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }
    String getname() {
        return this.name;
    }
}*/

//super keyword
class animalls {
    animalls() {
        System.out.println("animal constructor is called");
    }
}

class horsi extends animalls {
    horsi() {
        super();
        System.out.println("horse constructor is called");
    }
}