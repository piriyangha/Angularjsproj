package com.niit.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;



@Configuration
	@ComponentScan("com")
	@EnableTransactionManagement
	public class HibernateConfig {
			@Autowired
			@Bean (name="dataSource")
			public DataSource dataSource() {
				System.out.println("Data Source Method");
				DriverManagerDataSource dataSource = new DriverManagerDataSource();
				dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
				dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
				dataSource.setUsername("priyaproj");
				dataSource.setPassword("123");
				System.out.println("Data Source created");
				return dataSource;
			}

			private Properties getHibernateProperties() {
				Properties properties = new Properties();
				properties.put("hibernate.dialect", "org.hibernate.dialect.OracleDialect");
				properties.put("hibernate.hbm2ddl.auto", "update");
				properties.put("hibernate.show_sql", "true");
				properties.put("hibernate.format_sql", "true");
				return properties;
			}
			/*@Bean(name = "blogDao")
			public BlogDao getBlogDao() {
				return new BlogDaoImpl();
			}*/

		    @Autowired
			@Bean(name = "sessionFactory")
			public SessionFactory getSessionFactory(DataSource dataSource) {
				LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
				sessionBuilder.addProperties(getHibernateProperties());
				sessionBuilder.scanPackages("com");
				return sessionBuilder.buildSessionFactory();
			}

			@Autowired
			@Bean(name = "transactionManager")
			public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
				HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
				return transactionManager;
			}
			

}
