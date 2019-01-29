package com.beta.bookservice;/*
 * Copyright 2002-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Cache could be disable in unit test.
 * @author Maciej Szarlinski
 */
@Configuration
class PersistenceContext {

    @Bean
    public DataSource dataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
/*
        String hostinfo = System.getenv("DB_HOSTINFO");
        String username = System.getenv("DB_USERNAME");
        String password = System.getenv("DB_PASSWORD");
*/

        String hostinfo = "210.108.48.235:3306/book";
        String username = "root";
        String password = "It12345!1";


        dataSourceBuilder.url("jdbc:mariadb://"+hostinfo+"?useUnicode=true");
        dataSourceBuilder.username(username);
        dataSourceBuilder.password(password);
        return dataSourceBuilder.build();
    }

}