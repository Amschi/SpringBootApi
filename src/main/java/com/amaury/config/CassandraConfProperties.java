package com.amaury.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("cassandra")
@ConfigurationProperties("cassandra")
@Data
public class CassandraConfProperties {

  private String contactPoints;
  private String keyspaceName;
  private Integer port;
  private String ssl;
}
