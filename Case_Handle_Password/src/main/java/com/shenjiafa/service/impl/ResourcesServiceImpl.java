package com.shenjiafa.service.impl;

import com.shenjiafa.dao.ResourcesDao;
import com.shenjiafa.service.ResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/20
 */
@Service
public class ResourcesServiceImpl implements ResourcesService {

    @Autowired
    private ResourcesDao resourcesDao;
    @Override
    public boolean openUrl(String url, String pwd) {
        return resourcesDao.openUrl(url,pwd);
    }
}
