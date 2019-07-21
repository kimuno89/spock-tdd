//package com.facgg.tdd.exception;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//
//import javax.sql.DataSource;
//
///**
// * @author : 김윤호
// * @version :
// * @date : 2019-07-21 23:14
// */
//@Configuration
//public class DataSourceConfiguration {
//    public DataSource dataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        dataSource.setUsername("mysqluser");
//        dataSource.setPassword("mysqlpass");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/tdd?createDatabaseIfNotExist=true");
//        return dataSource;
//    }
//}
