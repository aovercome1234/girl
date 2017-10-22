package com.ls.service;

import com.ls.domain.Girl;
import com.ls.enums.ResultEnum;
import com.ls.exception.GirlException;
import com.ls.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by keke on 2017/10/18.
 */
@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional //加上这个事务注解后，要么数据同时成功插入，要么都不插入
    public void insert2Girls(){
        Girl girl1 = new Girl();
        girl1.setAge(10);
        girl1.setCupSize("C");
        girlRepository.save(girl1);

        Girl girl2 = new Girl();
        girl2.setAge(20);
        girl2.setCupSize("D");
        girlRepository.save(girl2);

    }

    //根据id查询年龄
    public void getAge(Integer id) throws Exception{
        Girl girl = girlRepository.findOne(id);
        Integer age = girl.getAge();

        if(age < 10){
            //返回code--100
//            throw new GirlException(100,"你还在上小学！");
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
        }else if(age > 10 && age < 16){
            //返回code--101
//            throw new GirlException(101, "你还在上初中！");
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
        }
    }

    //根据id查询女孩
    public Girl findOne(Integer id){
        return girlRepository.findOne(id);
    }

}
