package com.redapplenet.cloud.util.dao;


import com.redapplenet.cloud.util.entity.RealTimeFareRule;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface RealTimeFareRuleMapper extends Mapper<RealTimeFareRule> {

	RealTimeFareRule queryByCondition(RealTimeFareRule realTimeFareRule);

}
