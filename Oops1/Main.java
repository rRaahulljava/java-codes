import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // STOPSHIP: 27-02-2024
        Students[] std = new Students[5];

//        Students kunal; // justc declaring
//        kunal = new Students();

        Students kunal = new Students(23,"guju",34);
        Students rahul = new Students();

//        kunal.rolNo = 12;
//        kunal.name = "rahul";
//        kunal.marks = 98.3f;

     //  System.out.println(kunal);
        System.out.println(kunal.rolNo);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);

        kunal.changeName("kunal");
        kunal.greeting();

        Students random = new Students(kunal);
        System.out.println(random.name);

        Students random2 = new Students();
        System.out.println(random2.rolNo);

    }
}
class Students {
    int rolNo;
    String name;
    float marks = 80;

    void greeting(){
        System.out.println("hello, my name is "+this.name);
    }

    void changeName(String newname){
        name = newname;
    }

//    Students(){
////        kunal.rolNo = 12;
////        kunal.name = "rahul";
////        kunal.marks = 98.3f;
//
//        // we need way to add the value of the above properties object
//        // we need one word  to access every object and that one word is :-- this
//
//        this.rolNo = 112;
//        this.name = "rahul erty";
//        this.marks = 98.3f;
//
//    }
    Students(int rno, String name, float marks){
        this.rolNo = rno;
        this.name = name;
        this.marks = marks;

    }

    Students(){
        // this is how a constructor is call from another constructor
        this(32,"qerterhtjhgswv",23.6f);
    }

    Students ( Students other){
        this.rolNo = other.rolNo;
        this.name = other.name;
        this.marks = other.marks;
    }

}
