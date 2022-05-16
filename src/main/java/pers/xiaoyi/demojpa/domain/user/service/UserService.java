package pers.xiaoyi.demojpa.domain.user.service;

import pers.xiaoyi.demojpa.domain.user.entity.UserDo;

public interface UserService {

  UserDo findByUserUsername(String username);
}
