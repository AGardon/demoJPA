package pers.xiaoyi.demojpa.domain.user.repository.po;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * @Description @Author AGarden @Date 2022-05-17 @Email w2603494062@gmail.com
 */
@Data
@Entity
public class User {

  /** 用户id,主键，字符串型 */
  @Id private String userId;

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
