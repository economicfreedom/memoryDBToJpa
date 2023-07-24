package com.example.memorydbtojpa.user.db;


import com.example.memorydbtojpa.user.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public interface UserRepository extends JpaRepository<UserEntity, Long> {


    // select * from user where score => ?

    public List<UserEntity> findAllByScoreGreaterThanEqualAndScoreLessThanEqual(int min,int max);
    // select * from user where score > ?

//    public List<UserEntity> findAllScoreGreaterThanEqual(int score);
//    public List<UserEntity> findAllScoreGreaterThan(int score);

    @Query(
            value = "select * from user u where u.score >= :min and u.score <= :max",
            nativeQuery = true
    )
    List<UserEntity> score(
           @Param(value = "min") int min,
           @Param(value = "max") int max);
}
