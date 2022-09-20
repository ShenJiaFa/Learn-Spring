package com.shenjiafa.dao.impl;

import com.shenjiafa.dao.ResourcesDao;
import org.springframework.stereotype.Repository;

import java.util.Objects;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/20
 */
@Repository
public class ResourcesDaoImpl implements ResourcesDao {
    @Override
    public boolean openUrl(String url, String pwd) {
        return Objects.equals(pwd,"root");
    }
}
