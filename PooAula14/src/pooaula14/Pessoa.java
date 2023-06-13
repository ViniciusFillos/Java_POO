
package pooaula14;

public abstract class Pessoa {
    
    protected String name, gender;
    protected int age, experience;

    public Pessoa(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.experience = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    
    protected void gainExp(){
        this.setExperience(this.getExperience()+1);
    }

    @Override
    public String toString() {
        return "Pessoa{" + "name=" + name + ", gender=" + gender + ", age=" + age + ", experience=" + experience + '}';
    }
    
}
