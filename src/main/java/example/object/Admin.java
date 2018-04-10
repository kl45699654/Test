package example.object;

/**
 * @program: springssm
 * @description: admin
 * @author: Mr.Shu
 * @create: 2018-04-02 17:17
 **/
public class Admin {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}