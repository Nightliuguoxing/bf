package edu.lgx.auths.dao;

import edu.lgx.auths.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @Author: LGX-LUCIFER
 * @Date: 2022-03-06 16:47
 * @Description:
 */
@Repository
public interface UserDao extends BaseDao<User, String> {

    @Query(value = "SELECT u FROM User u WHERE u.username = ?1")
    public User findUserByName(String username);
}
