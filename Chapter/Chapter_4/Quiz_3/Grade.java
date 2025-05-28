package Chapter_4.Quiz_3;

public class Grade {
    private String name;
    private int java;
    private int web;
    private int os;

    Grade(String name,int java, int web,int os){
        this.name = name;
        this.java = java;
        this.web = web;
        this.os = os;
    }

    String getName(){
        return this.name;
    }

    int getAverage(){
        return (this.java+this.web+this.os)/3;
    }
}