package com.lt.Entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
    private int id;
    private int type;
    private String number;
    private String data;
    private String time;
}
