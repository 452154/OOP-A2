public class Employee extends Person{
    private String position;
    private String yearsOfExperience;

    public Employee() {}

    public Employee(String name, String id, int age, String position, String yearsOfExperience) {
        super(name, id, age);
        this.position = position;
        this.yearsOfExperience = yearsOfExperience;
    }
    public String getPosition(){return position;}
    public void setPosition(String position){this.position = position;}
    public String getYearsOfExperience(){return yearsOfExperience;}
    public void setYearsOfExperience(){this.yearsOfExperience = yearsOfExperience;}

    public void printDetails(){
        super.printDetails();
        System.out.print("Position :" + position+ "\t");
        System.out.print("Years Of Experience :" + yearsOfExperience+ "\t");
    }
}
