package com.example.dockertest.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @author jayMamba
 * @date 2019/9/4
 * @time 15:56
 * @desc
 */

@TableName("admin")
public class User {
    @TableId("id")
    private String id;
    @TableField("account")
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
