
package tech.schoolforautomation.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SignUp {


    private String firstname;
    private String lastname;
    private String password;
    private String email;
    private String phone;
    private String address;
}