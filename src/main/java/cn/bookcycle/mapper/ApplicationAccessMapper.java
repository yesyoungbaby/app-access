package cn.bookcycle.mapper;

import cn.bookcycle.pojo.ApplicationAccess;
import cn.bookcycle.pojo.ApplicationAccessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplicationAccessMapper {
    /**
     * 按条件查询符合该条件的对象数量
     * @param example
     * @return
     */
    int countByExample(ApplicationAccessExample example);//按条件计数

    int deleteByExample(ApplicationAccessExample example);//按条件删除

    int deleteByPrimaryKey(Long id);//按id删

    /**
     * insert则会插入所有字段，会插入null。
     * @param record
     * @return
     */
    int insert(ApplicationAccess record);//插入对象

    /**
     * insertSelective对应的sql语句加入了NULL校验，即只会插入数据不为null的字段值。
     * @param record
     * @return
     */
    int insertSelective(ApplicationAccess record);

    List<ApplicationAccess> selectByExample(ApplicationAccessExample example);//按条件查询

    ApplicationAccess selectByPrimaryKey(Long id);//按id查



    /*更新：如果按条件更 则db里但凡满足该字段条件的对象都会被更新
            而按id 只会更新一条数据
     */

    /**
     * updateByExample需要将表的条件全部给出，e.g.一个表有三个字段，就必须给三个字段给他，不给会设为null
     * @param record
     * @param example
     * @return
     */
    int updateByExample(@Param("record") ApplicationAccess record, @Param("example") ApplicationAccessExample example);//按条件更新 不用这个

    /**
     * updateByExampleSelective则不同，当某一实体类的属性为null时，mybatis会使用动态sql过滤掉，不更新该字段
     * @param record
     * @return
     */
    int updateByExampleSelective(@Param("record") ApplicationAccess record, @Param("example") ApplicationAccessExample example);//按条件更新值不为null的字段

    int updateByPrimaryKey(ApplicationAccess record);//按主键更新  不用这个
    int updateByPrimaryKeySelective(ApplicationAccess record);//按主键更新值不为null的字段
}