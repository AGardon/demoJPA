package pers.xiaoyi.demojpa.application.vo;

import lombok.Data;

import java.util.Date;

@Data
public class UserVo {

  /** 用户名 */
  private String userUsername;

  /** 用户昵称 */
  private String userNickname;

  /** 用户秘密 */
  private String userPassword;

  /** 当前用户的角色的id */
  private Integer userRoleId;

  /** 用户的头像地址 */
  private String userAvatar;

  /** 用户的自我描述 */
  private String userDescription;

  /** 用户邮箱 */
  private String userEmail;

  /** 用户手机号 */
  private String userPhone;

  /** 创建时间 */
  private Date createTime;

  /** 更新时间 */
  private Date updateTime;
}
