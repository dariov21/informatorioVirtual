package org.informatorio.site.dao;

import java.util.Collection;
import org.informatorio.site.model.Student;

public class StudentDAO {

    public interface PersonaDAO {

        public void create(Student student);

        public Student find(Long Id);

        public void update(Student student);

        public void delete(Long studentId) ;

        public Collection findAll();
    }

}
