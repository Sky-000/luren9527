package com.luren.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.luren.system.domain.SysPost;

import java.util.List;

/**
 * 岗位信息 数据层
 *
 * @author luren
 */
public interface SysPostMapper extends BaseMapper<SysPost> {

    /**
     * 根据用户ID获取岗位选择框列表
     *
     * @param userId 用户ID
     * @return 选中岗位ID列表
     */
    public List<Integer> selectPostListByUserId(Long userId);

    /**
     * 查询用户所属岗位组
     *
     * @param userName 用户名
     * @return 结果
     */
    public List<SysPost> selectPostsByUserName(String userName);

}
