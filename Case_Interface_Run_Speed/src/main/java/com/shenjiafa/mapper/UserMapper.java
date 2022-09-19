package com.shenjiafa.mapper;

import com.shenjiafa.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/19
 */
@Repository
public interface UserMapper {
    /**
     * 新增用户
     *
     * @param user user
     */
    @Insert("insert into t_user values(#{user.id},#{user.name},#{user.gender})")
    void add(User user);

    /**
     * 删除用户
     *
     * @param id id
     */
    @Delete("delete from t_user where id=#{id}")
    void delete(Integer id);

    /**
     * 更新用户
     *
     * @param user user
     */
    @Update("update t_user set name = #{user.name}, price = #{user.money} where id=#{user.id}")
    void update(User user);

    /**
     * 根据id查询用户
     *
     * @param id id
     * @return
     */
    @Select("select * from t_user where id=#{id}")
    User queryById(Integer id);

    /**
     * 查询所有用户
     *
     * @return 所有用户
     */
    @Select("select * from t_user")
    List<User> queryAll();

}
