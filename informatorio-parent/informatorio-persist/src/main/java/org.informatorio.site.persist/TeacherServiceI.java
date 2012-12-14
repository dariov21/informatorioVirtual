package org.informatorio.site.persist;

import java.util.*;
import org.informatorio.site.model.Teacher;
import org.informatorio.site.persist.exceptions.NoTeacherException;

public interface TeacherServiceI{
        public List<Teacher> getAllTeacher();
        public List<Teacher> getTeacherByName(String name);
        public Teacher getTeacherById(Long id) throws NoTeacherException;
        public boolean save(Teacher teacher);
        public boolean delete(Teacher teacher)throws  NoTeacherException;
}

