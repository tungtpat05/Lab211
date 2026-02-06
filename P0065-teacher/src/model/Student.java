package model;

import constants.StudentType;

public class Student {

    private String name;
    private String className;
    private double math;
    private double physic;
    private double chemistry;
    private StudentType type;

    //Constructor khong tham so
    public Student() {
    }

    //Constructor co tham so
    public Student(String name, String className, double math, double physic, double chemistry) {
        this.name = name;
        this.className = className;
        this.math = math;
        this.physic = physic;
        this.chemistry = chemistry;
    }

    //Getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getPhysic() {
        return physic;
    }

    public void setPhysic(double physic) {
        this.physic = physic;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }

    public void setType(StudentType type) {
        this.type = type;
    }

    //ham tinh hang diem
    public StudentType getType() {
        if (getAVG() > 7.5) {
            return StudentType.A;
        } else if (getAVG() >= 6) {
            return StudentType.B;
        } else if (getAVG() >= 4) {
            return StudentType.C;
        } else {
            return StudentType.D;
        }
    }

    //ham tinh avg
    private double getAVG() {
        return (math + physic + chemistry) / 3;
    }

    @Override
    public String toString() {
        return String.format("%20s%20s%15s%.2f\n", name, className, " ", getAVG());
    }
}