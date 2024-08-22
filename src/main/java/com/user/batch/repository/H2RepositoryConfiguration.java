package com.user.batch.repository;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

@Configuration
public class H2RepositoryConfiguration {

    @Bean(name="batchH2Datasource")
    public DataSource batchH2Datasource() {
        EmbeddedDatabaseBuilder embeddedDatabaseBuilder = new EmbeddedDatabaseBuilder();
        return embeddedDatabaseBuilder
                .addScript("classpath:org/springframework/batch/core/schema-drop-mysql.sql")
                .addScript("classpath:org/springframework/batch/core/schema-mysql.sql")
                .setType(EmbeddedDatabaseType.H2)
                .build();
    }

    @Bean
    public DataSource getDataSource() {
        return this.batchH2Datasource();
    }
}
