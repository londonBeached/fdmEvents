package fdm.ticketbooking.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import fdm.ticketbooking.entity.User;
import fdm.ticketbooking.repository.UserRepository;

@Repository
public class InMemoryUserRepository implements UserRepository {

	@Autowired 
    private NamedParameterJdbcTemplate jdbcTemplate; 
	
	@Override
	public List<User> getAllUsers() {
		Map<String,Object> params = new HashMap<String,Object>();
		List<User> result = jdbcTemplate.query("SELECT * FROM users", params, new UserMapper());
		return result;
	}
	
	private static final class UserMapper implements          
    RowMapper<User> { 
      public User mapRow(ResultSet rs, int rowNum)                 
      throws SQLException { 
    	  User user = new User(); 
    	  user.setFirstName(rs.getString("FIRST_NAME"));
    	  user.setLastName(rs.getString("LAST_NAME"));
    	  user.setGender(rs.getString("GENDER"));
    	  user.setEmail(rs.getString("EMAIL"));
    	  user.setPassword(rs.getString("PASSWORD"));
    	  System.out.println("FirstName = " + rs.getString("FIRST_NAME"));
       return user; 
      } 
    } 

}
