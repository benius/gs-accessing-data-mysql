package hello;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

/**
 * <code></code>
 *
 * @author masonhsieh
 * @version 1.0
 */
// User another name as the table name because "user" is a reserved word for postgresql
@Entity(name = "s_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    @JsonProperty(value = "user-id")
    private Long id;

    @Column(name = "user_namne", nullable = false)
    @JsonProperty(value = "user-name")
    private String name;

    @Column(name = "user_email", nullable = false, unique = true)
    @JsonProperty(value = "user-email")
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
