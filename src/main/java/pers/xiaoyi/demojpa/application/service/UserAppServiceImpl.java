package pers.xiaoyi.demojpa.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pers.xiaoyi.demojpa.application.facade.UserAppService;
import pers.xiaoyi.demojpa.domain.user.entity.UserDo;
import pers.xiaoyi.demojpa.domain.user.service.UserService;

@Component
public class UserAppServiceImpl implements UserAppService {

  @Autowired UserService userService;

  @Override
  public UserDo getUserByUsername(String username) {
    return userService.findByUserUsername(username);
  }
}
