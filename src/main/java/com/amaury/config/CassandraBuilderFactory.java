package com.amaury.config;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.cassandra.config.CassandraClusterFactoryBean;
import org.springframework.data.cassandra.config.CassandraSessionFactoryBean;
import org.springframework.data.cassandra.core.convert.CassandraConverter;
import org.springframework.data.cassandra.core.convert.MappingCassandraConverter;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired), access = AccessLevel.PRIVATE)
public class CassandraBuilderFactory {

  private final CassandraConfProperties cassandraConfProperties;

  @Bean
  public CassandraSessionFactoryBean session() throws Exception {

    CassandraSessionFactoryBean session = new CassandraSessionFactoryBean();

    session.setKeyspaceName(cassandraConfProperties.getKeyspaceName());
    session.setCluster(cluster().getObject());
    CassandraConverter cassandraConverter = new MappingCassandraConverter();
    session.setConverter(cassandraConverter);
    return session;
  }

  @Bean
  public CassandraClusterFactoryBean cluster() throws Exception {
    CassandraClusterFactoryBean cassandraClusterFactoryBean = new CassandraClusterFactoryBean();
    cassandraClusterFactoryBean.setClusterName("tooo");
    cassandraClusterFactoryBean.setContactPoints(cassandraConfProperties.getContactPoints());
    cassandraClusterFactoryBean.setPort(cassandraConfProperties.getPort());
    cassandraClusterFactoryBean.afterPropertiesSet();
    return cassandraClusterFactoryBean;
  }

}
