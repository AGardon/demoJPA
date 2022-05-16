package pers.xiaoyi.demojpa.application.facade;

import pers.xiaoyi.demojpa.domain.user.entity.UserDo;

public interface UserAppService {
  UserDo getUserByUsername(String username);
}
