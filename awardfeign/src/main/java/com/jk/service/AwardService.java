package com.jk.service;

import com.jk.entity.AwardBean;
import com.jk.utils.PageResult;
import com.jk.utils.PageUtil;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @Auther: 王豆
 * @Date: 2018/12/14 11:45
 * @Description:
 */
@FeignClient(value = "cloudprovider")//声明当前接口时一个feign客户端
public interface AwardService extends AwardsService{

}
