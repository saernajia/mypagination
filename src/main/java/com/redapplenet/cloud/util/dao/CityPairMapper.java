package com.redapplenet.cloud.util.dao;

import com.redapplenet.cloud.util.dto.CityPairQuery;
import com.redapplenet.cloud.util.entity.CityPair;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface CityPairMapper extends Mapper<CityPair> {

	void insertBatch(@Param("list") List<CityPair> list);

	List<String> queryCityPairByCondition(CityPairQuery cityPairQuery);

}
