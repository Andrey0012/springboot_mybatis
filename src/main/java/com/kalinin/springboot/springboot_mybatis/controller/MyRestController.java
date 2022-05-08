package com.kalinin.springboot.springboot_mybatis.controller;

import com.kalinin.springboot.springboot_mybatis.entity.Guide;
import com.kalinin.springboot.springboot_mybatis.service.GuideService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class MyRestController {


    private final GuideService guideService;

    @GetMapping("/guide")
    public List <Guide> showAllGuide () {return guideService.getAllGuide();}

    @GetMapping("/guide/{id}")
    public Guide getGuide (@PathVariable int id) { return guideService.getGuide(id);}

    @PostMapping ("/guide")
    public Guide addNewGuide (@RequestBody Guide guide) {
        guideService.saveGuide(guide);
        return guide;
    }
    @PutMapping ("/guide")
    public Guide updateGuide (@RequestBody Guide guide) {
        guideService.saveGuide(guide);
        return guide;
    }

}
