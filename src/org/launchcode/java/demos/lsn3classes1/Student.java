package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String name, int studentId, int numberOfCredits){
        this.name= name;
        this.studentId= studentId;
        this.numberOfCredits= numberOfCredits;
    }

    public void setName(String name){
        this.name = name;

    }
    public void setStudentId(int studentId){
        this.studentId = studentId;
    }
    public void setGpa(double gpa ){

        this.gpa = gpa;
    }
    private void setNumberOfCredits(int numberOfCredits){

        this.numberOfCredits = numberOfCredits;
    }

    public String getName(){

        return name;
    }
    public int getStudentId(){
        return studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public int getNumberOfCredits() {

        return numberOfCredits;
    }



}
