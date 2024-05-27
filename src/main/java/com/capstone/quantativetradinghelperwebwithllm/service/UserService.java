package com.capstone.quantativetradinghelperwebwithllm.service;

import com.capstone.quantativetradinghelperwebwithllm.model.User;
import com.capstone.quantativetradinghelperwebwithllm.model.entity.UserEntity;
import com.capstone.quantativetradinghelperwebwithllm.repository.UserEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserEntityRepository userEntityRepository;
    private final BCryptPasswordEncoder encoder;

    @Value("${jwt.secret-key}")
    private String secretKey;

    @Value("${jwt.token.expired-time-ms}")
    private Long expiredTimeMs;

    @Transactional
    public User join(String userName, String password) {
//        userEntityRepository.findByUserName(userName).ifPresent(it -> {
//            throw new SnsApplicationException(ErrorCode.DUPLICATED_USER_NAME, String.format("%s is duplicated", userName));
//        });
//
//        UserEntity userEntity = userEntityRepository.save(UserEntity.of(userName, encoder.encode(password)));
//        return User.fromEntity(userEntity);
    }

}
