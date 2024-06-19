package ru.netology.springbootrest.repository;

import org.springframework.stereotype.Repository;
import ru.netology.springbootrest.enums.Authorities;
import ru.netology.springbootrest.objects.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserRepository {

    Map<User,List<Authorities>> authoritiesMap;

    public UserRepository() {
        authoritiesMap = new HashMap<>();
        ArrayList<Authorities> authoritiesList = new ArrayList<>();
        authoritiesList.add(Authorities.READ);
        authoritiesList.add(Authorities.WRITE);

        authoritiesMap.put(new User("user","pass"), authoritiesList);
    }

    public List<Authorities> getUserAuthorities(String username, String password) {
        User user = new User(username,password);
        return authoritiesMap.get(user);
    }
}
