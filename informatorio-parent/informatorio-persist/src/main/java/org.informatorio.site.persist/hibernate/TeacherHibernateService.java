package org.informatorio.site.persist.hibernate;

import org.informatorio.site.model.Teacher;
import org.informatorio.site.persist.TeacherServiceI;
import org.informatorio.site.persist.exceptions.NoTeacherException;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: alumno
 * Date: 12/14/12
 * Time: 10:17 AM
 * To change this template use File | Settings | File Templates.
 */
public class TeacherHibernateService implements TeacherServiceI {

    public List<Teacher> getAllTeacher() {}
    public List<Teacher> getTeacherByName(String name){}
    public Teacher getTeacherById(Long id) throws NoTeacherException{


    }
    public boolean save(Teacher teacher){}
    public boolean delete(Teacher teacher)throws  NoTeacherException{}
}
