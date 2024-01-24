/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraydemo;

/**
 *
 * @author dhira
 */
public class studentList {
    public static void main(String[] args){
    
        Student s1 = new Student(11,"AryanDhir");
        Student[] studentList = new Student[3];
        
        studentList[0] = s1;
        studentList[1] = new Student(2,"Akshat");
        studentList[2] = new Student(3,"Gurkirat");
        
        for(int i =0 ; i<studentList.length;i++){
            System.out.println(studentList[i].getSname());
        }
        
        
    
    }// end of main
    
}

