package com.yugwa.backend.global.token.repository;

import com.yugwa.backend.global.token.entity.RefreshTokenBlackList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RefreshTokenBlackListRepository extends JpaRepository<RefreshTokenBlackList, Long> {
    boolean existsByRefreshToken(String refreshToken);
}
