package com.jk.service;

import com.jk.entity.AwardBean;
import com.jk.mapper.AwardMapper;
import com.jk.utils.PageResult;
import com.jk.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @Auther: 王豆
 * @Date: 2018/12/13 20:09
 * @Description:
 */
@Service
public class AwardServiceImpl implements AwardService {

    @Autowired
    private AwardMapper awardMapper;

    @Override
    public PageResult queryAward(Integer page, Integer rows) {
        PageResult pageResult = new PageResult();
        HashMap<String, Object> hashMap = new HashMap<>();
        int count = awardMapper.queryAwardCount();
        PageUtil pageUtil = new PageUtil<>(count, page, rows);
        hashMap.put("startIndex", pageUtil.getStartIndex());
        hashMap.put("endIndex", pageUtil.getEndIndex());
        List<AwardBean> list = awardMapper.queryAward(hashMap);
        pageResult.setRows(list);
        pageResult.setTotal(count);
        return pageResult;
    }

    @Override
    public void addAward(AwardBean awardBean) {
        awardMapper.addAward(awardBean);
    }

    @Override
    public void deleteAward(Integer id) {
        awardMapper.deleteAward(id);
    }

    @Override
    public void updateAward(AwardBean awardBean) {
        awardMapper.updateAward(awardBean);
    }

    @Override
    public AwardBean queryAwardById(Integer id) {
        return awardMapper.queryAwardById(id);
    }

}