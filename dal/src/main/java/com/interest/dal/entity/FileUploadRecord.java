package com.interest.dal.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author glk
 * @date 2023/3/13
 */
@Data
@EqualsAndHashCode()
@Accessors(chain = true)
@TableName("file_upload_record")
public class FileUploadRecord {

    private static final long serialVersionUID = 1L;

    /**
     * 平台id
     */
    @TableField("app_id")
    private Long id;

    /**
     * sys_user里的对应主键
     */
    @TableField("sys_user_id")
    private Long sysUserId;

    /**
     * 第三方应用唯一标识，如钉钉openid
     */
    @TableField("user_no")
    private String userNo;

}
