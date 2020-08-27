package shop.user.domain.entity;


import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;


import java.io.Serializable;
import java.util.Date;

/**
 * 用户登录实体类
 */
@Data
@TableName(value = "sys_user")//mybatis通用接口mapper依赖JPA实体类采用JPA
public class User implements Serializable {
    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;
    private String name;
    private String account;
    private String password;
    @TableField(value = "login_status")
    private String loginStatus;
    // 注意！这里需要标记为填充字段
    @TableField(value = "last_login_time", fill = FieldFill.UPDATE)
    private Date lastLoginTime;
    @TableField(value = "last_login_ip")
    private String lastLoginIp;
    @TableField(value = "created_time", fill = FieldFill.INSERT)
    private Date createdTime;
    @TableField(value = "update_time", exist = true, fill = FieldFill.UPDATE)
    private Date updateTime;
    @TableField(value = "user_type")
    private String userType;
    @Version
    @TableField(fill = FieldFill.INSERT)
    private Integer version;
}
