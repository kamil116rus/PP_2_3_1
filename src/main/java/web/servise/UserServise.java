package web.servise;

import web.model.User;

import java.util.List;

public interface UserServise  {
    List<User> getAllUsers();
    User getUserById(Long id);
    public void addUser(User user);
    public void removeUser(Long id);
    public void updateUser(User user);
}
