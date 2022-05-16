package pers.xiaoyi.demojpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.xiaoyi.demojpa.application.assembler.Assembler;
import pers.xiaoyi.demojpa.application.facade.UserAppService;
import pers.xiaoyi.demojpa.application.vo.UserVo;

@RestController
public class UserCtrl {

  @Autowired private UserAppService userAppService;

  @Autowired Assembler assembler;

  @GetMapping("userTest")
  public UserVo userList(String username) {
    return assembler.toUserVo(userAppService.getUserByUsername(username));
  }
}
