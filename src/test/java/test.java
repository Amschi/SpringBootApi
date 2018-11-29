import com.amaury.config.CassandraConfProperties;
import com.amaury.controler.TimelineDefinitionController;
import com.amaury.repository.TimelineDefinitionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class test {

  @Autowired
  CassandraConfProperties cassandraConfProperties;

  @Autowired
  TimelineDefinitionRepository timelineDefinitionRepository;

  @Autowired
  TimelineDefinitionController timelineDefinitionController;

  @Test
  void name() {




  }
}
