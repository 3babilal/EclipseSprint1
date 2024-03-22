package test;

class Person2 {
	private String name;//Instance member variables
    private int age;
    private String sex;
    static int count = 0;//Static member variable

    public Person2() {
        System.out.println("I am Person init()!");
    }

    //Instance code block
    {
        this.name = "bit";
        this.age = 12;
        this.sex = "man";
        System.out.println("I am instance init()!");
    }

    //Static code block
    static {
        count = 10;//Only static data members can be accessed
        System.out.println("I am static init()!");
    }

    public void show() {
        System.out.println("name: " + name + " age: " + age + " sex: " + sex);
    }

}

