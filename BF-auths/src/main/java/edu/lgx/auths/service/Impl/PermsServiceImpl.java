package edu.lgx.auths.service.Impl;

import edu.lgx.auths.dao.PermsDao;
import edu.lgx.auths.entity.Perms;
import edu.lgx.auths.service.PermsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: LGX-LUCIFER
 * @Date: 2022-03-06 21:01
 * @Description:
 */
@Service
public class PermsServiceImpl implements PermsService {

    @Autowired
    private PermsDao permsDao;

    @Override
    public Set<String> findAll() {
        List<Perms> perms = permsDao.findAll();
        Set<String> permissions = new HashSet<>();
        for (Perms p : perms){
            permissions.add(p.getName());
        }
        return permissions;
    }
}
