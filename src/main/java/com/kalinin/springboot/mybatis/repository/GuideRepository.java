package com.kalinin.springboot.mybatis.repository;

import com.kalinin.springboot.mybatis.entity.Guide;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Mapper
@Repository
public interface GuideRepository {
    @Select("SELECT * FROM guide")
    List<Guide> findAll();

    @Select("SELECT * FROM guide WHERE id = #{id}")
    Optional<Guide> findById(int id);

    @Delete("DELETE FROM guide WHERE id = #{id}")
    int deleteById(int id);

    @Insert("INSERT INTO guide ( name, reduction) " +
            " VALUES ( #{name}, #{reduction})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    Integer insert(Guide guide);

    @Update("UPDATE guide SET name = #{name}, " +
            "reduction = #{reduction} WHERE id = #{id}")
    int update(Guide guide);

}
