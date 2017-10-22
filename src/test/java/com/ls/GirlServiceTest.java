package com.ls;

import com.ls.domain.Girl;
import com.ls.service.GirlService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by keke on 2017/10/19.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlServiceTest {

    @Autowired
    GirlService girlService;

    @Test
    public void findOneTest(){
        Girl girl = girlService.findOne(4);
        Assert.assertEquals(new Integer(13).toString(), girl.getAge()+"");
    }

}
