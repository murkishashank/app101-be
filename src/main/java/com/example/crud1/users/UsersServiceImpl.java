package com.example.crud1.users;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private final UsersRepo usersRepo;

    JSONObject obj = new JSONObject();

    public UsersServiceImpl(UsersRepo usersRepo) {
        super();
        this.usersRepo = usersRepo;
    }

    @Override
    public List<UsersEntity> getAllUsers() {
        return usersRepo.findAll();
    }

    @Override
    public UsersEntity saveUsersDetails(UsersEntity userEntity) {
        return usersRepo.save(userEntity);
    }

    @Override
    public Optional<UsersEntity> getUserByUserName(String userName) {
        return usersRepo.findByUserName(userName);
    }

    @Override
    public Optional<UsersEntity> getUserById(Integer userId) {
        return usersRepo.findById(userId);
    }

    @Override
    public void delete(Integer userId) {
        usersRepo.deleteById(userId);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Object> getAllUsersIds() {
        List<UsersEntity> allRecords = usersRepo.findAll();
        JSONArray finalArray = new JSONArray();
        allRecords.forEach(gravityScaleDetail -> {
            JSONObject json = new JSONObject();
            json.put("id", gravityScaleDetail.getId());
            json.put("userName", gravityScaleDetail.getUserName());
            finalArray.add(json);
        });
        return finalArray;
    }

    @Override
    public Boolean validateLogin(UsersEntity loginDetails) {
        Optional<UsersEntity> user = usersRepo.findByUserName(loginDetails.getUserName());
        if (user.isPresent()) {
            if (loginDetails.getUserName().equals(user.get().getUserName())) {
                if (loginDetails.getPassword().equals(user.get().getPassword()))
                    return true;
                else
                    return false;
            } else
                return false;
        } else
            return false;
    }

}
