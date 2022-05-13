package com.kalinin.springboot.mybatis.mapper;

import com.kalinin.springboot.mybatis.dto.GuideDto;
import com.kalinin.springboot.mybatis.entity.Guide;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface GuideMapper {
    GuideDto guideEntityToDto(Guide guide);

    Guide guideDtoToEntity(GuideDto guideDto);
}
