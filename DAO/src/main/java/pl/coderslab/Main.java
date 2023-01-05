package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

public class Main {
    public static void main(String[] args) {

        // TEST METODY CREATE

//        User user = new User();
//        user.setUserName("Krzysztof");
//        user.setEmail("trueberserker@tlen.pl");
//        user.setPassword("trudne_hasło");
//        UserDao userDao = new UserDao();
//        userDao.create(user);

        // TEST METODY READ

//        UserDao userDao = new UserDao();
//        User read = userDao.read(2);
//        System.out.println(read);

        // TEST METODY UPDATE

//        UserDao userDao = new UserDao();
//        User user = userDao.read(1);
//        user.setUserName("Edyta");
//        user.setEmail("edduch@gmail.com");
//        user.setPassword("jeszcze_trudniejsze");
//        userDao.update(user);

        // TEST METODY DELETE

//        UserDao userDao = new UserDao();
//        userDao.delete(2);

        // TEST METODY FINDALL

        UserDao userDao = new UserDao();
        User[] all = userDao.findAll();
        for (User u : all) {
            System.out.println(u);
        }
    }
}