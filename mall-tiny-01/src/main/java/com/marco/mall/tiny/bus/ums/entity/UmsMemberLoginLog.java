package com.marco.mall.tiny.bus.ums.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 会员登录记录
 * </p>
 *
 * @author luckyX
 * @since 2021-06-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UmsMemberLoginLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long memberId;

    private Date createTime;

    private String ip;

    private String city;

    /**
     * 登录类型：0->PC；1->android;2->ios;3->小程序
     */
    private Integer loginType;

    private String province;


}
