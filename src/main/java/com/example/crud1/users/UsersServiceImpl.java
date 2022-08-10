package com.example.crud1.users;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private final UsersRepo usersRepo;
    private final FinancialDetailsRepo financialDetailsRepo;

    public UsersServiceImpl(UsersRepo usersRepo, FinancialDetailsRepo financialDetailsRepo) {
        super();
        this.usersRepo = usersRepo;
        this.financialDetailsRepo = financialDetailsRepo;
    }

    @Override
    public List<UsersEntity> getAllUsers() {
        return usersRepo.findAll();
    }

    @Override
    public UsersEntity saveUsersDetails(UsersEntity userEntity) {
        System.out.println("----------------------------------------0");
        UsersEntity saveUser = usersRepo.save(userEntity);
        System.out.println("----------------------------------------1" + userEntity.getFinancialDetails().getUserId());
        userEntity.getFinancialDetails().setUserId(saveUser.getId());
        System.out.println("1" + userEntity.getFinancialDetails().getUserId());
        financialDetailsRepo.save(userEntity.getFinancialDetails());
        return saveUser;
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

    @Override
    public HashMap<Integer, String> getAllUsersIds() {
        List<UsersEntity> allRecords = usersRepo.findAll();
        HashMap<Integer, String> map = new HashMap<>();
        List newUserList = new ArrayList<>();
        allRecords.forEach(gravityScaleDetail -> {
            newUserList.add(gravityScaleDetail.getId());
            map.put(gravityScaleDetail.getId(), gravityScaleDetail.getUserName());
        });
        System.out.println("----------------------------------------------------------------" + map
                + "----------------------------------------------");
        return map;
        // return newUserList;
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
