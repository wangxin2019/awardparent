package com.jk.controller;

import com.jk.entity.AwardBean;
import com.jk.service.AwardsService;
import com.jk.utils.PageResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: 王豆
 * @Date: 2018/12/14 11:40
 * @Description:
 */
@Controller
public class AwardController {

    private static final Logger logger = LoggerFactory.getLogger(AwardController.class);

    @Autowired
    private AwardsService awardService;
    @RequestMapping("queryAward")
    @ResponseBody
    public PageResult queryAward(){
        logger.info("查询方法");
        PageResult awardBeanList = awardService.queryAward();
        return awardBeanList;
    }
    @RequestMapping("addAward")
    @ResponseBody
    public void addAward(AwardBean awardBean) {
        awardService.addAward(awardBean);
    }
    @RequestMapping("testParames")
    @ResponseBody
    public void testParames(Integer age ,String name){
        logger.info("传参测试");
        awardService.testParames(age,name);
    }
}
