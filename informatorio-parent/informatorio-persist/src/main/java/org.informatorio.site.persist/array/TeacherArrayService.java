package org.informatorio.site.persist.array;

import org.informatorio.site.model.Teacher;
import org.informatorio.site.persist.TeacherServiceI;
import org.informatorio.site.persist.exceptions.NoTeacherException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: alumno
 * Date: 12/14/12
 * Time: 9:02 AM
 * To change this template use File | Settings | File Templates.
 */
public class TeacherArrayService implements TeacherServiceI{

    private static List<Teacher> teachers = null;

    static {
        teachers = new ArrayList<Teacher>();
    }

    public List<Teacher> getAllTeacher(){
        return null;
    }
    public List<Teacher> getTeacherByName(String name){
           List<Teacher> aux = new ArrayList<Teacher>();
          for(Teacher teacher: teachers){
              if(teacher.getName().equalsIgnoreCase(name)){
                  aux.add(teacher);
              }
          }
        return aux;
    }
    public boolean save(Teacher teacher){
        teachers.add(teacher);
        return true;

    }
    public boolean delete(Teacher teacher) throws  NoTeacherException{
        if(!teachers.contains(teacher)){
            throw  new NoTeacherException();
        }
        return  teachers.remove(teacher);
    }

    public Teacher getTeacherById(Long id)throws NoTeacherException{

        for(Teacher teacher : teachers){

            if(teacher.getId().equals(id)){

                return teacher;
            }

        }
        throw new NoTeacherException();

    }
}
