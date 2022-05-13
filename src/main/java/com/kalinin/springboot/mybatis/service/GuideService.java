package com.kalinin.springboot.mybatis.service;
import com.kalinin.springboot.mybatis.entity.Guide;

import java.util.List;

public interface GuideService {

    List<Guide> getAllGuide();

    Guide updateGuide(Guide guide);

    Guide insertGuide(Guide guide);

    int deleteByIdGuide(int id);

    Guide getGuide(int id);
}
