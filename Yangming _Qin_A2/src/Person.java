public abstract class Person{
    //add three instance variables
    private String name;
    private String id;
    private int age;
    //default constructor
    public Person(){}
    //set parameter
    public Person(String name, String id, int age){
        this.name = name;
        this.id = id ;
        this.age = age;
    }
    //add getters and setters method
    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    public String getId (){return id;}
    public void setId(String id){this.id = id;}

    public int getAge(){return age;}
    public void setAge(int age){this.age = age;}

    public void printDetails(){
        System.out.print("Name :" + name+ "\t");
        System.out.print("Id :" + id+ "\t");
        System.out.print("Age :" + age+ "\t");
    }
}