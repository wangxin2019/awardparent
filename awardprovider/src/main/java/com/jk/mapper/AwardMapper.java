package com.jk.mapper;

import com.jk.entity.AwardBean;

import java.util.HashMap;
import java.util.List;

/**
 * @Auther: 王豆
 * @Date: 2018/12/13 20:12
 * @Description:
 */
public interface AwardMapper {
    List<AwardBean> queryAward(HashMap<String, Object> hashMap);

    void addAward(AwardBean awardBean);

    void deleteAward(Integer id);

    void updateAward(AwardBean awardBean);

    AwardBean queryAwardById(Integer id);

    int queryAwardCount();
}
