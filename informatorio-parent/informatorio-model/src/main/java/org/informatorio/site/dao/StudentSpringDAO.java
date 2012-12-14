package org.informatorio.site.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Collection;
import org.informatorio.site.model.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentSpringDAO extends StudentDAO {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Override
    public void create(Student student) {

        String sql = "INSERT INTO student (" +
                "surname, " +
                "name, " +
                "age) " +
                "VALUES ( ?, ?, ? )";

        Object[] values = new Object[] {
                student.getSurname(),
                student.getName(),
                student.getAge()
        };

        int[] types = new int[] {
                Types.VARCHAR,
                Types.VARCHAR,
                Types.INTEGER
        };
        jdbcTemplate.update(sql, values, types);
    }

    @Override
    public Student find(Long Id) {
        RowMapper rm=new RowMapper() {
            @Override
            public Object mapRow(ResultSet rs, int i) throws SQLException {
                Student student = new Student();
                student.setId(rs.getLong("id"));
                student.setSurname(rs.getString("surname"));
                student.setName(rs.getString("name"));
                student.setAge(rs.getInt("age"));
                return persona;
            }
        };
        String sql="Select * from student where id='"+Id+"'";
        Student rpta= (Student) jdbcTemplate.queryForObject(sql, rm);
        return rpta;
    }

    @Override
    public void update(Student student) {
        String sql="update persona set surname=?, name=?,age=? where id=?";
        Object []values=new Object[]{student.getSurname(),student.getName(),
                student.getAge(),student.getId()};
        jdbcTemplate.update(sql, values);
    }

    @Override
    public void delete(Long studentId) {
        String sql = "delete from student where id=?";
        Long []p= new Long[]{studentId};
        jdbcTemplate.update(sql, p);
    }

    @Override
    public Collection findAll() {
        RowMapper rm=new RowMapper() {
            @Override
            public Object mapRow(ResultSet rs, int i) throws SQLException {
                Student student = new Student();
                student.setId(rs.getLong("id"));
                student.setSurname(rs.getString("surname"));
                student.setName(rs.getString("name"));
                student.setAge(rs.getInt("age"));

                return persona;
            }
        };
        String sql="Select * from student";
        return jdbcTemplate.query(sql, rm);
    }

}
