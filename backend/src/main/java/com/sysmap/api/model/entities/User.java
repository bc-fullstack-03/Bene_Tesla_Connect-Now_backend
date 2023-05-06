package com.sysmap.api.model.entities;

import java.util.UUID;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@Data
@Setter
@Getter
public class User {

  @Id
  private UUID id;  
  private String name;
  private String email;
  private String password;
  
  public User(String name, String email, String password) {
      this.id = UUID.randomUUID();
      this.name = name;
      this.email = email;
      this.password = password;      
  }

  public static User create(User user) {
    return new User(user.name, user.email, user.password);
  }

  public int getFollowers() {
    return 0;
  }

public void setFollowers(int i) {
}

}
