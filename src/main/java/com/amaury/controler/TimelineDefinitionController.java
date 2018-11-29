package com.amaury.controler;

import com.amaury.model.Timeline;
import com.amaury.repository.TimelineDefinitionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TimelineDefinitionController {

  @Autowired
  private final TimelineDefinitionRepository timelineDefinitionRepository;

  @GetMapping("/timeline/{id}")
  public Optional<Timeline> restit(@PathVariable("id") String id) {
    return timelineDefinitionRepository.getById(id);

  }
}

