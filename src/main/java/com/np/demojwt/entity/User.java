package com.np.demojwt.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serial;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("user")
public class User implements Serializable {
  
  @Serial
  private static final long serialVersionUID = 1L;
  
  @Id(keyType = KeyType.None)
  private String username;
  @JSONField(serialize = false) //不要序列化，但查询时正常查询
  private String password;
  private String usernick;
  
}
