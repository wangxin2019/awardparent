package com.jk.service;

import com.jk.entity.AwardBean;
import com.jk.utils.PageResult;

import java.util.List;

/**
 * @Auther: 王豆
 * @Date: 2018/12/13 20:09
 * @Description:
 */

public interface AwardService {


    PageResult queryAward(Integer page, Integer rows);

    void addAward(AwardBean awardBean);

    void deleteAward(Integer id);

    void updateAward(AwardBean awardBean);

    AwardBean queryAwardById(Integer id);
}
