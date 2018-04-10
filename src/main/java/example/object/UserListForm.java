package example.object;

import java.util.List;

/**
 * @program: springssm
 * @description: List
 * @author: Mr.Shu
 * @create: 2018-04-02 17:47
 **/
public class UserListForm {
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserListForm{" +
                "users=" + users +
                '}';
    }
}
