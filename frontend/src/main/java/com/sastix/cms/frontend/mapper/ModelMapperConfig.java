package com.sastix.cms.frontend.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ModelMapperConfig {
 @Bean
 ModelMapper modelMapper(){
     ModelMapper mapper =  new ModelMapper();
     mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
     return mapper;
 }
}
