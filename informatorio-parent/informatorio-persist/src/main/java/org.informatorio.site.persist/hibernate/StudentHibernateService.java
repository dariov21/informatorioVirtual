package org.informatorio.site.persist.hibernate;

import org.informatorio.site.model.Student;
import org.informatorio.site.persist.StudentServiceI;
import org.informatorio.site.persist.exceptions.NoStudentException;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: nico
 * Date: 12/01/13
 * Time: 21:53
 * To change this template use File | Settings | File Templates.
 */
public class StudentHibernateService implements StudentServiceI {
    @Override
    public List<Student> getAllStudent() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Student> getStudentByName(String name) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Student getStudentById(Long id) throws NoStudentException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean save(Student student) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean delete(Student student) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
