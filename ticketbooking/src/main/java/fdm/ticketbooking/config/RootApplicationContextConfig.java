package fdm.ticketbooking.config;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import oracle.jdbc.pool.OracleDataSource;

@Configuration
@ComponentScan("fdm.ticketbooking")
public class RootApplicationContextConfig {

	@Bean
	public DataSource dataSource() throws SQLException{
		OracleDataSource oracleDataSource = new OracleDataSource();
		oracleDataSource.setUser("jasdeepaulakh");
		oracleDataSource.setPassword("Oracle101");
		oracleDataSource.setURL("oracle.fdmgroup.com");
		return oracleDataSource;
		
	}
	
	public NamedParameterJdbcTemplate getJdbcTemplate() throws SQLException{
		return new NamedParameterJdbcTemplate(dataSource());
	}
	
}
