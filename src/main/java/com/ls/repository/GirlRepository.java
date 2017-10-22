package com.ls.repository;

import com.ls.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by keke on 2017/10/18.
 */
public interface GirlRepository extends JpaRepository<Girl, Integer> {
    //                                      JpaRepository<实体类类名，表的id类型>

    // 通过年龄来查询，返回结果可能有多条，所以返回一个list，方法名必须是findByAge这么写
    public List<Girl> findByAge(Integer age);

}
