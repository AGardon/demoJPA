package pers.xiaoyi.demojpa.domain.user.repository.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import pers.xiaoyi.demojpa.domain.user.repository.po.User;

public interface UserRepository
    extends JpaRepository<User, String>, JpaSpecificationExecutor<User> {

  User findByUserUsername(String username);
}
