package code.java.registerAndLoginsSecurity.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "user", schema = "user_auth_test")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "user_id", nullable = false)
    private Integer id;

    @Column( nullable = false, length = 80)
    private String email;

    @Column(nullable = false,length = 64)
    private String password;

    @Column(nullable = false,length = 20)
    private String firstName;

    @Column( nullable = false,length = 20)
    private String lastName;

}
