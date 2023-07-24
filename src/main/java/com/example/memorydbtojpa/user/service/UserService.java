package com.example.memorydbtojpa.user.service;

import com.example.memorydbtojpa.user.db.UserRepository;
import com.example.memorydbtojpa.user.model.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    @Autowired
    private UserRepository userRepository;
    public UserEntity save(UserEntity user){

        // save
        return userRepository.save(user);
    }

    public List<UserEntity> findAll(){
        return userRepository.findAll();
    }

    public UserEntity find(Long id){
        return userRepository.findById(id).get();
    }

//    public void delete(Long id){
//        userRepository.delete(id);
//    }

    public List<UserEntity> filterScore(int min,int max){
        return userRepository.score(min,max);
//        return userRepository.findAllByScoreGreaterThanEqualAndScoreLessThanEqual(min,max);
    }
}
