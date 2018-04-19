package com.zheng.cms.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.cms.dao.mapper.CmsDayongMapper;
import com.zheng.cms.dao.model.CmsDayong;
import com.zheng.cms.dao.model.CmsDayongExample;
import com.zheng.cms.rpc.api.CmsDayongService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* CmsDayongService实现
* Created by shuzheng on 2018/4/20.
*/
@Service
@Transactional
@BaseService
public class CmsDayongServiceImpl extends BaseServiceImpl<CmsDayongMapper, CmsDayong, CmsDayongExample> implements CmsDayongService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CmsDayongServiceImpl.class);

    @Autowired
    CmsDayongMapper cmsDayongMapper;

}