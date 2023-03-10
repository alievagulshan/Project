package company.servis.impl;

import company.dao.UserDao;
import company.model.User;
import company.servis.UserService;

public class UserServiceimpl  implements UserService {
    private UserDao userDao=new UserDao();
    @Override
    public void addUser(User user) {
        userDao.getUsers().add(user);
    }

    @Override
    public User findById(int id) {
        for (User user : userDao.getUsers()){
            if (user.getId() == id) {
                return user;
            }
        }
        throw  new RuntimeException("myndai id jok");

    }

    @Override
    public void deleteById(int id) {
        for (int i = 0; i <userDao.getUsers().size() ; i++) {
            if (userDao.getUsers().get(i).getId()==id){
                userDao.getUsers().remove(userDao.getUsers().get(i));

            }
            
        }

    }

    @Override
    public void getAllUser() {
       for (User user :userDao.getUsers()){
           System.out.println(user);
       }
    }
}



