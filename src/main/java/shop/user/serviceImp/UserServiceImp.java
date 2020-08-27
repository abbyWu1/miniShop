package shop.user.serviceImp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.user.dao.UserDao;
import shop.user.domain.entity.User;
import shop.user.service.UserService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public User getUserById(String id) {
        User user = userDao.selectById(id);
        return user;
    }

    @Override
    public void addUser(User user) {
        userDao.insert(user);
    }

    @Override
    public void updateUser(User userUpdate) {
        QueryWrapper<User> userQuery = new QueryWrapper<>();
        userQuery.eq("account", userUpdate.getAccount());
        User userEntity = userDao.selectOne(userQuery);
        userUpdate.setVersion(userEntity.getVersion());
        userUpdate.setLoginStatus("");
        userDao.update(userUpdate, userQuery);
    }
}
