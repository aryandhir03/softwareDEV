/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;

/**
 *
 * @author dhira
 */
public class PartTimeStudent extends Student{
    private int numOfCourses;

    public PartTimeStudent(int numOfCourses, int sId, String sname) {
        super(sId, sname);
        this.numOfCourses = numOfCourses;
    }

    
    
    
    public int getNumOfCourses() {
        return numOfCourses;
    }

    public void setNumOfCourses(int numOfCourses) {
        this.numOfCourses = numOfCourses;
    }
    
}
