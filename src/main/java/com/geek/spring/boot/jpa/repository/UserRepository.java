package com.geek.spring.boot.jpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.geek.spring.boot.jpa.domain.User;

/**
 * 用户仓库.
 *
 * @since 2017年9月12日 下午5:07:29
 * @author zhuyangyong
 */
public interface UserRepository extends CrudRepository<User, Long>{
}
