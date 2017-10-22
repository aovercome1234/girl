package com.ls.controller;

import com.ls.domain.Girl;
import com.ls.domain.Result;
import com.ls.repository.GirlRepository;
import com.ls.service.GirlService;
import com.ls.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by keke on 2017/10/18.
 */
@RestController
public class GirlController3 {

    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private GirlService girlService;

    /** 查询所有女生列表  */
    @GetMapping(value="/girls3")
    public List<Girl> getGirlList(){
        return girlRepository.findAll();
    }

    /**添加一个女生  */
    @PostMapping(value="/girls3")
    public Result<Girl> addGirl(@Valid Girl girl, BindingResult bindingResult){
        //BindingResult会接收返回的结果
        if(bindingResult.hasErrors()){
//            Result result = new Result();
//            result.setCode(1);
//            result.setMsg(bindingResult.getFieldError().getDefaultMessage());
//            return result;
            return ResultUtil.error(1, bindingResult.getFieldError().getDefaultMessage());
        }
        girl.setCupSize(girl.getCupSize());
        girl.setAge(girl.getAge());

//        Result result = new Result();
//        result.setCode(0);
//        result.setMsg("成功");
//        result.setData(girlRepository.save(girl));
//        return result;
        return ResultUtil.success(girlRepository.save(girl));
    }

    /** 查询一个女生 */
    @GetMapping(value="/girls3/{id}")
    public Girl queryGirlByID(@PathVariable("id") Integer id){
        return girlRepository.findOne(id);
    }

    /** 更新一个女生 */
    @PutMapping(value="/girls3/{id}")
    public Girl updateGirlByID(@PathVariable("id") Integer id,
                               @RequestParam(value = "cupSize") String cupSize,
                               @RequestParam(value="age") Integer age){

        Girl girl = new Girl();
        girl.setAge(age);
        girl.setCupSize(cupSize);
        girl.setId(id);

        return girlRepository.save(girl);
    }

    /** 删除一个女生 */
    @DeleteMapping(value="/girls3/{id}")
    public void deleteGirlByID(@PathVariable("id") Integer id){
        girlRepository.delete(id);
    }

    /** 通过年龄查询一批女生 */
    @GetMapping(value="/girls3/age/{age}")
    public List<Girl> findGirlsByAge(@PathVariable("age") Integer age){
        return girlRepository.findByAge(age);
    }

    /** 一次性插入2条数据 */
    @PostMapping(value = "/girls3/insertTwo")
    public void insert2Girls(){
        girlService.insert2Girls();
    }

    /** 根据id查询年龄 */
    @GetMapping(value="/girls3/{id}/age")
    public void getAgeById(@PathVariable("id") Integer id) throws Exception{
        girlService.getAge(id);
    }

}
