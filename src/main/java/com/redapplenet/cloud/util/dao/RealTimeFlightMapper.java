package com.redapplenet.cloud.util.dao;

import com.redapplenet.cloud.util.entity.RealTimeFlight;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface RealTimeFlightMapper extends Mapper<RealTimeFlight> {

	void insertBatch(@Param("list") List<RealTimeFlight> list);

}
