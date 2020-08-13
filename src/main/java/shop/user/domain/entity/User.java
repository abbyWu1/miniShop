package shop.user.domain.entity;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 用户登录实体类
 */
@Repository
@Entity(name = "sys_user")//mybatis通用接口mapper依赖JPA实体类采用JPA
public class User implements Serializable {
    @Id
    private String id;
    private String name;
    private String account;
    private String password;
    private String loginStatus;
    private Date lastLoginTime;
    private String lastLoginIp;
    private Date registerTime;
    private String userType;
}
