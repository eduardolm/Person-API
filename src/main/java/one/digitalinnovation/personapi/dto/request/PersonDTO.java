package one.digitalinnovation.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.entity.Phone;
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

    @NotEmpty(message = "Nome é obrigatório!")
    @Size(min = 2, max = 100)
    private String firstName;

    @NotEmpty(message = "Sobrenome é obrigatório!")
    @Size(min = 2, max = 100)
    private String lastName;

    @NotEmpty(message = "CPF não pode ser deixado em branco.")
    @CPF(message = "CPF inválido.")
    private String cpf;

    private String birthDate;

    @NotEmpty(message = "Obrigatório informar pelo menos um telefone.")
    @Valid
    private List<Phone> phones;
}
