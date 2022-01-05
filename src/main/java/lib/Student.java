package lib;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Data
public class Student {
    private String name;
    private Integer age;

//    Student(String name, Integer age) {
//        this.name = name;
//        this.age = age;
//    }

//    String getName() {
//        return name;
//    }
//
//    void setName(String name) {
//        this.name = name;
//    }
//
//    Integer getAge() {
//        return age;
//    }
//
//    void setAge(Integer age) {
//        this.age = age;
//    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
