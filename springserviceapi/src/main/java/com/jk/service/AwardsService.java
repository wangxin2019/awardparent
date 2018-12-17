package com.jk.service;

import com.jk.entity.AwardBean;
import com.jk.utils.PageResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther: 王豆
 * @Date: 2018/12/14 19:19
 * @Description:
 */
@RequestMapping("awardsService")
public interface AwardsService {

    @GetMapping("award")
    PageResult queryAward();

    @PostMapping("award")
    Boolean addAward(AwardBean awardBean);

    @PutMapping("award")
    Boolean updateAward(AwardBean awardBean);

    @DeleteMapping("award")
    Boolean deleteAward(@RequestParam("id") Integer id);

    @RequestMapping("test")
    void testParames(@RequestParam("age") Integer age ,@RequestParam("name") String name);
}
