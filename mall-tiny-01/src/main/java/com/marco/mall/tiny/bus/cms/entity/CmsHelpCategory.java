package com.marco.mall.tiny.bus.cms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 帮助分类表
 * </p>
 *
 * @author luckyX
 * @since 2021-06-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CmsHelpCategory implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String name;

    /**
     * 分类图标
     */
    private String icon;

    /**
     * 专题数量
     */
    private Integer helpCount;

    private Integer showStatus;

    private Integer sort;


}
