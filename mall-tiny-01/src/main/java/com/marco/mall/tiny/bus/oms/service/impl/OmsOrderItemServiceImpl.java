package com.marco.mall.tiny.bus.oms.service.impl;

import com.marco.mall.tiny.bus.oms.entity.OmsOrderItem;
import com.marco.mall.tiny.bus.oms.dao.OmsOrderItemMapper;
import com.marco.mall.tiny.bus.oms.service.OmsOrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单中所包含的商品 服务实现类
 * </p>
 *
 * @author luckyX
 * @since 2021-06-20
 */
@Service
public class OmsOrderItemServiceImpl extends ServiceImpl<OmsOrderItemMapper, OmsOrderItem> implements OmsOrderItemService {

}
