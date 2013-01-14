package org.informatorio.site.persist;

import java.util.*;
import org.informatorio.site.model.Student;
import org.informatorio.site.persist.exceptions.NoStudentException;

public interface StudentServiceI{
	public List<Student>getAllStudent();
    public List<Student> getStudentByName(String name);
    public Student getStudentById(Long id) throws NoStudentException;
	public boolean save(Student student);
	public boolean delete(Student student) throws NoStudentException;
}
	























