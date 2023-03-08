package vas.VasSprring.manager;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import vas.VasSprring.entity.User;
import vas.VasSprring.repository.UserRepository;
import vas.VasSprring.service.UserService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class UserManager implements UserService {

   /* private static List<User> lists=new ArrayList<>();
    static {
        lists.add(new User(1,"Vazifa Guliyeva", LocalDate.now().minusYears(20)));
        lists.add(new User(2,"Aytaj Mammadli", LocalDate.now().minusYears(25)));
        lists.add(new User(3,"Shafiqa Khanmammadova", LocalDate.now().minusYears(26)));


    }*/

    private final UserRepository userRepository;
    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User getById(int id) {
        return userRepository.findById(id).get();
    }

    @Override
    public void saveUser(User user) {
         userRepository.save(user);

    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);

    }
}
