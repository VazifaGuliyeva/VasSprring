package vas.VasSprring.service;

import vas.VasSprring.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAll();

    User getById(int id);

    void saveUser(User user);

    void deleteUser(int id);

}
