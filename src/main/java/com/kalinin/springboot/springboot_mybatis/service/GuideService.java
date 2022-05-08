package com.kalinin.springboot.springboot_mybatis.service;





import com.kalinin.springboot.springboot_mybatis.entity.Guide;

import java.util.List;

public interface GuideService {
    public List <Guide> getAllGuide ();
    public Guide saveGuide (Guide guide);
    public Guide getGuide(int id);

}
