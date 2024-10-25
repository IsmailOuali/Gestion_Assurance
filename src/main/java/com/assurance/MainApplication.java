package com.assurance;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.context.support.XmlWebApplicationContext;


public class MainApplication {

    public static void main(String[] args) {
        XmlWebApplicationContext context = new XmlWebApplicationContext();
        context.setConfigLocation("file:src/main/webapp/WEB-INF/application-datasource.xml");
        context.refresh();
    }

}
