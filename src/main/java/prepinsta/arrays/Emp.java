package prepinsta.arrays;


public class Emp {

    int age ;

    public Emp(int i, String name) {
        this.age=i;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name ;
}
