package com.kalinin.springboot.springboot_mybatis.service.impl;

import com.kalinin.springboot.springboot_mybatis.repository.GuideRepository;
import com.kalinin.springboot.springboot_mybatis.entity.Guide;
import com.kalinin.springboot.springboot_mybatis.service.GuideService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
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
    public Guide saveGuide (Guide guide) { return guideRepository.save(guide);}

    @Override
    public Guide getGuide(int id) {return guideRepository.findById(id).orElseThrow(()->new EntityNotFoundException("справочник с id "+ id+ " не найден"));}
}
