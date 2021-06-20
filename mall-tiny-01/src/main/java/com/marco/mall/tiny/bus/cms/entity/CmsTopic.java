package com.marco.mall.tiny.bus.cms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 话题表
 * </p>
 *
 * @author luckyX
 * @since 2021-06-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CmsTopic implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long categoryId;

    private String name;

    private Date createTime;

    private Date startTime;

    private Date endTime;

    /**
     * 参与人数
     */
    private Integer attendCount;

    /**
     * 关注人数
     */
    private Integer attentionCount;

    private Integer readCount;

    /**
     * 奖品名称
     */
    private String awardName;

    /**
     * 参与方式
     */
    private String attendType;

    /**
     * 话题内容
     */
    private String content;


}
