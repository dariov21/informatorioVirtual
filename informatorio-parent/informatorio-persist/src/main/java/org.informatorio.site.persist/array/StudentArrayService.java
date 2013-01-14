package org.informatorio.site.persist.array;

import org.informatorio.site.persist.StudentServiceI;
import org.informatorio.site.model.Student;
import org.informatorio.site.persist.exceptions.NoStudentException;
import java.lang.Throwable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: nico
 * Date: 06/01/13
 * Time: 12:54
 * To change this template use File | Settings | File Templates.
 */

public class StudentArrayService implements StudentServiceI{

    private static List<Student> students = null;
    private static Long id = 0L;

    static {
        students = new ArrayList<Student>();
    }

    public List<Student> getAllStudent(){
        return students;
    }
    public List<Student> getStudentByName(String name){
        List<Student> aux = new ArrayList<Student>();
        for(Student student: students){
            if(student.getName().equalsIgnoreCase(name)){
                aux.add(student);
            }
        }
        return aux;
    }
    public boolean save(Student student){
        student.setId(++id);
        students.add(student);
        return true;

    }
    public boolean delete(Student student)throws NoStudentException{
        if(!students.contains(student)){
            throw  new NoStudentException();
        }
        return  students.remove(student);
    }

    public Student getStudentById(Long id)throws NoStudentException{

        for(Student student : students){

            if(student.getId().equals(id)){

                return student;
            }

        }
        throw new NoStudentException();

    }

}
