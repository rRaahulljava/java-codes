public class UseHuman {
    public static void main(String[] args) {
        Human rahul = new Human(21,"rahul",1000000, false);
        Human kunal = new Human(23,"kunal", 23456,true);
//        System.out.println(rahul.population);
//        System.out.println(kunal.population);

        System.out.println(Human.population);
        System.out.println(Human.population);
      //  greeting();

    }
    // we know that something which is not static, belongs to an object
    static void fun(){
        //greeting(); // you can't use this because it requires an instance
        // but the function you are using it in does not depend on instance.

        UseHuman obj = new UseHuman();
        obj.greeting();
    }
    void greeting(){
        System.out.println("good morning");
    }
}
