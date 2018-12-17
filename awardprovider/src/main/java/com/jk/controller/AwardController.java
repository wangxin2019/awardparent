package com.jk.controller;

import com.jk.entity.AwardBean;
import com.jk.service.AwardService;
import com.jk.service.AwardsService;
import com.jk.utils.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther: 王豆
 * @Date: 2018/12/13 19:57
 * @Description:
 */
@RestController
public class AwardController implements AwardsService{
    @Autowired
    private AwardService awardService;

    @Override
    public PageResult queryAward() {
        Integer page = 1;
        Integer rows = 5;
        PageResult list = awardService.queryAward(page,rows);
        return list;
    }

    @Override
    public Boolean addAward(@RequestBody AwardBean awardBean) {
        awardService.addAward(awardBean);
        return null;
    }

    @Override
    public Boolean updateAward(AwardBean awardBean) {
        return null;
    }

    @Override
    public Boolean deleteAward(Integer id) {
        return null;
    }

    @Override
    public void testParames(Integer age, String name) {
      System.out.print("年龄="+age+"名字="+name);
    }

    /*@GetMapping(value = "queryAward")
    public PageResult queryAward(){
        Integer page = 1;
        Integer rows = 5;
       return awardService.queryAward(page,rows);
    }

    @PostMapping(value = "queryAward")
    public void addAward(@RequestBody AwardBean awardBean){
        awardService.addAward(awardBean);
    }
    @RequestMapping(value = "deleteAward",method = RequestMethod.DELETE)
    public void deleteAward(Integer id){
        awardService.deleteAward(id);
    }
    @RequestMapping(value = "updateAward",method = RequestMethod.POST)
    public void updateAward(AwardBean awardBean){
        awardService.updateAward(awardBean);
    }
    @GetMapping(value = "queryAwardById")
    public AwardBean queryAwardById(Integer id){
        return awardService.queryAwardById(id);
    }*/
}
