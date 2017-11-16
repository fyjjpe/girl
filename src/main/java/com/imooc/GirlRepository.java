package com.imooc;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by yuanjie.fang on 2017/11/16.
 */
public interface GirlRepository extends JpaRepository<Girl, Integer> {

    //通过年龄来查询(自定义的扩展方法)
    public List<Girl> findByAge(Integer age);//这里的方法名不能随便命名

}
