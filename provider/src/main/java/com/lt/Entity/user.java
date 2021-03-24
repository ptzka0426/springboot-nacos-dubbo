package com.lt.Entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Date;

/**
 * @author LT
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@TableName("jcb_lottery_data")
public class user implements Serializable {
    //持久化参数
    private static final long serialVersionUID = -8447170587360305408L;
    @TableId
    @ApiModelProperty(value = "主键id")
    private int id;
    @ApiModelProperty(value = "类型")
    private int type;
    @ApiModelProperty(value = "数字")
    private String number;
    @ApiModelProperty(value = "data")
    private String data;
    @ApiModelProperty(value = "时间")
    private String time;
}
