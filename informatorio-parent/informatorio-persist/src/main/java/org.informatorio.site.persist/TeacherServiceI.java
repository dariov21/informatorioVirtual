package org.informatorio.site.persist;

import java.util.*;
import org.informatorio.site.model.Teacher;

public interface TeacherServiceI{
        public List<Teacher>getallTeacher();
        public boolean save();
        public boolean delete();
}

