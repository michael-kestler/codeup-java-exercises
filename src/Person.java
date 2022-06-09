public class Person {
    private String name;

    public String getName(){
//TODO: return the person's name
        return name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;

    }


    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello " + name);
    }

    public Person(String name) {
        this.name = name;
    }





    public static void main(String[] args){
//        Person person = new Person("Larry");
//        person.sayHello();
//        Person person4 = new Person("Ricky Bobby");
//        Person person5 = new Person("Cal Norton Jr.");
//        Person person6 = new Person("Jean Girard");

//        Person[] arr;
//        arr = new Person[3];
////        personArray[0] = String.valueOf(person4);
////        personArray[1] = String.valueOf(person5);
////        personArray[2] = String.valueOf(person6);
//
//        arr[0] = new Person();
//        arr[1] = new Person();
//        arr[2] = new Person();
//
//        arr[0].setName("Ricky Bobby");
//        arr[1].setName("Cal Norton Jr");
//        arr[2].setName("Jean Girard");
//
//        for (Person s : arr) {
//            System.out.println(s);}


//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

    }





    }








