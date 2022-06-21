package com.example.TravelBlog;

import com.example.TravelBlog.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<User> findAllUsers(){
        return jdbcTemplate.query("select * from user", new UserRowMapper());
    }

    public void saveNewUser(User user_id){
        String mySql = "insert into user(user_id, user_name) values (?,?)";
        int num = jdbcTemplate.update(mySql, user_id.getUser_id(), user_id.getUser_profile();
        System.out.println(num);

    private class UserMapper implements RowMapper<User>

        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            User user = new User();
            user_id.setUser_id(rs.getInt("user_id"));
            user_id.setFirstName(rs.getString("firstName"));
            user_id.setLastName(rs.getString("lastName"));
            user_id.setEmail(rs.getString("team_id"));
            return user;
        }

    }
}
