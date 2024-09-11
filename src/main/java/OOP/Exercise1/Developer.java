package OOP.Exercise1;
public class Developer extends Employee{
    protected int experience;
    public Developer(int experience) {
        super();
        this.experience = experience;
        System.out.println("Developer has been created!");
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    protected void yearsOfExperience(){
        System.out.println("Years of experience:" + experience);
    }
}
