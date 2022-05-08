package com.kalinin.springboot.springboot_mybatis.repository;

import com.kalinin.springboot.springboot_mybatis.entity.Guide;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface GuideRepository extends JpaRepository<Guide, Integer> {
}
