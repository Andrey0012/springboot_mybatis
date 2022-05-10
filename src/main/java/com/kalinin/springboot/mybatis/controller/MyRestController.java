package com.kalinin.springboot.mybatis.controller;

import com.kalinin.springboot.mybatis.dto.GuideDto;
import com.kalinin.springboot.mybatis.entity.Guide;
import com.kalinin.springboot.mybatis.exception.NoSuchGuideException;
import com.kalinin.springboot.mybatis.mapper.GuideMapper;
import com.kalinin.springboot.mybatis.service.GuideService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class MyRestController {

    private final GuideService guideService;
    private final GuideMapper guideMapper;

    @GetMapping("/guide")
    public List<GuideDto> showAllGuide() {
        return guideService.getAllGuide().stream().map(guideMapper::guideEntityToDto).collect(Collectors.toList());
    }

    @GetMapping("/guide/{id}")
    public GuideDto getGuide(@PathVariable int id) {
        return guideMapper.guideEntityToDto(guideService.getGuide(id));
    }

    @PostMapping("/guide")
    public GuideDto addNewGuide(@RequestBody GuideDto guideDto) {
        Guide savedGuide = guideService.insertGuide(guideMapper.guideDtoToEntity(guideDto));
        return guideMapper.guideEntityToDto(savedGuide);
    }

    @PutMapping("/guide")
    public GuideDto updateGuide(@RequestBody GuideDto guideDto) {
        Guide updatedGuide = guideService.updateGuide(guideMapper.guideDtoToEntity(guideDto));
        return guideMapper.guideEntityToDto(updatedGuide);
    }

    @DeleteMapping("/guide/{id}")
    public String deleteGuide(@PathVariable int id) {
        int guideId = guideService.deleteByIdGuide(id);
        if (guideId == 0) {
            throw new NoSuchGuideException("There is no guide with ID = " + id + "  in Database");
        }
        guideService.deleteByIdGuide(id);
        return "Guide where ID = " + id + " delete";
    }

}
