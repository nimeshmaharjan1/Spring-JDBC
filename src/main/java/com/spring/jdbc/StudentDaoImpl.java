package com.spring.jdbc;

import com.spring.jdbc.entities.Student;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImpl implements StudentDao {
    private JdbcTemplate jdbcTemplate;
    @Override
    public int insert(Student student) {
        // Insert query
        String query2 = "insert into student (id, name, city) values(?, ?, ?)";
        int row = this.jdbcTemplate.update(query2, student.getStudentId(), student.getStudentName(), student.getStudentCity());
        return row;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
