package pers.xiaoyi.demojpa.application.assembler;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import pers.xiaoyi.demojpa.application.vo.UserVo;
import pers.xiaoyi.demojpa.domain.user.entity.UserDo;

@Component
public class Assembler {

  public UserVo toUserVo(UserDo userDo) {
    UserVo userVo = new UserVo();
    assert userDo != null;
    BeanUtils.copyProperties(userDo, userVo);
    return userVo;
  }
}
