package one.digitalinnovation.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

    private Long id;

    @NotEmpty(message = "Name must be informed.")
    @Size(min = 2, max = 100)
    private String firstName;

    @NotEmpty(message = "Last name must be informed.")
    @Size(min = 2, max = 100)
    private String lastName;

    @NotEmpty(message = "CPF cannot be left blank.")
    @CPF(message = "Invalid CPF.")
    private String cpf;

    private String birthDate;

    @NotEmpty(message = "At least one phone number must be informed.")
    @Valid
    private List<PhoneDTO> phones;
}
