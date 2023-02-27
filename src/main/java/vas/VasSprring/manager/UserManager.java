package vas.VasSprring.manager;

import org.springframework.stereotype.Component;
import vas.VasSprring.entity.User;
import vas.VasSprring.service.UserService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserManager implements UserService {

    private static List<User> lists=new ArrayList<>();
    static {
        lists.add(new User(1,"Vazifa Guliyeva", LocalDate.now().minusYears(20)));
        lists.add(new User(2,"Aytaj Mammadli", LocalDate.now().minusYears(25)));
        lists.add(new User(3,"Shafiqa Khanmammadova", LocalDate.now().minusYears(26)));


    }
    @Override
    public List<User> getAll() {
        return lists;
    }

    @Override
    public User getById(int id) {
        return lists.get(id-1);
    }

    @Override
    public void saveUser(User user) {
        lists.add(user);

    }

    @Override
    public void deleteUser(int id) {
        lists.remove(id-1);

    }
}
