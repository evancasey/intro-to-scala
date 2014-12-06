public class JavaPerson {
    private String name;
    private int age;
    public JavaPerson(String name, Integer age) {  // constructor
        this.name = name;
        this.age = age;
    }
    public String getName() {          	// name getter
        return name;
    }
    public int getAge() {              	// age getter
        return age;
    }
    public void setName(String name) { 	// name setter
        this.name = name;
    }
    public void setAge(int age) {      	// age setter
        this.age = age;
    }
}

