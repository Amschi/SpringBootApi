package com.amaury.repository;

import com.amaury.model.Timeline;
import com.datastax.driver.core.PagingState;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@EnableCassandraRepositories
public interface TimelineDefinitionRepository extends CassandraRepository<Timeline, String> {

  @Query("select * from timeline where id=:?")
  Optional<Timeline> getById(@RequestParam("id") String id);
}
