package com.marco.mall.tiny.bus.ums.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户和标签关系表
 * </p>
 *
 * @author luckyX
 * @since 2021-06-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UmsMemberMemberTagRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long memberId;

    private Long tagId;


}
