package at.tasks.stream_api;

public class Student {
    private String name;
    private Integer age;
    private Integer streamNumber;

    public Student(String name, Integer age, Integer streamNumber) {
        this.name = name;
        this.age = age;
        this.streamNumber = streamNumber;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getStreamNumber() {
        return streamNumber;
    }
}
