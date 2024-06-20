package com.bbs.common.mapper;

import com.bbs.common.dto.ForumListDTO;
import com.bbs.common.entity.Forum;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bbs.common.vo.ForumListVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 帖子 Mapper 接口
 * </p>
 *
 * @author yangjiajia
 * @since 2024-04-02
 */
@Mapper
public interface ForumMapper extends BaseMapper<Forum> {

    List<ForumListVo> list(@Param("listDTO") ForumListDTO listDTO);
}
