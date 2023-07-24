package com.example.memorydbtojpa.user.contorller;

import com.example.memorydbtojpa.user.model.UserEntity;
import com.example.memorydbtojpa.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserApiController {

    private final UserService userService;

    @PutMapping("")
    public UserEntity create(
            @RequestBody UserEntity userEntity
    ){
        return userService.save(userEntity);
    }

    @GetMapping("/all")
    public List<UserEntity> findAll(){
        return userService.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
//        userService.delete(id);
    }

    @GetMapping("/find/{id}")
    public UserEntity find(@PathVariable Long id){
        return userService.find(id);
    }

    @GetMapping("/score")
    public List<UserEntity> filterScore(
            @RequestParam int min,
            @RequestParam int max
    ){
        return userService.filterScore(min,max);
    }

}
