package company.servis;

import company.model.User;

public interface UserService {
    public void  addUser(User user);
    User  findById(int id);
    public void deleteById(int id);
    public  void getAllUser();



}
