package com.marco.mall.tiny.bus.ums.service.impl;

import com.marco.mall.tiny.bus.ums.entity.UmsAdminPermissionRelation;
import com.marco.mall.tiny.bus.ums.dao.UmsAdminPermissionRelationMapper;
import com.marco.mall.tiny.bus.ums.service.UmsAdminPermissionRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限) 服务实现类
 * </p>
 *
 * @author luckyX
 * @since 2021-06-20
 */
@Service
public class UmsAdminPermissionRelationServiceImpl extends ServiceImpl<UmsAdminPermissionRelationMapper, UmsAdminPermissionRelation> implements UmsAdminPermissionRelationService {

}
