package com.redapplenet.cloud.util.dao;

import com.redapplenet.cloud.util.entity.RealTimeCabin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface RealTimeCabinMapper extends Mapper<RealTimeCabin> {

	void insertBatch(@Param("list") List<RealTimeCabin> list);

}
