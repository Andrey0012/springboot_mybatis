package com.kalinin.springboot.mybatis.service.impl;
import com.kalinin.springboot.mybatis.entity.Guide;
import com.kalinin.springboot.mybatis.exception.NoSuchGuideException;
import com.kalinin.springboot.mybatis.repository.GuideRepository;
import com.kalinin.springboot.mybatis.service.GuideService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GuideServiceImpl implements GuideService {

    private final GuideRepository guideRepository;

    @Override
    public List<Guide> getAllGuide() {
        return guideRepository.findAll();
    }

    @Override
    public Guide getGuide(int id) {
        return guideRepository.findById(id).orElseThrow(() -> new NoSuchGuideException("справочник с id " + id + " не найден"));
    }

    @Override
    public Guide updateGuide(Guide guide) {
        guideRepository.update(guide);
        return guide;
    }

    @Override
    public Guide insertGuide(Guide guide) {
        guideRepository.insert(guide);
        return guide;
    }

    @Override
    public int deleteByIdGuide(int id) {
        return guideRepository.deleteById(id);
    }
}
