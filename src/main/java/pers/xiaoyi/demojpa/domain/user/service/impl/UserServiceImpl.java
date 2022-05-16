package pers.xiaoyi.demojpa.domain.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.xiaoyi.demojpa.domain.user.entity.UserDo;
import pers.xiaoyi.demojpa.domain.user.factory.Format;
import pers.xiaoyi.demojpa.domain.user.repository.persistence.UserRepository;
import pers.xiaoyi.demojpa.domain.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

  @Autowired UserRepository userRepository;

  Format format = new Format();

  @Override
  public UserDo findByUserUsername(String username) {
    return format.toUserDo(userRepository.findByUserUsername(username));
  }
}
