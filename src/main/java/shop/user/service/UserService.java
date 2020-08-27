package shop.user.service;

import shop.user.domain.entity.User;

public interface UserService {
    User getUserById(String id);

    void addUser(User user);

    void updateUser(User user);
}
