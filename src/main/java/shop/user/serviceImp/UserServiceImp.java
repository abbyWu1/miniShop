package shop.user.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.user.dao.UserDao;
import shop.user.domain.entity.User;
import shop.user.service.UserService;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public User getUserById(String id) {
        User user = userDao.getUser(id);
        return user;
    }
}
