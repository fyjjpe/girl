package com.imooc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by yuanjie.fang on 2017/11/16.
 */
@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo() {
        Girl girlA = new Girl();
        girlA.setCupSize("A");
        girlA.setAge(18);
        girlRepository.save(girlA);
        Girl girlB = new Girl();
        girlB.setCupSize("C");
        girlB.setAge(20);
        girlRepository.save(girlB);
    }
}
