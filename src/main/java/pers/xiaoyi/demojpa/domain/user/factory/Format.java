package pers.xiaoyi.demojpa.domain.user.factory;

import org.springframework.beans.BeanUtils;
import pers.xiaoyi.demojpa.domain.user.entity.UserDo;
import pers.xiaoyi.demojpa.domain.user.repository.po.User;

public class Format {

  public User toUserPo(UserDo userDo) {
    User userPo = new User();
    assert userDo != null;
    userPo.setUserId(userDo.getUserId());
    userPo.setUserAvatar(userDo.getUserAvatar());
    userPo.setUserEmail(userDo.getUserEmail());
    userPo.setUserUsername(userDo.getUserUsername());
    userPo.setUserDescription(userDo.getUserDescription());
    userPo.setCreateTime(userDo.getCreateTime());
    userPo.setUpdateTime(userDo.getUpdateTime());
    return userPo;
  }

  public UserDo toUserDo(User userPo) {
    UserDo userDo = new UserDo();
    if (userPo != null) {
      BeanUtils.copyProperties(userPo, userDo);
    }
    return userDo;
  }
}
