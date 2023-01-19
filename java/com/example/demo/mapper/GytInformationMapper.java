package com.example.demo.mapper;

import com.example.demo.bean.Hospital;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface GytInformationMapper {
    List<Hospital> view();
    void insertInformation(Hospital hospital);
    void updateInformation(Hospital hospital);
}
