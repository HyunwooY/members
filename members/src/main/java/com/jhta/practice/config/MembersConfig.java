package com.jhta.practice.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = {"com.jhta.practice.mybatis"})
@ComponentScan(basePackages = {"com.jhta.practice.service"})
public class MembersConfig {
	@Autowired DataSource dataSource;
	
	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sb=new SqlSessionFactoryBean();
		sb.setDataSource(dataSource);
		return (SqlSessionFactory)sb.getObject();
	}
}
