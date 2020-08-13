package shop.user.dao;

import org.springframework.stereotype.Repository;
import shop.user.domain.entity.User;
@Repository
public interface UserDao {
    User getUser(String id);
}
