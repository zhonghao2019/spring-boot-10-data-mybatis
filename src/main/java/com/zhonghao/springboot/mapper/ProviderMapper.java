package com.zhonghao.springboot.mapper;

import com.zhonghao.springboot.entities.Provider;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

@Component
public interface ProviderMapper {

    @Select("select * from provider where pid=#{pid}")
    Provider getProvierByPid(Integer pid);

    //使用自增主键，指定实体类中属性封装主键值
    @Options(useGeneratedKeys = true, keyProperty = "pid")
    @Insert("insert into provider(providerName) values(#{providerName})")
    int addProvider(Provider provider);

    @Delete("delete from provider where pid=#{pid}")
    int deleteProviderByPid(Integer pid);

    @Update("update provider set providerName=#{providerName} where pid=#{pid}")
    int updateProvider(Provider provider);
}
